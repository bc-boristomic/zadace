package ba.home.boris.week2day1;

public class Task2 {

	public static void main(String[] args) {
		// Sum of even numbers from 1 to n, excluding n.

		int n = 25;
		int sum = 0;
		int a = n; 				// Even n helper, no counter
		while (n > 0) {
			if (n % 2 == 0) {	// Exclude odd numbers from sum.
				sum += n; 		// Sum of all even n numbers including inputed even n.
			}
			n--;
		}
		if (a % 2 == 0) { 		// If inputed n is even number use helper
			System.out.println("Sum of all even numbers without entered number is "	+ (sum - a));
		} else {
			System.out.println("Sum of all even numbers without entered number is "	+ sum);
		}
	}
}