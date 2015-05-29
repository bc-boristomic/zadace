package ba.home.boris.week2day4;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Your input.in file have undetermined amount of numbers. Last number
		 * in your file -1 determines end. Print sum of all numbers in file
		 * excluding -1.
		 */

		TextIO.readFile("input.in"); // Read from file.

		int n = 0;		// Number from file first value before readout.
		int sum = 0;	// Sum used in loop.

		do {
			n = TextIO.getInt();	// Ask for number.
			sum += n;	// Add to sum.
		} while (n != -1); 	// Do until number is -1, or end of file. 

		System.out.println("Sum of numbers in file is " + sum);

	}
}
