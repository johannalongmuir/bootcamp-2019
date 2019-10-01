package com.manchesterdigital;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        // Not best practice. Generic way of creating an ArrayList: Could be anything.
        ArrayList names1 = new ArrayList();

        ArrayList<String> names2 = new ArrayList<>();

        names2.add("John"); // add at index 0
        names2.add("Sue"); // add at index 1
        names2.add(2, "Steve");

        int numberOfElements = names2.size();
        System.out.println("Number of Elements: " + numberOfElements);

        String firstElement = names2.get(0);
        System.out.println("First element: " + firstElement);

        // removing someone with index
        String removedElement = names2.remove(0);
        System.out.println("Removed => " + removedElement);

        // now prints Sue as everyone moves up the index
        System.out.println(names2.get(0));

        // creating a true/false variable confirming removing an object by name. Will return true
        boolean removedElementViaObject = names2.remove("Steve");

        System.out.println("Removed by object => " + removedElementViaObject);


        // Zoo animal Array List

        ArrayList <String> zooAnimals = new ArrayList<>();
        zooAnimals.add("Lion");
        zooAnimals.add("Hippo");
        zooAnimals.add("Leopard");

        // Does it contain element selected .contains
        System.out.println("Contains leopards?? " + zooAnimals.contains("Leopard"));

        // sorting in order
        Collections.sort(zooAnimals);
        System.out.println("After sort, animal at index 0: " + zooAnimals.get(0));

        Collections.shuffle(zooAnimals);

        // overrides a element at index x:
        zooAnimals.set(1, "Cheetah");

        System.out.println(zooAnimals.get(1));

        // empties the array list:
        zooAnimals.clear();
        System.out.println(zooAnimals.size());

        // normal array. Makes array with 10 spaces
        int [] lotteryArr = new int [10];
        // provides values straight away
        int [] lotteryArr2 = {1, 23, 45, 6, 88};

        // predefined array list
        // List<Integer> lotteryNumbers = Arrays.asList(1, 23, 45, 6, 88);






    }
}
