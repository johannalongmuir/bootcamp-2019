package com.manchesterdigital;

import java.util.*;
import java.util.stream.Collectors;

public class Animal {

    /*public static void main(String[] args) {
        // Lists to go into Map set up
        List<String> carnivoreList = List.of("Lion", "Tiger", "Cat");
        List<String> herbivoreList = List.of("Hippo", "Cow");
        List<String> omnivoreList = List.of("Dog");

        // Map set up. These should be enums
        Map<String, List> animalMap = new HashMap<>();
        animalMap.put("Carnivore", carnivoreList);
        animalMap.put("Herbivore", herbivoreList);
        animalMap.put("Omnivore", omnivoreList);

        System.out.println(AnimalTypes.animalTypes(animalMap, "Lion"));
        System.out.println(AnimalTypes.animalTypes(animalMap, "Cow"));

        //List<String> hippoToString = AnimalTypes.animalTypes(animalMap, "Hippo");

        //System.out.println("I am a " + hippoToString);

    } // main end



    // Method needs setting up to call. Search List method
        /*for (Map.Entry<String, List> fullList : animalMap.entrySet()) {
            if (fullList.getValue().contains(animalInput)) {
                System.out.println("I am a " + fullList.getKey());
                    /*if (!carnivoreList.contains(animalInput)
                            || !omnivoreList.contains(animalInput)
                            || !herbivoreList.contains(animalInput));
                System.out.println("Sorry, I am not yet on the list!");
                     */

        /*else if (!carnivoreList.contains(animalInput)
                    || !omnivoreList.contains(animalInput)
                    || !herbivoreList.contains(animalInput));
                    */
    //   System.out.println("Sorry, I am not yet on the list!");

    // prints three times as checking each key for contains
    // boolean, true or false
    // if false print "Sorry, I am not yet on the list!"
    // should this be a try/catch?
    /*

    needs sorting but could make a method to go through Map for us then call it
    public static Map<String, List> extractStudents (Map<String, List>, String animalType) {
        animalMap.entrySet().stream()
                .filter(stringListEntry -> stringListEntry.getValue().contains("Lion"))
                .collect.
                */


} // Class



