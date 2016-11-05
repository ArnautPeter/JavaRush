package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args[0].equals("-u")) {
            Scanner sc = new Scanner(System.in);
            String fileName = sc.next();
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String currentLine = "";
            String currentID = "";
            List<String> list = new ArrayList<String>();
            while (reader.ready()) {
                currentLine = reader.readLine();
                currentID = currentLine.substring(0, 8).trim();
                if (!currentID.equals(args[1]))
                    list.add(currentLine);
                else {
                    list.add(prepareString(currentID, args[2], args[3], args[4]));
                }
            }
            writeArrayToFile(fileName, list);
            sc.close();
            reader.close();
        }
        if (args[0].equals("-d")) {
            Scanner sc = new Scanner(System.in);
            String fileName = sc.next();
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String currentLine = "";
            String currentID = "";
            List<String> list = new ArrayList<String>();
            while (reader.ready()) {
                currentLine = reader.readLine();
                currentID = currentLine.substring(0, 8).trim();
                if (!currentID.equals(args[1]))
                    list.add(currentLine);
                else
                    continue;
            }
            writeArrayToFile(fileName, list);
            sc.close();
            reader.close();
        }
    }


    private static void writeArrayToFile(String fileName, List<String> list) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (String line : list) {
            writer.write(line);
            writer.write('\n');
        }
        writer.close();
    }

    private static String prepareString(String currentID, String productName, String price, String quantity) {

        if (currentID.length() > 8)
            currentID = currentID.substring(0, 8);
        else if (currentID.length() < 8)
            for (int i = currentID.length(); i < 8; i++)
                currentID += " ";

        if (productName.length() > 30)
            productName = productName.substring(0, 30);
        else if (productName.length() < 30)
            for (int i = productName.length(); i < 30; i++)
                productName += " ";


        if (price.length() > 8)
            price = price.substring(0, 8);
        else if (price.length() < 8)
            for (int i = price.length(); i < 8; i++)
                price += " ";

        if (quantity.length() > 4)
            quantity = quantity.substring(0, 4);
        else if (quantity.length() < 4)
            for (int i = quantity.length(); i < 4; i++)
                quantity += " ";

        return currentID + productName + price + quantity;
    }
}