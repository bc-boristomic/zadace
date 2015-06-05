package ba.home.boris.week3.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] arr = new int[100000];

		// For every index i assign random value up to 99999.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100000);
		}

		Arrays.sort(arr); // Sorting array.

		System.out.println("Enter number to check if it's in array.");
		int n = input.nextInt(); // Number to be checked if it's in array.

		// Checking how many times it appeared in array.
		int m = Arrays.binarySearch(arr, n);

		System.out.printf("Number %d appeared %d times in array.", n, m);

		input.close();

	}
}
