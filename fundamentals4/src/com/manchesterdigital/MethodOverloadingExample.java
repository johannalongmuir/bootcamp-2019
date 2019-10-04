package com.manchesterdigital;

public class MethodOverloadingExample {
    /** public, available to the world. INt return type. NO static. This is a member method as belongs to that actual class.
     * Static has different context)
     * Overload multiply
     */


    public int multiply (int a, int b) {
        return a * b;
    }

    public int multiply (int a, int b, int c) {
        return a * b * c;
    }

    // Can use into another. Know the one above worked already.
    public int multiply (int a, int b, int c, int d) {
        return multiply(a, b, c) * d;
    }
    public static void main(String[] args) {
        // creating new object called me. New instance of MethodOverloadingExample. Telling it what type the me is going to be
        // create me an object called me, which is of type MethodOverloadingExample
        MethodOverloadingExample me = new MethodOverloadingExample();

        //.syntax. Local to the class but it is public anyway, don't forget.var for help

        int result = me.multiply(3, 3);
        System.out.println("Result: " + result);

        result = me.multiply(3,3,3);
        System.out.println("Result: " + result);

        result = me.multiply(3,3,3, 3);
        System.out.println("Result: " + result);

    }
}
