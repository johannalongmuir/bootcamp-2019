package com.manchesterdigital;

public class BakingExampleCover {
    public static void main(String[] args) {
        // create an object of class. Accessed a method from BakingExample through new bakingExample
        BakingExample bakingExample = new BakingExample();

        bakingExample.decorate();

        BakingExample.switchOvenOn(5);
    }

}

