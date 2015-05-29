package ba.home.boris.week2day4;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Print number from file input. in which have two numbers n and m. 
		 * Input those numbers and print all between them.
		 */
		
		TextIO.readFile("input.in");// Read from file input.in which have 2 numbers.
		int n = TextIO.getInt();	// Read number from line 1.
		int m = TextIO.getInt();	// Read number from line 2.
		
		for (int i = n + 1; i < m; i++) {	// Start from first number and go to last but don't include them. 
			System.out.println(i); // Count and print all numbers between them.
			
		}
	
	}
}
