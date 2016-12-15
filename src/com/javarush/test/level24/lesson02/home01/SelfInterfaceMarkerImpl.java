package com.javarush.test.level24.lesson02.home01;

public class SelfInterfaceMarkerImpl implements SelfInterfaceMarker {

    public SelfInterfaceMarkerImpl() {
    }

    public void method1() {
        method2();
    }

    public void method2() {
        method1();
    }
}
