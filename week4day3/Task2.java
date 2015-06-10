package ba.home.boris.week4.day3;

public class Task2 {

	public static void main(String[] args) {

		int[][] arr2d = { { 1, -2, 1 }, { 5, 0, 4 }, { -4, 2, 2 } };

		System.out.println(getNumOfZeroRowsAndColumns(arr2d)); // Calling method and printing results.

	}

	
	/**
	 * Calculates if sum of each row and column in 2D <code>int</code> type array is zero and counts if it is.
	 * 
	 * @param matrix Input is 2D <code>int</code> type array
	 * @return Number of rows and columns that summed equals to zero.  
	 */
	public static int getNumOfZeroRowsAndColumns(int[][] matrix) {

		int counter = 0; // Counter for rows
		int sum = 0; // Sum for columns
		for (int i = 0; i < matrix.length; i++) { // Goes thru length of rows.
			for (int j = 0; j < matrix[i].length; j++) { // Goes thru length of columns.
				sum += matrix[i][j]; // Sums all rows.
				if (sum == 0) { // If sum is zero
					counter++; // Count it
				}
			}
		}

		int counter2 = 0; // Counter for columns
		int sum2 = 0; // Sum for columns
		for (int i = 0; i < matrix.length; i++) { // Goes thru length of rows.
			for (int j = 0; j < matrix[i].length; j++) { // Goes thru length of columns.
				sum2 += matrix[j][i]; // Sums all columns.
				if (sum2 == 0) { // If sum is zero
					counter2++; // Count it
				}
			}
		}
		return counter += counter2; // Return both counters combined.
	}

}
