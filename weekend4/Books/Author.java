package ba.home.boris.homework.weekend4.part2;

public class Author {

	String authorName;
	int yearOfBirth;
	Book[] books;
	Author[] authors;

	public Author (String name, int year, Book[] books) {
		this.authorName = name;
		this.yearOfBirth = year;
		this.books = books;
	}
	
	public String toString() {
		String s = "";
		s += authorName + " ";
		
		return s;
	}
}
