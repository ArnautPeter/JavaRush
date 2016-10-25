package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by spider on 07.08.16.
 */
public class Singleton
{
    public static Singleton instance = null;

    private Singleton()
    {

    }

    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
