package com.javarush.test.level28.lesson08.task01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* Знакомство с Executors
1. В методе main создай фиксированный пул из 5 трэдов используя класс Executors.
2. В цикле отправь на исполнение в пул 10 тасок Runnable.
3. У каждой таски в методе run вызови метод doExpensiveOperation с порядковым номером таски начиная с 1, см. пример вывода
4. Запрети добавление новых тасок на исполнение в пул (метод shutdown)
5. Дай экзэкьютору 5 секунд на завершение всех тасок (метод awaitTermination и параметр TimeUnit.SECONDS)
Не должно быть комментариев кроме приведенного output example
*/
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            service.submit(new Runnable() {
                @Override
                public void run() {
                    doExpensiveOperation(index);
                }
            });
        }
        service.shutdown();
        service.awaitTermination(5, TimeUnit.SECONDS);
    }

    private static void doExpensiveOperation(int localId) {
        System.out.println(Thread.currentThread().getName() + ", localId=" + localId);
    }
}
