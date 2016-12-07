package com.javarush.test.level26.lesson15.big01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void  writeMessage(String message){
        System.out.println(message);
    }
    public static String readString()
    {
        String s = "";
        try {s = bufferedReader.readLine();}
        catch (IOException e) {}
        return s;
    }
}
