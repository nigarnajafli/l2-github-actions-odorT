package org.lab2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello lab2!");
        System.out.println(add(1, 2));
        System.out.println(add(3, 4));
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }
}