package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    private static volatile int eKey = 9;

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(args[1]);
        FileWriter writer = new FileWriter(args[2]);
        if (args[0].equals("-e")) {
            while (reader.ready()) {
                writer.write(reader.read() + eKey);
            }
        }
        if (args[0].equals("-d")) {
            while (reader.ready()) {
                writer.write(reader.read() - eKey);
            }
        }
        reader.close();
        writer.close();
    }
}
