package com.javarush.test.level14.lesson08.home05;

/**
 * Created by spider on 12.01.16.
 */

public class Computer
{
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;


    public Computer()
    {
        mouse = new Mouse();
        keyboard = new Keyboard();
        monitor = new Monitor();
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }
}
