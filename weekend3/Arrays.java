package ba.home.boris.homework.weekend3;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Instructing user that number entered will be length of array one.
		System.out.println("Enter length of array one.");
		// Assigning value to length of array one.
		int n = input.nextInt();
		// Array one with length n.
		int[] arrayOne = new int[n];
		// Assigning value for each index in array using scanner.
		for (int i = 0; i < arrayOne.length; i++) {
			System.out.println("Enter value at index " + i);
			arrayOne[i] = input.nextInt();
		}

		// Instructing user that number entered will be length of array two.
		System.out.println("Enter length of array two.");
		// Assigning value to length of array one.
		int m = input.nextInt();
		// Array one with length m.
		int[] arrayTwo = new int[m];
		// Assigning value for each index in array using scanner.
		for (int i = 0; i < arrayTwo.length; i++) {
			System.out.println("Enter value at index " + i);
			arrayTwo[i] = input.nextInt();
		}

		// Method for checking if two arrays have same value.
		areEquals(arrayOne, arrayTwo);

		// Method for summing two arrays.
		sumOfTwoArrays(arrayOne, arrayTwo);

		// Method for merging two arrays in third.
		mergeTwoArrays(arrayOne, arrayTwo);

		input.close();

	}

	// Method for checking if two arrays are equal.

	static boolean areEquals(int[] arrayOne, int[] arrayTwo) {

		// If their length is same same check if every index value is same.
		if (arrayOne.length == arrayTwo.length) {
			for (int i = 0; i < arrayTwo.length; i++) {
				if (arrayOne[i] == arrayTwo[i]) {
				} else { // Else their index value is not same so return false.
					System.out.print("Are two arrays equal? > ");
					System.out.println(false);
					return false;
				}
			}
		} else { // Else their length is not same so return false.
			System.out.print("Are two arrays equal? > ");
			System.out.println(false);
			return false;
		}
		System.out.print("Are two arrays equal? > ");
		System.out.println(true);
		return true; // Return true when everything checks out.
	}

	// Method for summing two arrays.

	static int[] sumOfTwoArrays(int[] arrayOne, int[] arrayTwo) {

		if (arrayOne.length > arrayTwo.length) { // If array one is larger than array two.
			int[] arrayThree = new int[arrayOne.length]; // Assign arrays three length same as array one.
			for (int i = 0; i < arrayTwo.length; i++) {
				arrayThree[i] = arrayOne[i] + arrayTwo[i]; // Sum array one and two into third.
			}
			for (int i = arrayTwo.length; i < arrayThree.length; i++) {
				arrayThree[i] = arrayOne[i]; // Add elements from array one at appropriate index in array three.
			}
			System.out.print("Sum of two arrays is > ");
			System.out.println(java.util.Arrays.toString(arrayThree));
			return arrayThree; // Return value with printed results.

		} else { // Else array two is larger than array one (or they have same length).
			int[] arrayThree = new int[arrayTwo.length]; // Assign arrays three length same as array two.
			for (int i = 0; i < arrayOne.length; i++) {
				arrayThree[i] = arrayOne[i] + arrayTwo[i]; // Sum array one and two into third.
			}
			for (int i = arrayOne.length; i < arrayThree.length; i++) {
				arrayThree[i] = arrayTwo[i]; // Add elements from array one at appropriate index in array three.
			}
			System.out.print("Sum of two arrays is > ");
			System.out.println(java.util.Arrays.toString(arrayThree));
			return arrayThree; // Return value with printed results.
		}
	}

	// Method for merging two arrays into third.

	static int[] mergeTwoArrays(int[] arrayOne, int[] arrayTwo) {

		// Array three have length of array one and two combined.
		int[] arrayThree = new int[arrayOne.length + arrayTwo.length];

		// Copy values of array one to array three.
		for (int i = 0; i < arrayOne.length; i++) {
			arrayThree[i] = arrayOne[i];
		}

		// Copy values of array two to array three starting from end of last
		// index of array one.
		for (int i = 0; i < arrayTwo.length; i++) {
			arrayThree[arrayOne.length + i] = arrayTwo[i];
		}
		System.out.print("First and second array combined into third array > ");
		System.out.println(java.util.Arrays.toString(arrayThree));
		return arrayThree; // Return third array with printed results.
	}

}
