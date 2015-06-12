package ba.home.boris.homework.from.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RandomNumber {
	
	public static Scanner input = new Scanner (System.in);
	
	public static int numberOfWins = 0; // Global variable for counting number of wins
	
	public static int numberOfLosses = 0; // Global variable for counting number of losses
	
	public static void main(String[] args) {
		
		
		guessingGame(); // Calling the game method and playing it
		
	}
	
	
	/**
	 * Number of guesses user have until game is over.
	 * <p>
	 * Suggested number for normal game is 6, for easy mode is 8.
	 * 
	 * @return Number of guesses user have at disposal.
	 */
	public static int gameMode() {
		return 6; // This is where you change level of game 
	}
	
	
	/**
	 * Creates random number from (and including) 1 to 100.
	 * 
	 * @return <code>int</code> type random number
	 */
	public static int getRandomNumber() {
		return (int)(Math.random()* 100) + 1; // Random number generator
	}
	
	
	/**
	 * If user selects to play again send answer to playGame method to play again.
	 * 
	 * @return <code>Boolean</code> type value 
	 */
	public static boolean playAgain() {
		
		System.out.println("If you want to play again enter \"true\".");
		System.out.println("If you want to exit enter any key.");
		boolean again = false;
		try {
			again = input.nextBoolean();
		} catch (InputMismatchException ex) { // If user enters any key false will be returned
			System.out.println("Please enter boolean expression only.");
		}
		if (again == true) {
			return true;
		}
		return false;
	}
	
	
	/**
	 * Prints welcome message with some instruction to standard output. 
	 */
	public static void welcomeMessage() {
		System.out.println("Welcome to guessing game!");
		System.out.print("Computer will pick a number between 1 and 100,\nyour goal is to guess it!\n");
		System.out.println("Good luck, and have fun!");
		System.out.println();
	}
	
	
	/**
	 * Game of guessing a randomly selected number.
	 * <p>
	 * For every user input computer tells him/her that guess is low or high.
	 * If user guess the number before gameMod limitation he/she wins.
	 * <p>
	 * gameMod limitation is actually a number of guesses user have at disposal.
	 * For changing from harder to easier game go to gameMod method. 
	 * 
	 */
	public static void playGame() {
		
		int guessCount = 0;
		int userGuess;
		int randomNum = getRandomNumber(); // Gives random value to random number once per each game
			
		while (true) {
			System.out.println("Try to guess my number!");
			userGuess = input.nextInt(); // Getting user input
			guessCount++; // Counting number of guesses per game
			
			if (userGuess == randomNum) { // If user guess the number break the first loop and count as won game
				System.out.printf("Your got it! \nIt only took you %d attempt(s) to guess it.\n", guessCount);
				numberOfWins++;
				break;
			}
			helpingUser(userGuess, randomNum);
			if (guessCount == gameMode()) { // If count number gets to level of game break the first loop and count as lost game
				System.out.printf("Game over! You must guess in %d attempts!\n\n", gameMode());
				numberOfLosses++;
				break;
			}
		}
	}
	
	
	/**
	 * Helps with user input, tell user if his/hers number is higher or lower then randomly picked one.
	 * 
	 * @param userGuess Input is user number
	 * @param randomNum Input is randomly selected number
	 */
	public static void helpingUser(int userGuess, int randomNum) {
		
		if (userGuess > randomNum) { // If user guess is higher then random number tell him/her so
			System.out.println("Your number is higher! Try again");
		} else if (userGuess < randomNum) { // If user guess is lower then random number tell him/her so
			System.out.println("Your number is lower! Try again");
		}
		
	}
	
	
	/**
	 * Message printed only at end of the game.
	 */
	public static void outroMessage() {
		System.out.println("Thank you for playing!");
		System.out.printf("You have won %d times and lost %d times.\n\n", numberOfWins, numberOfLosses);
		System.out.println("Bye bye!");
	}
	
		
	/**
	 * Entire game of guessing number.
	 * User can choose to play again or to end after each game played.
	 */
	public static void guessingGame() {
					
		welcomeMessage();
		do {
			playGame();
		} while (playAgain());
		outroMessage();
			
	}
	
	

}
