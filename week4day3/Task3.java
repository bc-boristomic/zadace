package ba.home.boris.week4.day3;

public class Task3 {
	
	public static void main(String[] args) {
		
		int[][] arr2d = {{1, 2, 1}, {5, 2, 8}, {-4, 2, 3}};
		
		System.out.println(getMaxPoints(arr2d, 1, 1)); // Calling method and printing results
		
	}
	
	/**
	 * Checks maximum number of points player can take in 3x3 <code>int</code> type
	 * 2D array if he is moving like knight in chess (L move).
	 * 
	 * @param matrix Input is 3x3  <code>int</code> type 2D array
	 * @param x Position on x axis
	 * @param y Position on y axis
	 * @return Max number of points
	 */
	public static int getMaxPoints(int[][] matrix, int x, int y) {
		String s = String.valueOf(y)+String.valueOf(x); // Get string value of both y and x to use in switch statement.
		int max = -4; // Max starts at -4 since it's lowest in array.
		switch (s) {
		case "00": // Position of a player entered by user
			max = matrix[0][0]; // Giving max that value 
			if (max < matrix[2][1]) { // Checking if value at possible location is higher
				max = matrix[2][1]; // If it is give max new value
			} 
			if (max < matrix[1][2]) { // Checking if value at possible second location is higher
				max = matrix[1][2]; // If it is give max new value
			}			// Do this for all possible 3x3 locations manually
			break; 
		case "01":
			max = matrix[0][1];
			if (max < matrix[2][0]) {
				max = matrix[2][0];
			} 
			if (max < matrix[2][2]) {
				max = matrix[2][2];
			}
			break;
		case "02":
			max = matrix[0][2];
			if (max < matrix[2][1]) {
				max = matrix[2][1];
			} 
			if (max < matrix[1][0]) {
				max = matrix[1][0];
			}
			break;
		case "10":
			max = matrix[1][0];
			if (max < matrix[0][2]) {
				max = matrix[0][2];
			} 
			if (max < matrix[2][2]) {
				max = matrix[2][2];
			}
			break;
		case "11":
			max = matrix[1][1]; // This position have no possible moves so give it value
			break;
		case "12":
			max = matrix[1][2];
			if (max < matrix[0][0]) {
				max = matrix[0][0];
			} 
			if (max < matrix[2][0]) {
				max = matrix[2][0];
			}
			break;
		case "20":
			max = matrix[2][0];
			if (max < matrix[0][1]) {
				max = matrix[0][1];
			} 
			if (max < matrix[1][2]) {
				max = matrix[1][2];
			}
			break;
		case "21":
			max = matrix[2][1];
			if (max < matrix[0][0]) {
				max = matrix[0][0];
			} 
			if (max < matrix[0][2]) {
				max = matrix[0][2];
			}
			break;
		case "22":
			max = matrix[2][2];
			if (max < matrix[1][0]) {
				max = matrix[1][0];
			} 
			if (max < matrix[0][1]) {
				max = matrix[0][1];
			}
			break;
			default: // If input is over 3x3 size print message and return original max value -4.
				System.out.println("Only works for 3x3 matrix.");
		}
		return max;
	}

}
