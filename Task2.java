package home.boris.homework.weekend1;

public class Task2 {

	public static void main(String[] args) {
		
		// Is number a between 5 and 7.5, or between 7.5 and 10, or is it out of range?
		
		double anyNum = 8.3;
		boolean rangeOne = anyNum >= 5 && anyNum <= 7.5;			// Range between 5 and 7.5
		boolean rangeTwo = anyNum > 7.5 && anyNum <= 10;			// Range between 7.5 and 10
		
		if (rangeOne) {
			System.out.println("Given number is between range 5 and 7.5");
		} else if (rangeTwo) {
			System.out.println("Given number is between range 7.5 and 10");
		} else {
			System.out.println("Number is out of range.");
		}

	}

}
