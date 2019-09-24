package com.manchesterdigital;

public class StringBuilderTest {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("this");
        str.append(" is a great");
        str.append(" test");
        str.append(12);
        System.out.println(str);
        // will print >>> this is a great test12

    }
}
