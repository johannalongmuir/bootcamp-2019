package com.manchesterdigital;

import java.util.Map;

public class Scratch {
    // only accessable by Scratch class unless public.
    // Access via class not new Scratch Class
    private static final int MIN_NUMBER_OF_ITEMS_ALLOWED_IN_BASKET = 10;

    private static Map<Long, String> countries; // when creates only one example

    // static block, set up stuff. Boilerplate maps.
    // is there anything called static? yes map? Then goes into static block as next part
    // finds has info for countries. Does this first.
    // methods can then use the countries Map.
    // Only rely when constants to reference
    // even though static only available to this class,
    // new class scratch2 eg. New instance of scratch, can then access the Scratch.countries
    // not need getter as static.
    // can also do member variable with new HashMap for example, then the data in the static
    // if final cannot change it. If not final can change it.
    // static normally best for finals.

    static {
        countries = Map.of(     // Map.of is immuitable
                1L, "England",
                2L, "France" // no commar on last one as not another coming
        );


    }



    // when create scratch class each time need to provide an author. Member to the class
    // makes new auther for each instance of it
    private String author;

    public Scratch(String author) { // constuctor, can make
        this.author = author;
    }

    public String getAuthor() {  // can retrieve value as its hidden away
        return author;
    }

    /* getters and setters prevent people from accessing and changing class
     setter lets the outside world change the author, they may only change name
     they can't see what going on behind there.
          so for setter
                this.author = author;
                add more process to go through when someone try to update author.
                outside world wouldn't know what you've done

     */


    public static void main(String[] args) {
        // camelCase for all variables
        int numberOfEmployees = 12; // variable but also a statement if = 12; Initilised.
        int numberOfStudents; // declaration
        String firstName = "John"; // non-primitive data type. Can just declare, can complain or can not.
        String lastName; // can be better to do = null. May get null pointer error but can be good to help

        // see generateFullNameForOver16s

        Scratch newScratch = new Scratch(firstName); // is an instance. newScratch is the reference to it
        newScratch.getAuthor();   //access via instance of New Scratch.
        // can use .author as in this class. If another class need to get



    }

    private static String generateFullNameForOver16s (int age, String firstName, String lastName) {
        String name = null;

        if (age > 16) {
            name = String.format("%s %s", firstName, lastName);
        }
        return name;
    }

}
