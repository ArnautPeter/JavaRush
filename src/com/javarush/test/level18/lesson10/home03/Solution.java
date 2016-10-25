package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        Scanner sc = new Scanner(System.in);
        FileOutputStream fileOutputStream = new FileOutputStream(sc.next());
        FileInputStream fileInputStream = new FileInputStream(sc.next());
        FileInputStream fileInputStream1 = new FileInputStream(sc.next());
        while (fileInputStream.available() > 0) {
            fileOutputStream.write(fileInputStream.read());
        }
        while (fileInputStream1.available() > 0) {
            fileOutputStream.write(fileInputStream1.read());
        }
        fileInputStream.close();
        fileInputStream1.close();
        fileOutputStream.close();
        sc.close();
    }
}
