package home.boris.homework.weekend1;

public class Task7 {
	
	public static void main(String[] args) {

		// Enter four digits number and print sum of all of it's digits.

		int a = 1354;
		int num4 = 0;
		int num3 = 0;
		int num2 = 0;
		int num1 = 0;
		int sum = 0;

		if (a > 999 && a < 9999) { // Four digit limit
			num4 = a % 10; // Fourth digit
			a = a / 10; // First three numbers

			num3 = a % 10; // Third digit
			a = a / 10; // First two numbers

			num2 = a % 10; // Second digit
			a = a / 10; // First digit

			num1 = a; // Value of first digit

			sum = num1 + num2 + num3 + num4; // Sum of all digits
			System.out.println("Sum of digits in yout number is " + sum);
		} else
			System.out.println("Please enter four digit number.");

	}
}
