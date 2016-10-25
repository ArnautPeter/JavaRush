package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(sc.next());
        FileOutputStream fileOutputStream1 = new FileOutputStream(sc.next());
        FileOutputStream fileOutputStream2 = new FileOutputStream(sc.next());
        int count = 0;
        try
        {
            while (fileInputStream.available() > 0) {
                fileInputStream.read();
                count++;
            }
            if (count % 2 > 0) {
                for(int i = 0; i < count / 2 + 1; i++){
                    fileOutputStream1.write(fileInputStream.read());
                }
                for(int i = count / 2 + 1; i < count; i++) {
                    fileOutputStream2.write(fileInputStream.read());
                }
            }
            else {
                for(int i = 0; i < count / 2; i++){
                    fileOutputStream1.write(fileInputStream.read());
                }
                for(int i = count / 2; i < count; i++) {
                    fileOutputStream2.write(fileInputStream.read());
                }
            }
            fileInputStream.close();
            fileOutputStream1.close();
            fileOutputStream2.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        sc.close();
    }
}
