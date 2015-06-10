package ba.home.boris.week4.day2;

public class Task3 {
	
	public static void main(String[] args) {
		
		System.out.println("Each line prints count of numbers in each String of array args");
		for (int i = 0; i < args.length; i++) {
			System.out.println(getCountOfNumbers(args[i])); // Calculate number of digits that appear at every i index.
		}
		
	}
	
	/**
	 * Checks if inputed <code>String</code> have numbers in it, return amount of digits that appeared.
	 * 
	 * @param s Input is <code>String</code> value
	 * @return Count of numbers that appeared in s
	 */
	public static int getCountOfNumbers (String s) {
		
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				counter++;
			}
		}
		return counter;
	}
	
}
