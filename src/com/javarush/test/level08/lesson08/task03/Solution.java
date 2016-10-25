package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код

        Map<String, String> dic = new HashMap<String, String>();
        dic.put("Ivanov", "Ivan");
        dic.put("Petrov", "Pavel");
        dic.put("Sokolova", "Sveta");
        dic.put("Ivanovic", "Ivan");
        dic.put("Dmitriev", "Max");
        dic.put("123", "123");
        dic.put("456", "456");
        dic.put("Smirnov", "Kirill");
        dic.put("Ivanova", "Anna");
        dic.put("Privet", "Ivan");

        return (HashMap<String, String>)dic;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String name1 = pair.getValue();
            if(name.equals(name1)){count++;}
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String name1 = pair.getKey();
            if(familiya.equals(name1)){count++;}
        }

        return count;

    }
    public static void main(String[] args)
    {
        createMap();
        System.out.println(getCountTheSameFirstName(createMap(), "123"));
        System.out.println(getCountTheSameLastName(createMap(), "Ivanov"));
    }
}
