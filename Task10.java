package home.boris.homework.weekend1;

public class Task10 {

	public static void main(String[] args) {

		/* Equation must be true ax^3 + bx^2 + cx +d = 0
		 * otherwise give potential result.
		*/
		
		int a = 1;
		int b = 9;
		int c = 1;
		int d = 2;
		
		int x = 4;
		
		int result = a * (x * x * x) + b * (x * x) + c * x + d;
		
		if (result == 0) {
			System.out.println("Given number solves equation.");
			System.out.println();
		} else {
			System.out.println("Given number is not solution.");
			System.out.println("Equation equals to " + result);
			
			x = 0;	// new values
			d = 0;	// new values
			result = a * (x * x * x) + b * (x * x) + c * x + d;
			System.out.println("Potential solution is x = 0 and d = 0" + " which equals to " + result);
		}
		
	}

}
