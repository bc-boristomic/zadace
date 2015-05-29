package ba.home.boris.week2day4;

public class Task3 {

	public static void main(String[] args) {
		/* 
		 * Your file input.in have n + 1 numbers. First number is n. It shows
		 * how much numbers appear after. Print out lowest number in a file, n
		 * not included.
		 */

		TextIO.readFile("input.in"); // Read file input with list of numbers.
		int n = TextIO.getlnInt();	// Read number from line 1.
		int min = 1;

		for (int i = 0; i < n; i++) { // Start from zero and go to n number.
			n = TextIO.getlnInt(); // Now ask for next number.
			if (min > n) {	// Is 1 larger then number, if yes you have 0 in your file.
				min = n; // Then minimum will be 0.
			}
		}
		if (min == 0) { // Now check if there was zero in a file.
			System.out.println("Lowest number is: " + min); // If yes print zero as lowest.
		} else {
			System.out.println("Lowest number is:" + n);
		}
	}

}
