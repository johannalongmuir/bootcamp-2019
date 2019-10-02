package com.manchesterdigital;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ForEachExample {

    public static void main(String[] args) {

        /**
         *  for (datatype instance : collection) {
         *    //  some logic for the loop
         *  }
         *
         *  Naming convention - advanced for loop
         */

        ArrayList<String> students = new ArrayList<>();
        students.add("Callum");
        students.add("Andrew");
        students.add("Trump");

        // allows you to get hold of students within the block.
        // may have a lot of things in the database. Can get each users properties when in loop
        // e.g first and last name.
        for (String student :  students); {
            System.out.println("Student = " + students);
        }





        /*
        Given an array of ints, return if every element is a 1 or a 4.
        only1or4([1, 4, 1, 4]) -> true
        only1or4([1, 4, 3, 4]) -> false
        only1or4([1, 1]) -> true
         */

        //
        /* for (Int arrayList : arrayList())
            if (number = 1); {
                return true;
            } else if (number = 4) {
                return true;
         } return false;
    }




    public static Integer arrayList () {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(1);
        number.add(7);

         */


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        System.out.println("numbers result = " + only1or4(numbers));


    }

    private static boolean only1or4(ArrayList<Integer> numbers) {
        boolean result = true;

        for (Integer number : numbers) {
            if (!number.equals(1) && !number.equals(4)){
                result = false;
                break;
            }
        }

        return result;
    }

}
