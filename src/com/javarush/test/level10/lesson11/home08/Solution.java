package com.javarush.test.level10.lesson11.home08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() throws IOException
    {
        //напишите тут ваш код
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String>[] listOfLists = new ArrayList[3];
        for(int i = 0; i < 3; i++)
        {
            ArrayList<String> list = new ArrayList<String>();
            for (int k = 0; k < 4; k++)
            {
                list.add("qqq" + i);
            }
            listOfLists[i] = list;
        }

        return listOfLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}