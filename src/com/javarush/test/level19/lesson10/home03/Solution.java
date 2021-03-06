package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String str;
        Calendar birthday = new GregorianCalendar();
        int year, month, day;
        String[] tempArr;
        while (reader.ready()) {
            str = reader.readLine();
            tempArr = str.split(" ");
            year = Integer.parseInt(tempArr[tempArr.length - 1]);
            month = Integer.parseInt(tempArr[tempArr.length - 2]);
            day = Integer.parseInt(tempArr[tempArr.length - 3]);
            String name = new String();
            for (int i = 0; i < tempArr.length - 3; i++) {
                name += tempArr[i] + " ";
            }
            birthday.set(year, month - 1, day);
            PEOPLE.add(new Person(name.trim(), birthday.getTime()));
        }
        reader.close();
    }
}
