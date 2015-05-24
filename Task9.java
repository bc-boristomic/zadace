package home.boris.homework.weekend1;

public class Task9 {
	
	public static void main(String[] args) {

		// Enter three digit number and print if the number is divisible by the sum of it's digits.

		int a = 104;
		int num3 = 0;
		int num2 = 0;
		int num1 = 0;
		int sum = 0;
		int b = 0;

		if (a > 99 && a < 999) { // Three digit limit

			num3 = a % 10; // Third digit
			b = a / 10; // First two numbers

			num2 = b % 10; // Second digit
			b = b / 10; // First digit

			num1 = b; // Value of first digit

			sum = num1 + num2 + num3; // Sum of all digits

			sum = a % sum; // Sum of modulo given number and sum of three digits
			if (sum == 0) { // If it equals zero it is divisible, othervise no.
				System.out.println("Three digit number is divisable by it's sum.");
			} else {
				System.out.println("Three digit number is NOT divisable by it's sum.");
			}
		} else
			System.out.println("Please enter three digit number.");
	}

}
