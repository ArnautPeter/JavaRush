package com.javarush.test.level18.lesson03.task05;

import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream file = new FileInputStream(sc.next());
        Set<Integer> set = new HashSet<Integer>();
        int temp = 0;
        while (file.available() > 0) {
            set.add(file.read());
        }
        int[] arr = new int[set.size()];
        for (int i : set){
            arr[temp] = i;
            temp++;
        }
        sc.close();
        file.close();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
