package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());



        if (a > b){
            while (b != 0){
                int temp = a % b;
                a = b;
                b = temp;
            }
            System.out.println(a);
        }
        else{
            while (a != 0){
                int temp = b % a;
                b = a;
                a = temp;
            }
            System.out.println(b);
        }
    }
}
