package com.manchesterdigital.challenge;

import java.util.List;
import java.util.stream.Collectors;

public class NonNegativeReturnRightChallenge {

    /*
    Given a list of non-negative integers, return an integer list of the rightmost digits.
    tip: % is your friend.
    rightDigit([1, 22, 93]) -> [1, 2, 3]
    rightDigit([16, 8, 886]) -> [6, 8, 6]
    private static List<Integer> rightDigit(List<Integer> nums) {
    //
     */

    public static void main(String[] args) {
        System.out.println(rightDigit(List.of(1, 22, 93)));
        System.out.println(rightDigit(List.of(16, 8, 886)));


    }

    public static List<Integer> rightDigit (List<Integer> nums) {
        return nums.stream()
                .map(i -> i % 10)
                .collect(Collectors.toList());
    }
}
