package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{

    public static void main(String[] args) {
        Map<String, Date> map = createMap();
        removeAllSummerPeople((HashMap<String, Date>) map);
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stark", new Date("JULY 1 1980"));
        map.put("Cooper", new Date("FEBRUARY 1 1980"));
        map.put("Arnaut", new Date("JUNE 1 1980"));
        map.put("Parker", new Date("JUNE 1 1980"));
        map.put("Superman", new Date("OCTOBER 1 1980"));
        map.put("Noris", new Date("JUNE 1 1980"));
        map.put("Smith", new Date("JUNE 1 1980"));
        map.put("Pitbull", new Date("OCTOBER 1 1980"));
        map.put("Bond", new Date("JUNE 1 1980"));

        //напишите тут ваш код

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код

        for(Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext();) {
            Map.Entry<String, Date> pair = it.next();
            if(pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7) {
                it.remove();
            }
        }

    }
}
