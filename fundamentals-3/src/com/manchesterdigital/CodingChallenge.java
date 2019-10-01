package com.manchesterdigital;

public class CodingChallenge {
    public static void main(String[] args) {
        double variable20 = 20d;
        double variable80 = 80d;
        double result = (variable20 + variable80) * 25;
        double remainder = result % 40;
        if (remainder <= 20); {
            System.out.println("Total was over the limit");
            System.out.println(remainder);
        }
    }
}
