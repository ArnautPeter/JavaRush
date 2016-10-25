package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        Scanner sc = new Scanner(System.in);
        String firstFile = sc.next();
        String secondFile = sc.next();
        BufferedReader first = new BufferedReader(new FileReader(firstFile));
        BufferedReader second = new BufferedReader(new FileReader(secondFile));
        String strFirst = "";
        while (second.ready()) {
            strFirst = strFirst + second.readLine();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(secondFile));
        while (first.ready()) {
            bufferedWriter.write(first.readLine());
        }
        bufferedWriter.write(strFirst);
        first.close();
        second.close();
        bufferedWriter.close();
        sc.close();
    }
}
