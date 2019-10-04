package com.manchesterdigital;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        output.append(12); // int
        output.append("Duncan"); // String
        output.append('5'); // char
        output.append(10.2d); // double

        System.out.println("output = " + output);

        // prints: output = 12Duncan510.2

    }

}
