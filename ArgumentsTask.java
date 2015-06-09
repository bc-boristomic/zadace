package ba.home.boris.homework.from.classes;

public class ArgumentsTask {

	public static void main(String[] args) {

		float product = 1; // Float product starts at value 1.
		if (args.length == 0) { // If there is no arguments end program with message.
			System.out.println("No input = end program.");
			System.exit(0);
		}
		for (String num : args) { // Goes thru all the arguments,
			try {
				float number = Float.parseFloat(num); // Converts Strings to float numbers.
				product *= number; // Calculates product.
				System.out.printf("Formated strings to float numbers are %f\n", number); // Prints all converted numbers to console.
			} catch (NumberFormatException ex) { // If String can't be converted to float number print message and end program.
				System.out.println("Invalid input!");
				System.exit(0);
			}
		} // Otherwise everything went well so print product of all numbers entered.
		System.out.println("Product of numbers is " + product);
	}

}
