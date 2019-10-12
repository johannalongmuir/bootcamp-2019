package com.manchesterdigital;

import java.util.*;

public class SetsExample {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("April");
        names.add("Jack");
        names.add("Jack");
        names.add("Jack");
        names.add("Jack");
        names.add("Jack");
        names.add("Jack");
        names.add("Emalin");

        for (String name : names) {
            System.out.println("name = " + name);
        }


        // Tree set
        Set<Integer> ages = new TreeSet<>();
        ages.add(22);
        ages.add(22);
        ages.add(22);
        ages.add(1);
        ages.add(2);
        ages.add(99);
        ages.add(77);

        System.out.println("ages = " + ages);

        //List of footballers
        List<String> footballers =
                Arrays.asList("Ronaldo", "Messi", "Naymar", "Rooney", "Zslatan", "Ronaldo");

        Set<String> uniqueFootballers = new TreeSet<>(footballers);

        System.out.println("uniqueFootballers = " + uniqueFootballers);



        // union (whats in both):
        Set<String> cats = new HashSet<>();
        cats.add("Lion");
        cats.add("Cheetah");

        Set<String> reptiles = new HashSet<>();
        reptiles.add("Snake");
        reptiles.add("Crocodile");


        Set<String> zoo = new HashSet<>(cats);
        zoo.addAll(reptiles);

        System.out.println("zoo = " + zoo);



        // intersection: used names set form the top that has John, Emalin, Jack, Apri;

        Set<String> otherNames = new HashSet<>();
        otherNames.add("John");
        otherNames.add("Joanne");
        otherNames.add("Jill");
        otherNames.add("Sue");

        Set<String> intersectionOfBoth = new HashSet<>(names);
        intersectionOfBoth.retainAll(otherNames);
        // will show what they have overlapping i.e John
        System.out.println("intersectionOfBoth = " + intersectionOfBoth);


        // differences
        Set<String > nameDifferences = new HashSet<>(names);
        nameDifferences.removeAll(otherNames);
        System.out.println("nameDifferences = " + nameDifferences);

    }
}
