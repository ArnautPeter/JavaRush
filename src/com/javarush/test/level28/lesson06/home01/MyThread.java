package com.javarush.test.level28.lesson06.home01;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {

    public static AtomicInteger priorityCounter = new AtomicInteger(0);

    public MyThread() {
        super();
        setMyPriority();
    }

    public MyThread(Runnable target) {
        super(target);
        setMyPriority();

    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        setMyPriority();
    }

    public MyThread(String name) {
        super(name);
        setMyPriority();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        priorityCounter.set(priorityCounter.get() % 10 + 1);
        if (priorityCounter.get() <= group.getMaxPriority())
            setPriority(priorityCounter.get());
        else
            setPriority(group.getMaxPriority());
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        setMyPriority();

    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        setMyPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        setMyPriority();
    }

    private void setMyPriority() {
        priorityCounter.set(priorityCounter.get() % 10 + 1);
        setPriority(priorityCounter.get());
    }
}
