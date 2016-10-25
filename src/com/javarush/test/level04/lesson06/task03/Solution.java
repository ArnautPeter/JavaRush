package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        int b = vvod.nextInt();
        int c = vvod.nextInt();
        if (a > b && a > c)
            if (b > c)
                System.out.print(a + " " + b + " " + c);
            else
                System.out.print(a + " " + c + " " + b);
        if (b > a && b > c)
            if (a > c)
                System.out.print(b + " " + a + " " + c);
            else
                System.out.print(b + " " + c + " " + c);

        if (c > b && c > a)
            if (b > a)
                System.out.print(c + " " + b + " " + a);
            else
                System.out.print(c + " " + a + " " + b);


    }
}
