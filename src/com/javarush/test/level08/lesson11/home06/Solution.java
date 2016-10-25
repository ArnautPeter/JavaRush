package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> noChildren = new ArrayList<Human>();
        Human firstSon = new Human("Tom", true, 9, noChildren);
        System.out.println(firstSon.toString());
        Human secondSon = new Human("Sam", true, 11, noChildren);
        System.out.println(secondSon.toString());
        Human firstDoughter = new Human("Kate", false, 15, noChildren);
        System.out.println(firstDoughter.toString());
        ArrayList<Human> children1 = new ArrayList<Human>();
        children1.add(firstDoughter);
        children1.add(firstSon);
        children1.add(secondSon);

        Human father = new Human("Bob", true, 45, children1);
        System.out.println(father.toString());
        Human mother = new Human("Mila", false, 43, children1);
        System.out.println(mother.toString());

        ArrayList<Human> children2 = new ArrayList<Human>();
        children2.add(father);

        ArrayList<Human> children3 = new ArrayList<Human>();
        children3.add(mother);

        Human fathersGrandMother = new Human("Torry", false, 65, children2);
        Human fathersGrandFather = new Human("Nick", true, 70, children2);
        System.out.println(fathersGrandMother.toString());
        System.out.println(fathersGrandFather.toString());

        Human mothersGrandMother = new Human("Sierra", false, 62, children3);
        Human mothersGrandFather = new Human("Joch", true, 79, children3);
        System.out.println(mothersGrandMother.toString());
        System.out.println(mothersGrandFather.toString());
    }

    public static class Human
    {
        //напишите тут ваш код

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
