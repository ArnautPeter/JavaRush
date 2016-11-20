package com.javarush.test.level22.lesson18.big01;

public class Tetris {

    Field field;
    Figure figure;

    public static Tetris game;

    public static void main(String[] args) {

        game = new Tetris();
        game.run();
    }

    public void run() {

    }

    public void step() {

    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }


}
