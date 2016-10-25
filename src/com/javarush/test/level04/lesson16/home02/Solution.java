package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)){
            System.out.println(num1);
        }
        else{
            if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)){
                System.out.println(num2);
            }
            else
                System.out.println(num3);
        }
    }
}
