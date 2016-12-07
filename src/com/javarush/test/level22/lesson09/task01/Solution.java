package com.javarush.test.level22.lesson09.task01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws FileNotFoundException {

        StringBuilder list = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        Scanner reader = new Scanner(new FileReader(fileName));
        StringBuilder first;
        StringBuilder second;

        while (reader.hasNext()) {
            list.append(reader.next()).append(" ");
        }

        scanner.close();
        reader.close();
        Pair pair;
        System.out.println(list);
        String[] arr = list.toString().split(" ");
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i].equals(""))
                continue;
            for (int j = i + 1; j < arr.length; j++) {
                first = new StringBuilder(arr[i]);
                second = new StringBuilder(arr[j]);
                if(second.equals(""))
                    continue;
                if (first.reverse().toString().equals(second.toString())) {
                    pair = new Pair();
                    pair.first = first.reverse().toString();
                    pair.second = second.toString();
                    result.add(pair);
                    for(int k = j; k < arr.length; k++)
                        if(arr[k].equals(first.toString()) || arr[k].equals(first.reverse().toString()))
                            arr[k] = "";
                }
            }
        }

        for (Pair pair1 : result)
            System.out.println(pair1);
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
