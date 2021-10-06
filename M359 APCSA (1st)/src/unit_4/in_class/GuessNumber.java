package unit_4.in_class;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int randNum = (int) (Math.random() * 10 + 1);

        System.out.println("Please enter your guess between 1-10:");
        int userGuess = kb.nextInt();

        boolean done = false;

        while (!done){
            if (userGuess == randNum){
                System.out.println("Congratulations, you guessed the number");
                done = true;
            }
            else if (userGuess > randNum){
                System.out.println("Your number was too large, please try again");
                System.out.println("Please enter another guess:");
                userGuess = kb.nextInt();
            }
            else{
                System.out.println("Your number was too small, please try again");
                System.out.println("Please enter another guess:");
                userGuess = kb.nextInt();
            }
        }
    }
}
