package com.manchesterdigital;

public class Scratch {
    public static void main(String[] args) {
        // Assigment statement. Grey as not used in IntelliJ yet
        int numberOfTeams = 4;

        // Declarative statement;
        double interestRate;

        //method invocation statement:
        System.out.println("Hello World");

        // Object creation statement. Instance of Car called ferrari
        Car ferrari = new Car();

        boolean isMorning = true;

        if (isMorning) {
            System.out.println("It's Morning");
            putTheKettleOn();
        }

    }
    private static void putTheKettleOn() {
        System.out.println("Put the Kettle On...");
    }
}
