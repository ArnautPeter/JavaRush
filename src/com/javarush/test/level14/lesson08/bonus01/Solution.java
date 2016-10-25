package com.javarush.test.level14.lesson08.bonus01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
        try {
            int[] arr = {1,2};
            int a = arr[3];
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            FileInputStream input = new FileInputStream("c://1.txt");
        }
        catch (Exception e){
            exceptions.add(e);
        }

        try {
            List<Integer> list = new ArrayList<Integer>();
            int a = list.get(5);
        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String a = "rewt";
            int b = Integer.parseInt(a) / 12;
        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] arr = new int[-1];
        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object obj = null;
            obj.toString();
        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String str = "QWE";
            char ch = str.charAt(3);
        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object obj = new Solution();
            String str = (String) obj;

        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Solution solution = new Solution();
            solution.clone();
        }
        catch (Exception e) {
            exceptions.add(e);
        }
    }

}
