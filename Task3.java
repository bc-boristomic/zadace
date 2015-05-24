package home.boris.homework.weekend1;

public class Task3 {

	public static void main(String[] args) {
		
		// Which date comes first?
		
		int dayF = 22;
		int monthF = 5;
		int yearF = 2015;

		int dayS = 22;
		int monthS = 5;
		int yearS = 2015;

		double first = (dayF + monthF + (double)yearF) / 100000;
		double second = (dayS + monthS + (double)yearS) / 100000;

		if (first < second) {														// First date comes first.
			System.out.printf(dayF + "." + monthF + "." + yearF + ".");
		} else if (first > second) {												// Second date comes first.
			System.out.println(dayS + "." + monthS + "." + yearS + ".");
		} else {																	// Dates are the same! Please correct. 
			System.out.println("Dates are the same! Please correct.");
		}

		
	}

}
