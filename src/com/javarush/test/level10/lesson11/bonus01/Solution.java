package com.javarush.test.level10.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку), помещает их в HashMap и выводит на экран содержимое HashMap.
*/

public class Solution {
    HashMap<Integer, String> map;
    Integer index;
    String name;

    public Solution() {
        this.map = new HashMap<Integer, String>();
        //map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*
        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);
        }
        */

        //String tempNum;
       // String name;
        int id;
        for (int i = 0; i < 10; i++)
        {
            //tempNum = reader.readLine();
            //if (tempNum.isEmpty()){break;}
            id = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            //if (name.isEmpty()){break;}
            solution.map.put(id, name);
        }

        Iterator<Map.Entry<Integer, String>> iterator = solution.map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<Integer, String> pair = iterator.next();
            Integer index = pair.getKey();
            String name1 = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name1);
        }
        /*
        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            int index = pair.getKey();
            String name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
        */
    }
}
