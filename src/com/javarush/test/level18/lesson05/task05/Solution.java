package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки
2.2 выбросить исключение DownloadException
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException
    {

        Scanner scanner = new Scanner(System.in);
        FileInputStream file;
        byte[] buffer = new byte[1000];
        while(true) {
            file = new FileInputStream(scanner.next());
            if(file.read(buffer) != 1000) {
                scanner.close();
                file.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception{

        DownloadException() {
            super("less then 1000 bytes");
        }
    }
}
