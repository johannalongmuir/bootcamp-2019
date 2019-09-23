package com.manchesterdigital;

public class Operators {

    public static void main(String[] args) {

        boolean isRainingToday = false;

        int number1 = 100;
        int number2 = 200;

        if (number1 <= number2)
            System.out.println("Same!");

        int degreeScore = 60;
        int overallScore = 100;

        if (degreeScore >= 60 || overallScore >= 100)
            System.out.println("Woohoo!");

        // the if statement below is an expresion. Checks if its true. Can do == false or can do ! which is not
        if(!isRainingToday) {
            System.out.println("You won't need a jacket today!");
        }

        boolean isAnimal = false;
        // boolean can reassign values in if statements. Will not be wrong reassigning as () are expressions. Better to use !
        if (isAnimal = true); {
            System.out.println("I am animal");
        }


        // can do ! in front of last.Name. Or can use an ignore case as belo
        String lastName = "Sousa";
        if(lastName.equalsIgnoreCase("SOUSA")) {
            System.out.println("Surname is Sousa!");
        }

        // example of a ternary operator: Takes an expresion and gives happy or non-happy result. ? like curley brace
        int numberOfMealsToday = 1;
        boolean isHungry = numberOfMealsToday == 1 ? true : false;





    }
}
