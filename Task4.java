package ba.home.boris.homewoork.weekend2;

public class Task4 {

	public static void main(String[] args) {

		TextIO.readFile("encodedFile.in");
		int n = TextIO.getlnInt(); // Read first line, only number.

		for (int i = 1; i <= n; i++) {
			String text = TextIO.getln(); // Read entire line, string.
			int l = text.length(); // Calculate length..
			for (int j = 0; j < l; j++) {
				char c = text.charAt(j); // Read all characters
				int broj = c - 1; // Subtract 1 from int characters (numbers).
				c = (char) broj; // Turn to characters, and print.
				System.out.print(c);
			}
			System.out.println();
		}

	}
}
