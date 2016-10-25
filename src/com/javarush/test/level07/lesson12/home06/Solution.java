package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandFather1 = new Human();
        grandFather1.name = "Вася";
        grandFather1.sex = true;
        grandFather1.age = 65;

        Human grandFather2 = new Human();
        grandFather2.name = "Гриша";
        grandFather2.sex = true;
        grandFather2.age = 70;

        Human grandMother1 = new Human();
        grandMother1.name = "Аня";
        grandMother1.sex = false;
        grandMother1.age = 56;

        Human grandMother2 = new Human();
        grandMother2.name = "Яна";
        grandMother2.sex = false;
        grandMother2.age = 61;

        Human mother = new Human();
        mother.name = "Оксана";
        mother.sex = false;
        mother.age = 25;
        mother.mother = grandMother1;
        mother.father = grandFather1;

        Human father = new Human();
        father.name = "Игорь";
        father.sex = true;
        father.age = 28;
        father.mother = grandMother2;
        father.father = grandFather2;

        Human childre1 = new Human();
        childre1.name = "Аня";
        childre1.age = 12;
        childre1.sex = false;
        childre1.father = father;
        childre1.mother = mother;

        Human childre2 = new Human();
        childre2.name = "Коля";
        childre2.age = 8;
        childre2.sex = true;
        childre2.father = father;
        childre2.mother = mother;

        Human childre3 = new Human();
        childre3.name = "Вика";
        childre3.age = 11;
        childre3.sex = false;
        childre3.father = father;
        childre3.mother = mother;

        System.out.println(childre1.toString());
        System.out.println(childre2.toString());
        System.out.println(childre3.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(grandFather1.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother2.toString());
    }

    public static class Human
    {
        //напишите тут ваш код
        String name = null;
        Boolean sex = true;
        int age = 0;
        Human father = null;
        Human mother = null;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
