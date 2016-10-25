package com.javarush.test.level14.lesson06.home01;

/**
 * Created by spider on 24.01.16.
 */
public class MoldovanHen extends Hen implements Country
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 22;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу "+ getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
