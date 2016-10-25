package com.javarush.test.level08.lesson11.bonus01;

import com.sun.org.apache.xerces.internal.impl.dv.xs.MonthDayDV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("August");
        list.add("September");
        list.add("October");
        list.add("November");
        list.add("December");

        String mouth = reader.readLine();
        Boolean flag = false;

        for (int i = 0; i < list.size(); i++){
            if (mouth.equals(list.get(i))){
                System.out.println(mouth + " is " + (i + 1) + " mouth");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("error");
        }
    }

}
