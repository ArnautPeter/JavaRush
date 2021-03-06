package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        FileReader reader = new FileReader(args[0]);
        int currentByte = 0;
        int currentCount = 1;
        while (reader.ready()) {
            currentByte = reader.read();
            if (map.containsKey(currentByte)) {
                currentCount = map.get(currentByte);
                map.put(currentByte, ++currentCount);
            } else {
                map.put(currentByte, currentCount);
            }
            currentCount = 1;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int i = entry.getKey();
            System.out.println(((char) i) + " " + entry.getValue());
        }
        reader.close();
    }
}
