package ba.home.boris.week2day1;

public class Task1 {

	public static void main(String[] args) {
		// How many times you can divide a number before it turns to 0?

		int n = 10;
		int sum = 0;
		int a = 1;
		while (n > a) {
			if (n != 0) { // Do division until number is 0.
				n = n / a;
				sum++; // Count number of divisions.
			}
			a++;
		}
		System.out.printf("Number is divisible %d times.", sum);
	}
}