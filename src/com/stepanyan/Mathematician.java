package com.stepanyan;

public class Mathematician {

    public int x;
    public int y;

    public Mathematician(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Mathematician() {
    }

    public static int addition (int x, int y) {
        return x + y;
    }

    public static int subtraction (int x, int y) {
        return x - y;
    }

    public static int multiplication (int x, int y) {
        return x * y;
    }

    public static double division (int x, int y) {
        return (double) x / y;
    }



}
