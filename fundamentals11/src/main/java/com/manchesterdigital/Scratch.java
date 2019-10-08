package com.manchesterdigital;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Scratch {

    public static void main(String[] args) {

        // recap on List/Map/Set
        Artist adele = new Artist("Adele", 9_000_000L);
        Artist prince = new Artist("Prince", 20_000_000L);
        List<Artist> artists = Arrays.asList(
                adele,
                prince
        );

        // if do toString will update it to show the string instead of the id
        for (Artist artist : artists) {
            System.out.println("artist = " + artist);
        }

        //Long better data type for this
        Map<Long, Artist> artistMap = new HashMap<>();
        artistMap.put(1L, adele);
        artistMap.put(2L, prince);

        // not ordered
        for (Map.Entry <Long, Artist> entry : artistMap.entrySet()) {
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());

        }

        // interate over keys
        for (Long key : artistMap.keySet()) {
            System.out.println("key = " + key);
            if (artistMap.containsKey(key)) {
                System.out.println("Key = " + key + " exists");
            }
        }

        // for values can use calues. Will return you a collection. Type of object. Don't care about IF
        for (Artist artist : artistMap.values()) {
            System.out.println("artist = " + artist);
        }

        // Set Can put artist values into a set to take out dupes. Put into has set.
        // Have something but don't know if unique
        Set<Artist> artistSet = new HashSet<>(artistMap.values());

        // iterate over unique values for artists. Only give back the uniques
        for (Artist artist : artistSet) {
            System.out.println("Unique artist = " + artist);
        }

        // mutations not a good thing in life

        //Immutability...:) Version 9 need to update.
        List<Integer> numbers = List.of(1,2,3,4,5);

        for (Integer i : numbers) {
            System.out.println("i = " + i);
        }

        Set <Long> distances = Set.of(1L, 2L, 3L, 4L);

        // prints out each individual item that is unique
        for (Long distance : distances) {
            System.out.println("distance = " + distance);
        }

        // usefull for testing. Re-look at Rosso Restaurant.
        // This will pair up the values with k1, v1, k2, v2.
        // Input/values/keys cannot be changes
        // this is the preffered route as non-modifiable
        // only do this with one way street

        Map<Long, String> namesMap =
                Map.of(1L, "John", 2L, "April");

        for (Map.Entry<Long, String> nameEntry : namesMap.entrySet()){
            System.out.println("nameEntry.getValue() = " + nameEntry.getValue());
        }



        // back to artist
        List<Artist> allArtists = List.of(adele, prince);

        for (Artist artist : allArtists) {
            System.out.println("artist = " + artist);
        }

        // use cntl space to help prompt wha you might need.

        allArtists.forEach(artist -> System.out.println("artist = " + artist));
        // there is a better version of this.
        // Java knows trying to print out from list.
        // Not need to know what loop over. Already telling what to loop over with the name.
        // just don't get "artist = " on the second bit as not specified

        allArtists.forEach(System.out::println);

        // system.out is the void part so need to do the getName as below before
        // can do anything you want inside the void.
        // allArtists.forEach(artist -> System.out.println("artist = " + artist.getName()));


    }

}
