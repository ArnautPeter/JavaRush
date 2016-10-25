package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < arr1.length; i++){
            arr2[arr1.length - i - 1] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){

            System.out.println(arr2[i]);
        }

    }
}
