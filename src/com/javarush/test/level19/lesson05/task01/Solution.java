package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileReader fileReader = new FileReader(sc.next());
        FileWriter fileWriter = new FileWriter(sc.next());
        sc.close();
        while (fileReader.ready()) {
            fileReader.read();
            fileWriter.write(fileReader.read());
        }
        fileReader.close();
        fileWriter.close();
    }
}
