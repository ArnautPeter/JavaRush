package com.javarush.test.level19.lesson10.home08;

/* Перевертыши
1 Считать с консоли имя файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке
2.2 вывести на экран
3 Закрыть потоки. Не использовать try-with-resources

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String str;
        String rts;
        while (reader.ready()) {
            str = reader.readLine();
            rts = new StringBuilder(str).reverse().toString();
            System.out.println(rts);
        }
        sc.close();
        reader.close();
    }
}
