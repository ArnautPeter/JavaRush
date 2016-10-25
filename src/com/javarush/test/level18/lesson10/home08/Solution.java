package com.javarush.test.level18.lesson10.home08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws FileNotFoundException
    {

        Scanner sc = new Scanner(System.in);
        String fileName = "";
        while (true) {
            fileName = sc.next();
            if(fileName.equals("exit"))
                return;
            new ReadThread(fileName);
        }
    }

    public static class ReadThread extends Thread {
        String fileName;
        FileInputStream fileInputStream;
        public ReadThread(String fileName) throws FileNotFoundException
        {
            //implement constructor body
            this.fileName = fileName;
            start();
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run()
        {
            int max = Integer.MIN_VALUE;
            Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
            int currentByte = 0;
            int tempValue;
            try
            {
                fileInputStream = new FileInputStream(this.fileName);
                while (fileInputStream.available() > 0) {
                    currentByte = fileInputStream.read();
                    if (!tempMap.containsKey(currentByte))
                        tempMap.put(currentByte, 1);
                    else
                    {
                        tempValue = tempMap.get(currentByte);
                        tempMap.put(currentByte, ++tempValue);
                    }
                }
                for (Map.Entry<Integer, Integer> entry : tempMap.entrySet()) {
                    if (entry.getValue() > max)
                        max = entry.getValue();
                }
                synchronized (resultMap)
                {
                    resultMap.put(fileName, max);
                }
                fileInputStream.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
    }
}
