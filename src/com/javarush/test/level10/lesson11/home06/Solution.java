package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        public int age;
        public String name;
        public int weight;
        public String adress;
        public boolean sex;
        public int bootSize;

        public Human(String name){

        }
        Human(){

        }
        Human(int age, String name, String adress){

        }
        Human(String name, boolean sex){}
        Human(String name, String adress, boolean sex){}
        Human(String name, int bootSize){}
        Human(String name, String adress, int age){}
        Human(String name, int age, int weight){}
        Human(int weight){}
        Human(boolean sex){}
    }
}
