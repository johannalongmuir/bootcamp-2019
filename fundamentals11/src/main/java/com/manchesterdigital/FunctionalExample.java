package com.manchesterdigital;

import java.util.List;
import java.util.function.Function;

public class FunctionalExample {

    public static void main(String[] args) {


        // 1st calculate total price of all items
        // 2nd multiply sales by tax...
        // 3rd add sales to total
        // 4th return total

       List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("numbers = " + numbers.get(i));
        }

        // moved on 2000s
        for (Integer i : numbers) {
            System.out.println("i = " + i);
        }

        // function can be assigned to variable and be called via variable name




        // Lambda Expression = anonymous functions
        /**
         *  (A list of parameters separated by commas )?
         *  -> { expression body which contains one or more statements }?
         * curley braces can be optional depending on how many parameters
         */

        // left is instance of interface, called isEven - statement says,
        // given n ( a number) work out if its a modulous of 2 and equal to 0
        NumericTest isEven = (n) -> (n % 2 == 0);

        System.out.println("Is 4 even a number?" + isEven.computeTest(4));

        System.out.println("Is 5 even a number?" + isEven.computeTest(5));

        NumericTest isNegative = (n) -> (n < 0);
        System.out.println("-1 is negative? " + isNegative.computeTest(-1));


        /*NumericTest isOdd = new NumericTest() {
            @Override
            public boolean computeTest(int n) {
                return false;
            }
        };

        can amend it to below as not need all the other information, take out the grey
         NumericTest isOdd = (n) -> false;

         */

        NumericTest isOdd = (n) -> false;

        // sout is a statement. Statement ending in ;
        // goes into compiler, find interface that matches that signature, one matching () in theory the parenthesis is
        // message()

        Greeting greetInSpanish = () -> System.out.println("Hola");

        /* long version. Get rid of the grey. Would need to add statement.
        Greeting getinFrence = new Greeting() {
            @Override
            public void message() {
            }
          }    */

        Greeting greetInFrench = () -> System.out.println("Boujour");

        // can call other methods on the right of the ->
        // should be short and snappy

        // cannot run unless calls the message
        greetInSpanish.message();
        greetInFrench.message();




        // object of type function, takes in some form of String and returns you an integer
        // apply logic to string coming in.
        // THIS IS NOT A LAMBDA, JUST A FUNCTION INTERFACE. Don't do it this way use modinised
        Function<String, Integer> getWordLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String word) {
                return word.length();
            }
        };



        Integer helloLength = getWordLength.apply("Hello");
        System.out.println("helloLength = " + helloLength);



        // method reference :: Method is called length, from the class called String
        // :: means go find something in this class from the String Class
        // what I want, rather then telling each step for that you want
        // use this method if I provide you value. Not how. Just what
        // call by function name + apply, apply to the string
        // made a mechanism now that can easily pass around, public static final function.
        // transform this object to that object
        // remoecs mutability and write less code
        Function<String, Integer> getWordLengthModernised = String::length;

        Integer length = getWordLengthModernised.apply("Amy");
        System.out.println("length = " + length);



        // artist example back
        // saves writing method and for each.
        // combining the two...gets funky
        // apply what want to use as part of first function
        Function<Artist, String> extractArtistName = Artist::getName;
        Function<String, String> convertToUpperCase = String::toUpperCase;
        Artist skepta = new Artist("Skepta", 2_000_000L);
        String artistName = extractArtistName.apply(skepta);

        String uppercasedName = convertToUpperCase.apply(artistName); // convert to uppercase

        System.out.println("uppercasedName = " + uppercasedName);



        // can concatenate the functions together. Apply this, then apply this.
        // can keep going. Functions need to be existing somewhere, can be JDK ones in there.
        String allFunctions = extractArtistName.andThen(convertToUpperCase).apply(skepta);
        System.out.println("allFunctions = " + allFunctions);



        // numerical example with lambda. Half number and give double output
        // run the rght side, with new lambda, then run the left
        // using the .compose and assign it to half flags to run first
        Function<Integer, Double> half = a -> a/2.0d;
        half = half.compose(a -> a * 3);
        System.out.println("half = " + half.apply(5));



        // alternative. This would create half of then and Then run the lambda

        half = half.andThen(a -> a * 3);
        System.out.println("half = " + half.apply(10));

    }
}
