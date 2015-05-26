package ba.home.boris.week2day2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Fibonacci sequence

		Scanner in = new Scanner(System.in);

		System.out.println("Insert number");

		int n = in.nextInt();
		int sum = 0;
		int firstN = 1; // starting numbers
		int secondN = 1;

		if (1 < n && n <= 50) {
			for (int i = 2; i < n; i++) { // start from 2, because first two numbers are 1
				sum = firstN + secondN; // sum of first two numbers gives third number
				firstN = secondN; // so first becomes second
				secondN = sum; // and second becomes third
			}
			System.out.println(sum);
		} else {
			System.out.println("Error");
		}
		in.close();
	}
}
