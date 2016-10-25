package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
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
        int tmpByte;
        while (fileReader.ready()) {
            tmpByte = fileReader.read();
            if (tmpByte == 46)
                tmpByte = 33;
            fileWriter.write(tmpByte);
        }
        sc.close();
        fileReader.close();
        fileWriter.close();
    }
}
