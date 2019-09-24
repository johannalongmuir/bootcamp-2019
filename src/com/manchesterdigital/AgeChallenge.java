package com.manchesterdigital;

public class AgeChallenge {

    public static void main(String[] args) {
        printStringAge("Cool kids", 15);
        printStringAge("hello", 67);
        printStringAge("nope", 50);
    }

    private static void printStringAge(String string, int age) {
        if (age > 60) {
            System.out.println(string);
            System.out.println(string);
        } else {
            System.out.println(string);
        }
    }

}
