package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        FileInputStream file = new FileInputStream(sc.next());
        int count = 0;
        while (file.available() > 0) {
            if(file.read() == 44)
                count++;
        }
        sc.close();
        file.close();
        System.out.println(count);
    }
}
