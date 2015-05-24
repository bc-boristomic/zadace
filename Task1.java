package home.boris.homework.weekend1;

public class Task1 {

	public static void main(String[] args) {
		
		// Is it possible to construct triangle with values a, b, c?
		
		int a = 17;
		int b = 10;
		int c = 12;
		
		if ((a + b) > c && (a + c) > b && (b + c) > a) {				// Sum of any two sides of triangle is larger than the third side. 
			System.out.println("Triangle is possible to construct.");	// If condition is true, print out that it is possible to create triangle.
		} else {														// Otherwise
			System.out.println("Triangle is not possible to constuct.");// Condition is false, print out triangle can't be created.
		}
				
	}

}
