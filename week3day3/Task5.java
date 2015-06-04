package ba.home.boris.week3.day3;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Enter String array length using scanner.
		System.out.println("enter length of String array");
		int length = input.nextInt();
		
		String[] s = new String [length];
		
		// Enter value for each String array index.
		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter value at index " + i);
			s[i] = input.next();
		}
		
		// Take number to check (number is string)	
		System.out.println("Input number to check if it's in array");
		String num = input.next();
		
		// Check how many times that number appeared (compare strings)
		int c = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == num) {
				c++;
			}
		}
		System.out.printf("Number appeared %s times %d.", num, c);
		
		input.close();

	}

}
