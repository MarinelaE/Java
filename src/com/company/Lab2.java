package com.company;

public class Lab2 {
    public static void main(String[] args) {
        System.out.println("The sum is: " + sum(5, 6, 2, 8));
        System.out.println("The substract is: " + substract(15.35F, 7.3654f));
        System.out.println("The multiplication is: " + multiplication(6.256f, 2.2547f));
        System.out.println("The divide is: " + divide(25, 100));
        System.out.println("The modulo is:" + modulo(16f, 3f));
    }

    static int sum(int x, int y, int z, int w) {
        int result = x + y + z + w;
        return result;
    }

    static float substract(float a, float b) {
        float result = a - b;
        return result;

    }

    static float multiplication(float c, float d) {
        float result = c * d;
        return result;

    }

    static double divide(double x, double y) {
        double result = x / y;
        return result;


    }

    static float modulo (float x, float y) {
        float result = x % y;
        return result;


    }
}
