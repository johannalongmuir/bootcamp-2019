package com.mancheterdigital;

public class ExceptionExample {

    public static void main(String[] args) {
        int [] intArray = { 12, 3, 5 };
        // call method in main always = if standalone
        printArray(0, intArray);
        printArray(1, intArray);
        printArray(2, intArray);

        // trying to accesss index 3 in an Array with max of 2. Get red message. Will work through then provide exception when get to it
        // printArray(3, intArray);

        //easily fix using a try and a catch. Trips the error in the context of the code block

        /* try {
            //try to access element 3: Can add all the others in as well but cop out as error could be form multiple places
            printArray(3, intArray);
        }
         put the type of exception you might receive. Can tell from earlier error. ArrayIndexOutOfBoundsException
         error in stack trace. Top is the most recent one. Where goes blue gives you links to file and the line no.
         e.g ExceptionExample.java (file) error on line 18. See next line. It came from a call from line 13
         ae is of type Array out of Bounds. Can use . getLocalisedMessage gives the compilers guess of english

        catch (ArrayIndexOutOfBoundsException ae) {
            System.err.println("Element does not exist: " + ae.getLocalizedMessage());
        } */

        printArray(3, intArray);

    }

    private static void printArray(int index, int [] arr) {
        //printing one element in the array
        System.out.println("Element " + index + " is " + arr[index]);


    }

}
