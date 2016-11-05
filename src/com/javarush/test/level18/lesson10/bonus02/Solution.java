package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        if (args[0].equals("-c")) {

            Scanner sc = new Scanner(System.in);
            String fileName = sc.next();
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String lastString = "";

            while (reader.ready()) {
                lastString = reader.readLine();
            }
            if (lastString.isEmpty())
                return;

            String lastID = lastString.substring(0, 8).trim();
            int nextID = (Integer.parseInt(lastID)) + 1;
            lastID = String.valueOf(nextID);

            if (lastID.length() > 8)
                lastID = lastID.substring(0, 8);
            else if (lastID.length() < 8)
                for (int i = lastID.length(); i < 8; i++)
                    lastID += " ";

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            String productName = args[1];
            if (productName.length() > 30)
                productName = productName.substring(0, 30);
            else if (productName.length() < 30)
                for (int i = productName.length(); i < 30; i++)
                    productName += " ";


            String price = args[2];
            if (price.length() > 8)
                price = price.substring(0, 8);
            else if (price.length() < 8)
                for (int i = price.length(); i < 8; i++)
                    price += " ";


            String quantity = args[3];
            if (quantity.length() > 4)
                quantity = quantity.substring(0, 4);
            else if (quantity.length() < 4)
                for (int i = quantity.length(); i < 4; i++)
                    quantity += " ";


            writer.write('\n');
            writer.write(lastID);
            writer.write(productName);
            writer.write(price);
            writer.write(quantity);
            sc.close();
            reader.close();
            writer.close();
        }
    }
}
