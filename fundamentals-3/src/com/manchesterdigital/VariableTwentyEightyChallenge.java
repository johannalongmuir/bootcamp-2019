package com.manchesterdigital;

public class VariableTwentyEightyChallenge {
    /* cannot remember what this challenge was exactly.
       Variable 20 + 80. Add then multiply by 25.
       If remainder (%) 40 is under 20 print.
       If over 20 print over the limit
     */

    public static void main(String[] args) {
        double variable20 = 20d;
        double variable80 = 80d;
        double result = (variable20 + variable80) * 25;
        double remainder = result % 40;
        if (remainder <= 20) {
            System.out.println(remainder);
        } else {
            System.out.println("Total was over the limit");
        }
    }
}
