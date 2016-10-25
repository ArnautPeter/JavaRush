package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        sc.close();
        System.out.println(findWorldInFile(fileName));
    }

    static int findWorldInFile(String fileName) throws IOException {
        int count = 0;
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            String[] tempArr = reader.readLine().split("[., !?;:-]");
            for (String tmp : tempArr) {
                if (tmp.equals("world"))
                    count++;
            }
        }
        reader.close();
        return count;
    }
}
