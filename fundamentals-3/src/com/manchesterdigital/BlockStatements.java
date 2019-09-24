package com.manchesterdigital;

public class BlockStatements {
    public static void main(String[] args) {

        int age = 20;
        boolean hasDrivingLicence = true;

        if (age >=20) {
            int height = 10;

            if (hasDrivingLicence) {
                //This belongs to the inner block

                // height can be used here

                //this is declared in the inner block so is locally scoped
                int expiryDate = 15;


            }

            // can use height here as well was declared outisde of inner block
            height = 20;

            // cannot use expiryDate here as it cannot find it. IT was in the inner scope
            // expiryDate = 15;
        }

    }
}
