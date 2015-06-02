package ba.home.boris.week3.day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		// Input by scanner.
		Scanner input = new Scanner (System.in);
		// Instructions message.
		System.out.println("Enter day of the week to check if it's work day.");
		// If user enters value that is not int number, catch mistake.
		try {
			int day = input.nextInt();
			// Go thru days and tell if it's workd day or weekend.
			switch (day) {
			case 1:
				System.out.println("Woork day, with homework.");
				break;
			case 2:
				System.out.println("Woork day, with homework.");
				break;
			case 3:
				System.out.println("Woork day, with homework.");
				break;
			case 4:
				System.out.println("Woork day, with homework.");
				break;
			case 5:
				System.out.println("Woork day, with homework.");
				break;
			case 6: 
				System.out.println("Weekend, with homework.");
				break;
			case 7:
				System.out.println("Weekend, with homework.");
				default:
					System.out.println("Enter number 1 - 7");
			}
		} catch (InputMismatchException ex) {
			System.out.println("Please enter int value for day 1-7.");
			System.out.println("Error number for your helpdesk is below.");
			ex.printStackTrace();
		}
		
		input.close();
		
	}

}
