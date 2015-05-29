package ba.home.boris.week2day4;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Read decimal number from decimal.in file, convert number to binary
		 * and save to binary.out file.
		 */
		
			TextIO.readFile("decimal.in"); 	// Read decimal.in file.
		    int decimal = TextIO.getInt();	// Get first decimal number.
		    	    
		    String binary = Integer.toBinaryString(decimal); // Convert decimal to binary.
		    TextIO.writeFile("binary.out");	// Save output to binary.out file.
		    TextIO.putln(binary);
}
}

