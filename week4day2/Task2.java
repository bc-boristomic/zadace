package ba.home.boris.week4.day2;

public class Task2 {

	public static void main(String[] args) {

		int min = 0;
		for (String number : args) { // Goes thru all the arguments.
			try {
				int num = Integer.parseInt(number); // Convert from String to int value.
				if (min > num) { // Find min number.
					min = num;
				}
			} catch (NumberFormatException ex) { // If cant't convert exit program with message.
				System.out.println("Please enter only numbers.");
				System.exit(0);
			}
		} // Print min number if everything checks.
		System.out.println("Min number is " + min);

	}
}