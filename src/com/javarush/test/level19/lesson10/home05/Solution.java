package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
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
        while (sc.hasNext()) {
            currentWord = sc.next();
            if(findNumbers(currentWord)) {
                bufferedWriter.write(currentWord);
                bufferedWriter.write(" ");
            }
        }
        sc.close();
        bufferedWriter.close();
    }

    public static boolean findNumbers(String str) {
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if (Character.isDigit(ch))
                return true;
        }
        return false;
    }
}
