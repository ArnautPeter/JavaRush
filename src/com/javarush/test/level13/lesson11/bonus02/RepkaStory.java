package com.javarush.test.level13.lesson11.bonus02;

import java.util.List;

public class RepkaStory
{
    static void tell(List<Person> items) {

        Person first;
        Person second;
        for (int i = items.size() - 2; i > -1; i--) {
            first = items.get(i + 1);
            second = items.get(i);
            //second.pull(first);

            System.out.println(first.pull(second));
        }
    }
}
