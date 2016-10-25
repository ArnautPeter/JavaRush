package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "Qwe";
        Zerg zerg2 = new Zerg();
        zerg2.name = "sd";
        Zerg zerg3 = new Zerg();
        zerg3.name = "adad";
        Zerg zerg4 = new Zerg();
        zerg4.name = "xvfd";
        Zerg zerg5 = new Zerg();
        zerg5.name = "faasdf";
        Zerg zerg6 = new Zerg();
        zerg6.name = "werdf";
        Zerg zerg7 = new Zerg();
        zerg7.name = "sdf";
        Zerg zerg8 = new Zerg();
        zerg8.name = "fsfwr";
        Zerg zerg9 = new Zerg();
        zerg9.name = "fsdfw3r";
        Zerg zerg10 = new Zerg();
        zerg10.name = "gjfgyre";

        Protos protos1 = new Protos();
        protos1.name = "dasdasda";
        Protos protos2 = new Protos();
        protos2.name = "gfjghjgfhj";
        Protos protos3 = new Protos();
        protos3.name = "fghjghjgfjgfj";
        Protos protos4 = new Protos();
        protos4.name = "fgjjgyry546456";
        Protos protos5 = new Protos();
        protos5.name = "gj567gjhjfg";

        Terran terran1 = new Terran();
        terran1.name = "54";
        Terran terran2 = new Terran();
        terran2.name = "123";
        Terran terran3 = new Terran();
        terran3.name = "235235";
        Terran terran4 = new Terran();
        terran4.name = "2346";
        Terran terran5 = new Terran();
        terran5.name = "65877";
        Terran terran6 = new Terran();
        terran6.name = "67456nn";
        Terran terran7 = new Terran();
        terran7.name = "fgh45646646";
        Terran terran8 = new Terran();
        terran8.name = "35bb";
        Terran terran9 = new Terran();
        terran9.name = "hdf564bdfg";
        Terran terran10 = new Terran();
        terran10.name = "fh5345523";
        Terran terran11 = new Terran();
        terran11.name = "fgh45345 b5";
        Terran terran12 = new Terran();
        terran12.name = "355nncbcb";


    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}