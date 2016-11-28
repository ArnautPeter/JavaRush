package com.javarush.test.level17.lesson10.bonus01;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }


    public static void main(String[] args) throws ParseException, IOException {
        //start here - начни тут
        if ("-c".equals(args[0]) && args.length == 4)
            addUser(args);
        if ("-u".equals(args[0]) && args.length == 5)
            editUser(args);
        if ("-d".equals(args[0]) && args.length == 2)
            deleteUser(Integer.parseInt(args[1]));
        if ("-i".equals(args[0]) && args.length == 2)
            printUser(Integer.parseInt(args[1]));

    }

    private static void addUser(String[] args) throws ParseException, IOException {

        Date bd = null;
        try
        {
            bd = dateFormat.parse(args[3]);
        }
        catch (ParseException e) {System.out.println("Wrong date");}
        if(args[2].equals("м"))
            allPeople.add(Person.createMale(args[1], bd));
        else if(args[2].equals("ж"))
            allPeople.add(Person.createFemale(args[1], bd));
        else throw new IOException("Wrong data");
        System.out.println("id= " + (allPeople.size()-1));
    }

    private static void editUser(String[] args) throws ParseException {
        int id = Integer.parseInt(args[1]);
        String name = args[2];
        String sex = args[3];
        Date date = dateFormat.parse(args[4]);
        allPeople.get(id).setName(name);
        if ("м".equals(sex))
            allPeople.get(id).setSex(Sex.MALE);
        else
            allPeople.get(id).setSex(Sex.FEMALE);
        allPeople.get(id).setBirthDay(date);
    }

    private static void deleteUser(int id) {
        allPeople.get(id - 1).setBirthDay(null);
        allPeople.get(id - 1).setName("");
        allPeople.get(id - 1).setSex(null);
    }

    private static void printUser(int id) {
        Person person = allPeople.get(id);
        String sex;
        if(person.getSex().equals(Sex.FEMALE))
            sex = "ж";
        else sex = "м";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        System.out.println(person.getName()+" " + sex + " " + dateFormat.format(person.getBirthDay()));
    }
}