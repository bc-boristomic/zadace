package ba.home.boris.homework.weekend3;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number");
		int n = input.nextInt();

		// Method for adding comma after every three digits right to left.
		digitsWithComma(n);

		// Method for checking how many digits are in a number.
		System.out.println("Number of digits in your number is " + howManyDigitsIsInANumber(n) + ".");

		// Method for switching place of first and last digit in a number.
		System.out.printf("Number %d with switched first and last digit is > ", n);
		System.out.println(switchFirstAndLastDigit(n));
		
		numbersBetweenNAndQ(n, 32);

		input.close();

	}

	// Method that prints comma after every three digits.

	static void digitsWithComma(int n) { // No return values.

		String s1 = String.valueOf(n); // Convert int to string.
		String s2 = "";
		int counter = 0;
		if (s1.length() > 3) { // If there is more then three digits then add comma.
			for (int i = s1.length() - 1; i >= 0; i--) { // Start from last digit.
				char c = s1.charAt(i); // Check every character at every index.
				if (counter == 3) { // If there are three characters.
					s2 = c + "," + s2; // Add comma before last three digits.
					counter = 1;
				} else { // Count until three characters and keep adding characters to string.
					s2 = c + s2;
					counter++;
				}
			}
			System.out.print("Your number with commas > ");
			System.out.println(s2);
		} else { // Print the number since there doesn't need to be comma in three digits number.
			System.out.print("Your number doesn't need commas > ");
			System.out.println(s1);
		}
	}

	// Method that counts number of digits until you reach zero (from last to first).

	static int howManyDigitsIsInANumber(int n) {

		int helper;
		int counter = 0;
		while (n != 0) { // Run until last digit and count them.
			helper = n % 10;
			n /= 10;
			counter++;
		}
		return counter; // Return count result.
	}

	// Method that switch places of first and last digit in a number.

	static int switchFirstAndLastDigit(int n) {

		int q;
		String s1 = String.valueOf(n);
		String s2 = "";
		if (n > 10) { // If number is over 10 there are two digits that need to switch places.
			char c = s1.charAt(s1.length() - 1); // Get last character of string number.
			s2 = s2 + c; // New string is just last character, now first number.
			for (int i = 1; i < s1.length() - 1; i++) { // Start from index 1 of the string.
				c = s1.charAt(i); // Take all characters and add them to new string.
				s2 = s2 + c;
			}
			c = s1.charAt(0); // Now take first character and add it to last index of new string.
			s2 = s2 + c;
			q = Integer.parseInt(s2); // Reverse back to int value for return.
			return q; // Return new switched number.
		} else { // Only one digit so return it.
			return n;
		}
	}
	
	/**
	 * Prints odd or even numbers between two inputed numbers to standard output.
	 * 
	 * @param n - first inputed number, over scanner
	 * @param q - second inputed number, manually
	 */
	static void numbersBetweenNAndQ (int n, int q) {
		while (n < q){
			if (n % 2 == 0) {
				n += 2;
				System.out.println(n);
			} else if (n % 2 != 0) {
				n += 2;
				System.out.println(n);
			}
		}
		while (n > q) {
			if (n % 2 == 0) {
				n -= 2;
				System.out.println(n);
			} else if (n % 2 != 0) {
				n -= 2;
				System.out.println(n);
			}
		}
		
		
	}

}
