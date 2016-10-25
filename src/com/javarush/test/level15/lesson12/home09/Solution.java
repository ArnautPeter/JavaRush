package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strings = str.split("\\?");
        String[] strings1 = strings[1].split("&");
        String obj = "";
        for (String temp : strings1) {
            String[] tempArr = temp.split("=");
            if (tempArr[0].equals("obj"))
                obj = tempArr[1];
            System.out.print(tempArr[0] + " ");
        }
        System.out.println();
        try {
            if(!obj.equals(""))
            alert(Double.parseDouble(obj));
        } catch (NumberFormatException e) {
            alert(obj);
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
