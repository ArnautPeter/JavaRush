package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;


public class Solution {
    public static void main(String[] args) throws IOException
    {
        String sc = args[0];
        FileInputStream file = null;
        int count = 0;
        int tempByte;

        file = new FileInputStream(sc);
        while (file.available() > 0) {
            tempByte = file.read();
            if (
                    (tempByte > 96 && tempByte < 123))
                count++;
        }
        file.close();
        System.out.println(count);
    }
}
