package ba.home.boris.homework.weekend4;

public class Player {
	
	String playerName;
	int yearOfBirth;
	String position;

	
	public Player (String name, int year, String position) {
		this.playerName = name;
		this.yearOfBirth = year;
		this.position = position;
	}


	public String toString() {
		String s = "";
		s += playerName + ", ";
		s += yearOfBirth + ", ";
		s += position + "\n";
		
		return s;
	}
}
