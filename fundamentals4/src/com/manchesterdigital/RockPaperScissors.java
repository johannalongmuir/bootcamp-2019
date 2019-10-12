package com.manchesterdigital;

import java.util.Random;
import java.util.Scanner;

//Print winner

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.nextLine();
        Random random = new Random();
        double computerChoice = (random.nextDouble());

        String computerInput = "Scissors";
        if (computerChoice <= 0.33) {
            computerInput = "Rock";
        } else if (computerChoice <= 0.66) {
            computerInput = "Paper";
        }

        String resultOfGame = outcome(userChoice, computerInput);
        System.out.println(resultOfGame);
    }

    private static String outcome(String userChoice, String computerInput) {
        String result = "";

        if (userChoice.equalsIgnoreCase((computerInput))) {
            result = "Draw";
        } else {
            // other peramaters
            if (userChoice.equalsIgnoreCase("Paper")) {
                if (computerInput.equalsIgnoreCase("Rock")) {
                    result = "Comp Wins!";
                }
            } else {
                result = "User Wins";
                {
                    if (userChoice.equalsIgnoreCase("scissors")) {
                        if (computerInput.equalsIgnoreCase("Rock")) {
                            result = "Comp Wins!";
                        }
                    } else {
                        result = "User Wins";

                    }
                }
            }
        }
        return result;
    }
} // final one







/**
 rockPaperScissors("rock", "scissors");
 //Scanner userInput = new Scanner(System.in);
 //String userChoice = userInput.nextLine();

 Random random = new Random();
 double computerChoice = (random.nextDouble() / 3);
 System.out.println(computerChoice);
 }

 private static String rockPaperScissors (String userInput, String computerChoice) {
 if (userInput == computerChoice) {
 System.out.println("draw");
 return "Draw";
 } else if ((userInput == "rock" && computerChoice == "scissors") ||
 (userInput == "paper" && computerChoice == "rock") ||
 (userInput == "scissors" && computerChoice == "paper)")) {
 System.out.println("win");
 return "Win";
 } else {
 System.out.println("loss");
 return "Loose";
 }

 }
 *
 */






