package com.mancheterdigital;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder str = new java.lang.StringBuilder();
        System.out.println(str);
        str.append(15);
        str.append("Duncan");
        System.out.println(str);

        // Prints 15Duncan


        // see fundamentals-4
        // looks different on here as String Builder kept refering to the class not the language
        //  StringBuilder str = new StringBuilder();
        //  System.out.println(test);
        //  outputNew.append(12);

        //output.append(12);
        //output.append("Duncan");

        //System.out.println(outputNew);

    }
}
