package com.javarush.test.level19.lesson10.home04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words
Закрыть потоки. Не использовать try-with-resources

Пример: words содержит слова А, Б, В
Строки:
В Б А Д  //3 слова из words, не подходит
Д А Д    //1 слово из words, не подходит
Д А Б Д  //2 слова - подходит, выводим
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String tempLine;
        String[] list;
        int count = 0;
        while (reader.ready()) {
            tempLine = reader.readLine();
            list = tempLine.split(" ");
            for (int i = 0; i < words.size(); i++) {
                for (String str : list) {
                    if (str.equals(words.get(i)))
                        count++;
                }
            }
            if (count == 2)
                System.out.println(tempLine);
            count = 0;
        }
        sc.close();
        reader.close();
    }
}
