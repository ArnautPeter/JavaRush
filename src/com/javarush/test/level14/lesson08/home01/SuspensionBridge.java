package com.javarush.test.level14.lesson08.home01;

/**
 * Created by spider on 16.01.16.
 */
public class SuspensionBridge implements Bridge
{
    @Override
    public int getCarsCount()
    {
        return (int) Math.random();
    }
}
