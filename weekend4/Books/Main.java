package ba.home.boris.homework.weekend4.part2;

public class Main {
	
	public static void main(String[] args) {
		
	
	Book[] b1 = new Book[8];
	b1[0] = new Book("Barake pet Be", 1921, "novela", false); 
	b1[1] = new Book("Hrvatski bog Mars", 1922, "zbirka pripovijedaka", false);
	b1[2] = new Book("Gospoda Glembajevi", 1928, "drama", true);
	b1[3] = new Book("Povratak Filipa Latinovicza", 1932, "roman", true);
	b1[4] = new Book("Balade Petrice Kerempuha", 1936, "zbirka pjesama", false);
	b1[5] = new Book("Pjesme u tmini", 1937, "zbirka pjesama", false);
	b1[6] = new Book("Banket u Blitvi", 1938, "roman", true);
	b1[7] = new Book("Zastave", 1962, "roman", true);
		
	Author a1 = new Author("Miroslav Krleza", 1893, b1);
	
	
	Book[] b2 = new Book[7];
	b2[0] = new Book("Ex Ponto", 1918, "pjesme u prozi", false);
	b2[1] = new Book("Na Drini cuprija", 1945, "roman", true);
	b2[2] = new Book("Travnicka hronika", 1945, "roman", true);
	b2[3] = new Book("Gospodica", 1945, "roman", true);
	b2[4] = new Book("Prokleta avlija", 1954, "pripovijest", true);
	b2[5] = new Book("Goya", 1974, "esej", false);
	b2[6] = new Book("Omerpasa Latas", 1976, "roman", true);
	
	Author a2 = new Author("Ivo Andric", 1892, b2);
	
	
	Author[] aa = new Author[2];
	aa[0] = new Author("Miroslav Krleza", 1893, b1);
	aa[1] = new Author("Ivo Andric", 1892, b2);
	

	// Printing results of methods, hover mouse over method name to see what to input
	System.out.println(a1.authorName + " have " + countBestsellingBooks(a1) + " bestseller(s).");	
	
	System.out.println(a1.authorName + " released " + getNumberOfWrittenBooks(a1, 1932, 1938) + " book(s) in that period.");
	
	System.out.println("Author with more bestsellers is " + getAuthorWithMostBestsellers(aa));
	
	}
	
	
	/**
	 * Calculates how many bestsellers an author have among his/hers released books.
	 * 
	 * @param a Input is Author Object
	 * @return Number of bestsellers
	 */
	public static int countBestsellingBooks(Author a) {
		int counter = 0; // Counter
		for (int i = 0; i < a.books.length; i++) { // Goes thru book collection
			if (a.books[i].isBestseller == true) { // If any of the book is bestseller
				counter++; // Count it
			}
		}
		return counter; // Return count number
	}
	
	/**
	 * Calculates how many books an author have published from first inputed year 
	 * to second inputed year (including those years).
	 * 
	 * @param a Input is Author Object
	 * @param year1 Input is <code>int</code> type value
	 * @param year2 Input is <code>int</code> type value
	 * @return Number of books released from year1 until year2
	 */
	public static int getNumberOfWrittenBooks(Author a, int year1, int year2) {
		int counter = 0; // Counter
		for (int i = 0; i < a.books.length; i++) { // Goes thru book collection
			if (a.books[i].yearOfRelaese >= year1 && a.books[i].yearOfRelaese <= year2) { // Check if release years are equal or between inputed ones
				counter++; // If yes count it
			}
		}
		return counter; // Return number of published books between those years
	}
	
	
	
	/**
	 * Calculates witch of two authors have more bestsellers. Returns the name of that author.
	 * 	
	 * @param authors Input is Authors Object array
	 * @return Author name with more bestsellers
	 */
	public static Author getAuthorWithMostBestsellers(Author[] authors) {
		int counter1 = 0; // Counter for first author
		Author index1 = authors[0]; // Starting index
		int counter2 = 0; // Counter for second author
		Author index2 = authors[0]; // Starting index 
		for (int i = 0; i < authors.length; i++) { // Goes thru length of authors array 
			for (int j = 0; j < authors[i].books.length; j++) { // Goes thru length of first author books array
				if (authors[i].books[j].isBestseller = true) { // Checks if there are bestsellers
					counter1++; // Calculates it
					index1 = authors[i]; // Takes index of that author in array
				}
			}
			for (int j = 0; j < authors[i].books.length; j++) { // Goes thru length of second author books array
				if (authors[i].books[j].isBestseller = true) { // Checks if there are bestsellers
					counter2++; // Calculates it
					index2 = authors[i]; // Takes index of that author in array
				}
			}
		}
		if (counter1 > counter2) { // Compares whit of two have more bestsellers
			return index1; // Returns name of first
		}
		return index2; // Returns name of second
		
	}
	
}
