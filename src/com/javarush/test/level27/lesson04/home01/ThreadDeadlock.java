package com.javarush.test.level27.lesson04.home01;

public class ThreadDeadlock {
    Object data;
    synchronized public Object getData() {
        return data;
    }
}
