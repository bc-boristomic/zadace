package ba.home.boris.week2day4;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Your input file have numbers n and m in first line. Number n marks
		 * how many numbers will appear after n and m, while m marks number
		 * we're looking for. print if number m exist in n number.
		 */

		TextIO.readFile("input.in"); // Read from file.
		int n = TextIO.getInt(); // First number file.
		int m = TextIO.getInt(); // Second number from file.
		boolean found = true; // Used for checking.

		for (int i = 0; i < n; i++) {
			n = TextIO.getInt(); // Read next file number.
			if (n == m) {	// Check if it's same value as second.
				found = false; 	// If no leave boolean value.
				break;
			}
		}
		if (found == true) {
			System.out.println("Wanted number is in file. " + m);
		} else {
			System.out.println("Wanted number is not in file.");
		}

		
		
	}
}