public class FizzBuzz {

	public static void main(String[] args) {

		/*Napisati program koji ce ocekivati broj kao argument i za proslijedjeni broj ispisati:
		 * - ako je broj djeljiv sa 3 - "Fizz"
		 * - ako je broj djeljiv sa 5 - "Buzz"
		 * - ako je broj djeljiv i sa 3 i sa 5 - "FizzBuzz"
		 * - inace ispisati sam broj
		 * Ocekivani ulaz/izlaz:
		 * 3 - Fizz
		 * 5 - Buzz
		 * 15 - FizzBuzz
		 * 17 - 17
		 */
		
		String num = args[0];
		int a = Integer.parseInt(num) % 3;
		int b = Integer.parseInt(num) % 5;
		if (a == 0 && b != 0) {
			System.out.println("Fizz");
		} else if (a != 0 && b == 0) {
			System.out.println("Buzz");
		} else if (a == 0 && b == 0) {
			System.out.println("FizzBuzz");
		} else {
			System.out.println(num);
		}
				
	}

}
