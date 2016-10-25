package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        FileInputStream file = new FileInputStream(sc.next());
        List<Integer> list = new ArrayList<Integer>();
        int temp;
        sc = new Scanner(file);
        while (sc.hasNext()) {
            temp = Integer.parseInt(sc.next());
            if (temp % 2 == 0)
                list.add(temp);

        }
        Collections.sort(list);
        for (int ch : list) {
            System.out.println(ch);
        }
    }
}
