package com.javarush.test.level18.lesson03.task02;

import java.io.FileInputStream;
import java.util.Scanner;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileInputStream inputStream = new FileInputStream(scanner.next());

        int min = Integer.MAX_VALUE;
        int currentByte;
        while (inputStream.available() != 0) {
            currentByte = inputStream.read();
            if (currentByte < min)
                min = currentByte;
        }

        System.out.println(min);
    }
}
