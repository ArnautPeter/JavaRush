package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = bufferedReader.readLine();
        String secondFile = bufferedReader.readLine();
        List<Integer> tempList = new LinkedList<>();

        InputStream inputStream = new FileInputStream(secondFile);
        while (inputStream.available() > 0) {
            tempList.add(inputStream.read());
        }

        InputStream inputStream2 = new FileInputStream(firstFile);
        while (inputStream2.available() > 0) {
            tempList.add(inputStream2.read());
        }

        OutputStream outputStream = new FileOutputStream(firstFile);

        for (int data : tempList) {
            outputStream.write(data);
        }

        bufferedReader.close();
        inputStream.close();
        outputStream.close();
        inputStream2.close();
    }
}
