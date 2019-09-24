package com.manchesterdigital;

public class Arrays {
    public static void main(String[] args) {
        // both valid. First is prefered. Int array called number
        int [] numbers;
        int numbers2 [];
        //initialses every element int default 0 for 10. IF Boolean, default is false.
        int [] numbers3 = new int[10];
        // first position in array is 99. 10 numbers not right as only putting in 2 with below. IF not need to do fixed size.
        numbers3[0] = 99;
        numbers3[4] = 77;
        // when print out empty in the non declared. Array = java given an initialised.
        //more efficient below as adds
        int [] lotterNumbers = { 12, 45, 55, 66, 77 };
        System.out.println(lotterNumbers[4]); // should be 77
        // get array index out of bounds error if select [9] for example. in this case position 10 not exist
        //if explicitly say where meant to g, will go in tht position
        // can do the below Compiler not complain but will get run time error as we've already told it max 5.
        // given 5 spaces in memory so cannot add to it
        //lotterNumbers[9] = 88;
        // compliation error = red
        // run time error - when compiler realised an error



    }
}
