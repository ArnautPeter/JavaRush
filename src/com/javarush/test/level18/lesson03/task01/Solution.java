package com.javarush.test.level18.lesson03.task01;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        FileInputStream inputStream = new FileInputStream(scanner.next());

        int max = 0;
        int currentByte;
        while (inputStream.available() != 0) {
            currentByte = inputStream.read();
            if (currentByte > max)
                max = currentByte;
        }

        System.out.println(max);
    }
}
