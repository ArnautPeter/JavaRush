package com.javarush.test.level14.lesson06.home01;

/**
 * Created by spider on 24.01.16.
 */
public class RussianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 24;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу "+ getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
