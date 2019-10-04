package com.manchesterdigital;

/**
 * Reg Me Now wants you to create a letter to number registration plate generator
 * Given the following numbers, their character equivelents should be used and produce a registration plate
 * when a sequence of letters is provided, one at a time. No Loops are allowed.
 * S results in number 5
 * A results in number 4
 * I results in number 1
 * B results in number 8
 * G results in number 9
 * Where there are no matches, that character should be returned. If it is a number, it should be passed through
 * and returned.
 * Your inital input should take the format of XXXX XXX.
 *
 */

public class RegMeNow {

    public static void main(String[] args) {
        registrationGenerator("SAAAAA");
    }


    private static String registrationGenerator(String input) {
        String[] inputAsArr = input.split("");
        //System.out.println(inputAsArr[1].equals("S"));
        System.out.println(inputAsArr);
        System.out.println(inputAsArr[1]);

        if (inputAsArr [0].equals("S")) {
            inputAsArr[0] = "5";
        } return inputAsArr [0];

    }
}

/**
 can do a switch like below
        **do case A,B etc,array possition 0,reassign number as instructed
        **do the same for all array positions replacing the element
        **not idea as makes it mutable
        *
        *switch(inputAsArr[0]){
        *case"A":
        *inputAsArr[0]="4";
        *break;
        *case"B":
        *inputAsArr[0]="8";
        *break
        *
        *default:
        *}
        *return Arrays.toString(inputArray)
        *
        **Can also use string builder......
        **at end still do.tostring
 **/

