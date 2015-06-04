package ba.home.boris.week3.day3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		// Array length defined, using scanner to input values for each array in
		// first two for loops.
		Scanner input = new Scanner(System.in);
		int length = 5;
		int[] arr1 = new int[length];
		int[] arr2 = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.println("Enter values for each index " + i);
			arr1[i] = input.nextInt();
		}
		for (int i = 0; i < length; i++) {
			System.out.println("Enter values for each index " + i);
			arr2[i] = input.nextInt();
		}

		// Checking if arrays have same values in different indexes,
		// Second for loops check every index while first is one one. 
		int c = 0;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (arr1[i] == arr2[j]) {
					c++;
				}
			}
		}

		if (c == length) {
			System.out.println("Arrays have same values.");
		} else {
			System.out.println("Arrays are different.");
		}

		input.close();

	}

}
