package com.manchesterdigital;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsExampleTwo {
    public static void main(String[] args) {
        /*
        Not learnt the below FileInputStream etc yet but purpose of test using. LEts it read from a file
        Null as not using it yet
         */

        FileInputStream fis = null;

        /*
         Checked example. Red line under = unhandled exception line.
         Compiler knows that it the file input not valid + need try/catch
         red lightbulb gives option. Catch/try or the other option to pass the buck. Bad practice
         if local not need to put throws exception at the top however, if business needs to be flagged that exception
         throw at top. Whoever recieves it gets exception to say oh I need to update this. In this case void. If int
         method for example, may want to give a default input back e.g -1. Can hope they know what that is or throw
         them the exception.

         Checked exception fis = new FileInputStream("Z://myfile.txt");
         Can use throws first example but passes responsibility. Use main throws if its something clear.
         E.g FileNotFound relates to the FileInputStream. THis is clear. Inbuilt JDK is easy to follow
         If more complext/slightly ambiguous. Use Try/Catch to be able to control the exception and make it clear
         what you are trying to do.
         */


        try {
            fis = new FileInputStream("Z://myfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
