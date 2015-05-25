package ba.home.boris.week2day1;

public class Task3 {

	public static void main(String[] args) {
		// Find a perfect number

		int n = 6;
		int sum = 0;
		int a = 1;

		while (n > a) { 		// Exclude input number
			if (n % a == 0) { 	// Sum all numbers divisible by input number
				sum += a;
			}
			a++;
		}
		if (sum == n) {
			System.out.println("Found it!");
		} else {
			System.out.println("Try again!");
		}
	}
}