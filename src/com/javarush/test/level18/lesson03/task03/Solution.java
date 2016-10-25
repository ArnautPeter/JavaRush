package com.javarush.test.level18.lesson03.task03;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream file = new FileInputStream(sc.next());
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int currentByte;
        int tempValue;
        while (file.available() != 0) {
            currentByte = file.read();
            if(!map.containsKey(currentByte)) {
                map.put(currentByte, 1);
                continue;
            }
            tempValue = map.get(currentByte);
            map.put(currentByte, ++tempValue);
        }
        sc.close();
        file.close();
        int max = Integer.MIN_VALUE;
        for (int i : map.values()) {
            if (max < i) max = i;
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() == max)
                System.out.print(entry.getKey() + " ");
        }
    }
}