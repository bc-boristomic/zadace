package ba.home.boris.week3.day2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		// Input by scanner.
		Scanner input = new Scanner(System.in);
		// Instructions message.
		System.out.println("Input file name");
		
		// If there is no file with that name print that out.
		// If there is no number at line one print that out.
		// Otherwise calculate factorial of first number.
		try {
			String fileName = input.nextLine(); // Input file name from console using scanner.
			TextIO.readFile(fileName);
			String numberWord = TextIO.getWord();
			int number = Integer.parseInt(numberWord);
			int factoriel = 1;
			for (int i = 1; i <= number; i++) {
				factoriel = factoriel * i;
			}
			System.out.println("Factoriel of a number from file is " + factoriel);
		} catch (NumberFormatException ex) {
			System.out.println("Check your file, number not on first line.");
			System.out.println("Error number for your helpdesk is below.");
			ex.printStackTrace();
		} catch (IllegalArgumentException ex) {
			System.out.println("No file with that name.");
			System.out.println("Error number for your helpdesk is below.");
			ex.printStackTrace();
		}
		input.close();

	}
}
