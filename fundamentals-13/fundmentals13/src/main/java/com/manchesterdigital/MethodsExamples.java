package com.manchesterdigital;

import javax.management.InvalidApplicationException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MethodsExamples {
    public static void main(String[] args) {

        // checked exception. Compiler checking for you and knows issue. Telling you there is an exception
        // if add exception to method signiture can throw back, without catching it
        // if wrote own catch, will be better than what input
        // or try/catch to surround it. makes stack trace for you
        try {
            FileInputStream fis = new FileInputStream("//somepath");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

            System.out.println("Give me a proper file!!!");
        }

        // good developer, know try and catch.
        // Not tell you as not checked
        // nap(99).try will put the try catch in for you
        // not good practice but catch could be changed to Runtime exception.
        // Give same stacktrace but masking it


        try {
            MethodsExamples examples = new MethodsExamples();
            examples.nap(99);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    /**
     * <Access modifier> <static> </static><return value> <methodName> (0 or many parameters)
     *                  <throws> <<<ExceptionClause - Runtime ones><
     */

    public final void nap(int minutes) throws IllegalArgumentException, IllegalStateException {
        // body of method
        // InterruptedException is runtime exception
        // compiler will throw the exception
        // throws IllegalArgumentException
        // explicit to the person using method
        // do you want to handle it internally to give them back something more useful
        // if throws exception, exeption, exception
        // needs to do try/catch fr all
        // won't let you call nap above unless static.
        // using final in the int minutes parameter, wouldn't let you change the minutes to something else
        // final good. What you get is what you gt. Cannot change what given.
        if (minutes == 99) {
            throw new IllegalArgumentException();
        }
    }
}

