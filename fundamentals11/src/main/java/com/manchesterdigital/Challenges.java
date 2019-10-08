package com.manchesterdigital;

import java.util.function.Function;

public class Challenges {

    public static void main(String[] args) {

        // Interface create a lambda to multiply a number by 2
        // better to do this to start with. E.g Make interface MultiplyByTwo,
        ChallengeInterface multiplyByTwo = n -> n * 2;

        // call by using the interface method

        Function<Integer, Integer> resultMultiplyByTwo = a -> a * 2;
        System.out.println("multiplyByTwoFunction = " + resultMultiplyByTwo.apply(2));

        // create a lambda to multiply a number by another number

        // Interface way
        MultiplyByANumber multiplyByANumber = (a, b) -> a * b;


        // Function way not work like this
        /* Function not work as can take on thing in and put one thing out.

        Function<MultiplyByANumber, Integer> resultmultiplyByANumber = (a, b) -> (a * b);
        System.out.println("resultmultiplyByANumber = " + resultmultiplyByANumber.apply(4 , 5));


        solution, created new class called numbers, added a + b. did constuctor in there + generate getters
        then did function for that numbers class, output integer.
        Function<Numbers, Integer> multiplyEachNumber = a -> a.getA() * a.get(B);
        Numbers numbersInput = new Numbers(1, 2);
        Integer result = multiplyEachNumber.apply(numbersInputs);
        soutv.
        */


        // divide a number by another number. CNTL SPACE HELPS WITH THE expression by telling you what parameters needed)
        // Interface way . calling the actual method
        Divider divider = (a, b) -> a / b;
        Double doubleResult = divider.divideIt(6d, 3d);
        System.out.println("doubleResult = " + doubleResult);


        // need to rethink how made lamda as this will fail!
        Double doubleResult2 = divider.divideIt(6d, 0d);

        Divider safeDivider = (a, b) -> {
            if (b == 0 ) {
                return 0d; // can also throw a new exception here.
            } // predicament, throw a wobbler or simply
            return a / b;
        };


        // turn into ternary. Divider safeDivider2 = (a, b) -> { return (b == 0) ? b : a / b;
        // Not even need return. Not even need {}
        // ternary use sparingly, as people may not know what you mean.

        Divider safeDivider2 = (a, b) ->  (b == 0) ? b : a / b;
        Double zeroResult = safeDivider2.divideIt(2d, 0d);
        System.out.println("zeroResult = " + zeroResult);

        // not too taxing to convert just above into Function. DivideNumbers - generate class to contain numbers
        Function<DivideNumbers, Double> dividerFunc = (a) -> (a.getB() == 0 ? a.getB() : a.getA() / a.getB());

        System.out.println("dividerFunc.apply(new DivideNumbers(2d, 0d)) = " + dividerFunc.apply(new DivideNumbers(2d, 0d)));

    }
}
