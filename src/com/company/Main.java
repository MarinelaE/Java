package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        float c = 7;
        float d = 4;
        float x = 20;
        float y = -3;
        float z = 5;
        float w = 8;

        //Exercitiu 1 lab 10

        printText();

        // System.out.println(a + b);
        System.out.println("Result is " + sum(a, b));

        System.out.println("Result is " + divide(c, d));
        //System.out.println(-5 + 8 * 6);

        System.out.println("Result is " + sum(-5, multiplie(8, 6)));
        //System.out.println((55 + 9) % 9);

        System.out.println("Result is " + modulo(sum(55, 9), 9));
        // System.out.println(x + y * z / w);

        System.out.println("Result is " + sum(x, divide(multiplie(y, z), w)));
        //System.out.println( 20 + -3 * 5 / 8);

        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
        System.out.println("Result is " + substract(sum(5, divide(15, multiplie(3, 2))), modulo(8, 3)));

        //ex. 3 lab 10
        printText2("   J    a    v     v  a");
        printText2("   J   a a    v   v  a a");
        printText2("J  J  aaaaa    V V  aaaaa");
        printText2(" JJ  a     a    V  a     a");

        printText2("\n ---------------Version 2 ---------\n" +
                "   J    a    v     v  a\n" +
                "   J   a a    v   v  a a\n" +
                "J  J  aaaaa    V V  aaaaa\n" +
                " JJ  a     a    V  a     a");

        //ex.4 lab 10
        System.out.println(media(8, 7, 10));

        //ex.5 lab 10
        printRobotFace();

        //ex.7 lab 10
        System.out.println("C=" + convertToCelsius(500));

        //ex.8 lab 10
        System.out.println("M= " + convertToMeter(25));

        //ex.9 lab 10
        getSpeed(1640, 1, 30, 45);
    }


    //ex.1, 2, 6 lab 10
    static void printText() {
        System.out.println("Hello \nMarinela Ratiu");
    }

    static float sum(float a, float b) {
        return a + b;
    }

    static float divide(float a, float b) {
        return a / b;
    }

    static float multiplie(float a, float b) {
        return a * b;
    }

    static float modulo(float a, float b) {
        return a % b;
    }

    static float substract(float a, float b) {
        return a - b;
    }


    //ex.3 lab 10
    static void printText2(String text) {
        System.out.println(text);
    }

    //ex.4 lab 10
    static float media(float a, float b, float c) {
        return (a + b + c) / 3;
    }

    //ex.5 lab 10
    static void printRobotFace() {
        System.out.println(" +\"\"\"\"\"+\n" +
                "[| O O |]\n" +
                " |  ^  | \n" +
                " | '-' | \n" +
                " +-----+");
    }

    //ex.7 lab 10
    static float convertToCelsius(float fahrenheitValue) {
        return 5f / 9f * (fahrenheitValue - 32);
    }

    //ex.8 lab 10
    static double convertToMeter(double inchValue) {
        return inchValue * 0.0254;
    }

    //ex.9 lab 10
    static void getSpeed(double distance, int hour, int minutes, int seconds) {

        System.out.println(distance / (hour * 3600 + minutes * 60 + seconds));
        System.out.println(distance / 1000 / hour);
        System.out.println(distance / 1609 / hour);

    }
}
