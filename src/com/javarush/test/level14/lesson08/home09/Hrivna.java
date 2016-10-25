package com.javarush.test.level14.lesson08.home09;

/**
 * Created by spider on 24.01.16.
 */
public class Hrivna extends Money
{

    public Hrivna(double amount){
        super(amount);
    }
    @Override
    public String getCurrencyName()
    {
        return "HRN";
    }

    @Override
    public double getAmount()
    {
        return super.getAmount();
    }
}
