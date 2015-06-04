package ba.home.boris.week3.day3;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// Instructing user to enter value and adding it to array length.
		System.out.println("Enter length of array.");
		int length = input.nextInt();
		int[] arr = new int[length];

		// Instructing user to enter value for each index of array.
		for (int i = 0; i < length; i++) {
			System.out.println("Enter value at index " + i);
			arr[i] = input.nextInt();
		}

		// Instructing user to enter number to be checked if it's in array.
		System.out.println("Enter number to check if it's in array.");
		int number = input.nextInt();

		// Searching for number in array
		for (int i = 0; i < length; i++) {
			if (arr[i] == number) {
				System.out.printf("Number %d is in array\n", number);
				System.exit(0);
			}
		}
		System.out.printf("Number %d not array", number);
		
		input.close();
	}

}
