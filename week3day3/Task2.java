package ba.home.boris.week3.day3;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		/*
		 * Creates array 1 with length 5, then ask for every i to assign value
		 * to that index.
		 */
		int length = 5;
		int[] arr1 = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.printf("Enter values for Array One %d", i);
			arr1[i] = input.nextInt();
		}
		
		// Same for array 2 as for 1.
		int[] arr2 = new int[5];
		for (int i = 0; i < length; i++) {
			System.out.printf("Enter values for Array Two %d", i);
			arr2[i] = input.nextInt();
		}

		//Compare two arrays if their index is same.
		boolean checkIfSame = true;
		for (int i = 0; i < length; i++) {
			if (arr1[i] == arr2[i]) {
				checkIfSame = false;
			}
		}
		
		if (checkIfSame) {
			System.out.println("Arrays are identical.");
		} else {
			System.out.println("Arrays not identical.");
		}

		input.close();

	}
}
