package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

public class Hippodrome {
    static ArrayList<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public static void main(String[] args) {

        game = new Hippodrome();
        Horse horse1 = new Horse("Orlick", 3, 1);
        Horse horse2 = new Horse("Gitara", 3, 1);
        Horse horse3 = new Horse("Bulat", 3, 1);
        game.horses.add(horse1);
        game.horses.add(horse2);
        game.horses.add(horse3);

        game.run();
    }

    public void move() {

        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void run() {

        for (int i = 0; i < 100; i++) {

            move();
            print();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void print() {

        for (Horse horse : horses) {
            horse.print();
        }
        System.out.println();
        System.out.println();
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }
}
