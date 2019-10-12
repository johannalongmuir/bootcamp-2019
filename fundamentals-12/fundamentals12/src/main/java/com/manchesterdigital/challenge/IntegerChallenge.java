package com.manchesterdigital.challenge;

import java.util.List;
import java.util.stream.Collectors;

public class IntegerChallenge {
    /*
    Given a list of integer, return a list where each integer is multiplied by itself.
    Return new list of multiplied by itself
    When provided none, return none - see bottom line

    square([1, 2, 3]) -> [1, 4, 9]
    square([6, 8, -8]) -> [36, 64,64]
    square([ ]) -> [ ]

    // static method, call from within main
     */

    public static void main(String[] args) {

        System.out.println(square(List.of(1, 2, 3)));
        System.out.println(square(List.of(6, 8, -8)));
        System.out.println(square(List.of(2, 4, 8)));
        System.out.println(square(List.of()));


    }

    private static List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(i -> i * i) // change value on fly in immutable way
                .collect(Collectors.toList());
    }

}
