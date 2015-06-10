package ba.home.boris.week4.day3;

public class Task1 {
	
	public static void main(String[] args) {
		
		int[][] arr2d = {{1, 2, 1}, {5, 2, 8}, {-4, 2, 3}};
		
		System.out.println(countNumber(arr2d, 2)); // Calling method
		
		
	}


	/**
	 * Calculates how many times given number appears in 2D array.
	 * 
	 * @param matrix Inputed 2D <code>int</code> type array
	 * @param number Inputed <code>int</code> type number we want to check if it's in array
	 * @return Number of times inputed number appeared in 2D array
	 */
	public static int countNumber(int[][] matrix, int number) {
	
		int counter = 0; // Counter that will count how many times number appeared in array.
		for (int i = 0; i < matrix.length; i++) { // Goes thru length of rows.
			for (int j = 0; j < matrix[i].length; j++) { // Goes thru length of columns.
				if (matrix[i][j] == number) { // If number appeared anywhere within array.
					counter++; // Count it.
				}
			}
		}
		return counter; // Return value of counter.
	}
	
}