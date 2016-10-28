package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader(args[0]));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));
        String currentWord;
        int count = 0;
        while (sc.hasNext()) {
            currentWord = sc.next();
            if (currentWord.length() > 6) {
                if (count > 0)
                    bufferedWriter.write(",");
                bufferedWriter.write(currentWord);
                count++;
            }
        }
        sc.close();
        bufferedWriter.close();
    }
}
