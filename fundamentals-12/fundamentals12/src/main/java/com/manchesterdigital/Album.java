package com.manchesterdigital;

public class Album {

    /*
    Create an album class
    Create a list of albums and filter out those that begin with the letter A.
    Print these to the console.
    PLEASE CHOOSE ALBUMS THAT HAVE A VARIETY OF NAMES.
    https://en.wikipedia.org/wiki/List_of_2019_alb


    start with a list
    then do filter
    seperate out album into letters, index 0 = "A"

     */

    private String name;

    public Album(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Album = " + name;
    }
}
