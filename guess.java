package Java;

import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        Random randomNumber = new Random();
        System.out.println("Guess a number: ");

        int userGuesses = 5;
        int correctNumber = randomNumber.nextInt(100) + 1;



        for(int i = 1; i <= userGuesses; i++) {
            int userGuess = scan.nextInt();
            if(userGuess == correctNumber) {
                System.out.println("Congratulations, you guessed the right number! You had " + (userGuesses - i) + " guesses left.");
                break;
            }
            else if (userGuess < correctNumber) {
                System.out.println("You guessed lower than the correct number, you have " + (userGuesses - i) + " guesses left.");
            }
            else {
                System.out.println("You have guessed higher than the correct number, you have " + (userGuesses - i) + " guesses left.");
            }

        }
    System.out.println("The correct number was: " + correctNumber);
    }
}
