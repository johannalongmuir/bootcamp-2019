package com.manchesterdigital;

public class SwitchStatements {

    public static final int TEN_PENCE = 10;
    public static final int TWENTY_PENCE = 20;

    public static void main(String[] args) {

        int coinInserted = 50;

        switch (coinInserted) {
            case TEN_PENCE:
            case TWENTY_PENCE:
                warningMessage();
                break;
            case 50:
                System.out.println("Inserted 50p");
                break;
            default:
                System.out.println("No coin detected");
        }
        System.out.println("Change given???");
    }

    private static void warningMessage(){
        // done in way when case 10 and case 20 are directly over each other. See above for one message if 10 or 20
        System.out.println("Not enough Dollars!!!");
    }
}
