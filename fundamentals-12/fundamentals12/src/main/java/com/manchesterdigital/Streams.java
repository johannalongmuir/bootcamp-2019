package com.manchesterdigital;

import java.security.MessageDigest;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // old school. Mutation going on using result +=.
        // Changes each time. Changing value while in the loop. Can happen without you knowing about it
        // this is old school. Better to use stream
        int result = 0;
        for (Integer i : numbers) {
            result += i * 2;
        }

        System.out.println("result = " + result);

        // don't worry about reduce
        // .reduce(0, (x, y) -> x + y)

        System.out.println("Result = " +
        numbers.stream()
                .map(i -> i * 2)
                .reduce(0, Integer::sum));


        // counts all numbers from 0 to 10, not inclusive of 10
        int sum = IntStream.range(0, 10)
                .sum();

        System.out.println("sum = " + sum);

        int anotherSum = IntStream.rangeClosed(1, 10).sum();
        System.out.println("anotherSum = " + anotherSum);



        List<String> names = List.of("john", "amy", "jack");

        // old dirty way
        for (String name : names) {
            String uCase = name.toUpperCase();
            System.out.println("uCase = " + uCase);
        }

        // improved, just telling what we want it to do
        List<String> uppercasedNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("uppercasedNames = " + uppercasedNames);


        // an improved version. IntelliJ above suggests doing this as its better
        // lambda maybe helpul if have the predicate
        List<String> uppercasedNamesMethodRef = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("uppercasedNamesMethodRef = " + uppercasedNamesMethodRef);


        // commons codec, returns hashcodes
        // MessageDigest.



        // dealing with multiple streams
        // List of list of lists

        List<List<String>> richPeople = List.of(
                List.of("Jeff Bezos"),
                List.of("Bill Gates"),
                List.of("Deborah Meadon"),
                List.of("Mark Zuckerberg")
                );

        System.out.println("richPeople = " + richPeople);

        // flatten things out with flatMap.
        // flatmapping an internal stream and combining
        // change to set so unique values
        Set<String> flattedRichPeople = richPeople.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());

        System.out.println("flattedRichPeople = " + flattedRichPeople);

        // on artist, list of artist, use flatMap wiht the members to get the list of all the Members


        // if had stream of artists, f



    }
}
