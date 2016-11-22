package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner scanner;

        PersonScannerAdapter(Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException {

            String[] personInfo = scanner.nextLine().split(" ");
            Calendar date = new GregorianCalendar(Integer.parseInt(personInfo[5]),
                    Integer.parseInt(personInfo[4]) - 1,
                    Integer.parseInt(personInfo[3]));

            Person person = new Person(personInfo[1], personInfo[2], personInfo[0], date.getTime());
            return person;
        }

        @Override
        public void close() throws IOException {
            this.scanner.close();
        }
    }
}
