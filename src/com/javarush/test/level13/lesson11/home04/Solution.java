package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileOutputStream outputStream = new FileOutputStream(sourceFileName);
        FileInputStream inputStream = new FileInputStream(sourceFileName);

        String s = null;

        while (true){

            s =reader.readLine();
            if (!s.equals("exit")){
                outputStream.write(s.getBytes());
                outputStream.write('\n');
            }
            else {
                outputStream.write(s.getBytes());
                outputStream.write('\n');
                outputStream.close();
                break;
            }
        }
        while (inputStream.available() > 0){
            int data = inputStream.read();
            System.out.print((char) data);
        }
        inputStream.close();

    }
}
