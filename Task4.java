package ba.home.boris.week2day2;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// Sum all divisors of number/
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input number");
		int n = in.nextInt();
		
		while (n != 0) { // while inputed number is not 0 run the program
			int sum = 0;	
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					sum += i;
				}
			}
			System.out.printf("Sum of all divisors is: %d\n", sum);
			System.out.println("Input number again");
			n = in.nextInt();
		} // zero entered, end loop
		System.out.println("End program");

		in.close();
	}
}
