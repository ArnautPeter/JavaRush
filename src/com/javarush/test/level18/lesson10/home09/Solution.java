package com.javarush.test.level18.lesson10.home09;

/* Файлы и исключения
Читайте с консоли имена файлов
Если файла не существует (передано неправильное имя файла), то
перехватить исключение FileNotFoundException, вывести в консоль переданное неправильное имя файла и завершить работу программы.
Закрыть потоки. Не использовать try-with-resources
Не используйте System.exit();
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String fileName ="";
        FileInputStream file;

        while (true)
        {
            fileName = sc.next();
            try
            {
                file = new FileInputStream(fileName);
                file.close();

            }
            catch (FileNotFoundException e)
            {
                sc.close();
                System.out.println(fileName);
                return;
            }
        }
    }
}
