package com.manchesterdigital;

public class BlockStatemenst {

    public static void main(String[] args) {
        int number = 99; // accessed anywhere between {}

        if (number == 99){
            int anotherNumber = 66;   // anotherNumber and isHappy part of inner block.
            boolean isHappy = true;   //  Not accessible everywhere

            if(isHappy) {               // nested block
                anotherNumber++;
            }
            else {
                System.out.println("Not happy");

            }

            System.out.println("anotherNumber = " + anotherNumber);
        }

        int coinInserted = 50;

        switch (coinInserted) {
            case 10:
                System.out.println("10p. Not enough money");
                break; // if return not need the break as its an exit point.
            case 50:
                System.out.println("50p");
                break;  // if not have the break, will keep running and get to the default
            case 20:  // if nothing in here, if 20 will go down and use the 5p. Can be useful
            case 5:
                System.out.println("More money please");
            default:
                System.out.println("Not working"); // generally not need break at default.
        }

    }

}

