package ba.home.boris.homewoork.weekend2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String s = input.nextLine();
		int openedBrackets = 0;
		/**
		 * Goes thru length of input String and first checks if there is closed
		 * bracket '}' at first space. If yes prints false and stops the loop.
		 * Then checks how much there is opened and closed brackets and if
		 * number fits 0 prints true. If there is less opened brackets prints false.
		 */
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(0) == '}') {
				System.out.println(false);
				break;
			}
			if (s.charAt(i) == '{') {
				openedBrackets++;
			} else {
				openedBrackets--;
			}
			if (openedBrackets < 0) {
				System.out.println(false);
				System.exit(0);
			} 
		}
		
		if (openedBrackets == 0) {
			System.out.println(true);
		}

		input.close();
	}

}
