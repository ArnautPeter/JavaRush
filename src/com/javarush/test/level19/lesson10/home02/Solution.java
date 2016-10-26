package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String, Float> map = new HashMap<String, Float>();
        String[] tempArr;
        float tempValue;
        while (reader.ready()) {
            tempArr = reader.readLine().split(" ");
            if (map.containsKey(tempArr[0])) {
                tempValue = map.get(tempArr[0]) + Float.parseFloat(tempArr[1]);
                map.put(tempArr[0], tempValue);
            }
            map.put(tempArr[0], Float.parseFloat(tempArr[1]));
        }
        float maxValue = Float.MIN_VALUE;
        for (float value : map.values()) {
            if (value > maxValue)
                maxValue = value;
        }
        for (Map.Entry<String, Float> temp : map.entrySet()) {
            if (temp.getValue() == maxValue)
                System.out.println(temp.getKey());
        }
        reader.close();
    }
}
