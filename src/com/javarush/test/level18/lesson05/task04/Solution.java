package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try
        {
            FileInputStream fileInputStream = new FileInputStream(sc.next());
            FileOutputStream fileOutputStream = new FileOutputStream(sc.next());
            ArrayList<Integer> list = new ArrayList<Integer>();
            while (fileInputStream.available() > 0) {
                list.add(fileInputStream.read());
            }
            int[] arr = new int[list.size()];
            int index = 0;
            for (Integer obj : list) {
                arr[index] = obj;
                index++;
            }
            for(int i = arr.length - 1; i > -1; i--) {
                fileOutputStream.write(arr[i]);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        sc.close();
    }
}
