package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
     //   System.out.print(s);

        //напишите тут ваш код

        char[] rez;
        rez = s.toCharArray();

        for (int i = 0; i < rez.length;){
            if (rez[i] == ' '){}
            else{
                if(i == 0){
                    rez[i] = Character.toUpperCase(rez[i]);
                }
                else{
                    if(rez[i - 1] == ' '){
                        rez[i] = Character.toUpperCase(rez[i]);
                    }
                }
            }
            i++;
        }

        for (int i = 0; i < rez.length; i++){
            System.out.print(rez[i]);
        }


    }


}
