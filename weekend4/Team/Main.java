package ba.home.boris.homework.weekend4;

public class Main {
	
	public static void main(String[] args) {
		
		// Creating players in array
		Player[] p = new Player[11];
		p[0] = new Player("Marc-Andre ter Stegen", 1992, "GK");
		p[1] = new Player("Gerard Pique", 1987, "DF");
		p[2] = new Player("Ivan Rakitic", 1988, "MF");
		p[3] = new Player("Sergio Busquets", 1988, "MF");
		p[4] = new Player("Andres Iniesta", 1984, "MF");
		p[5] = new Player("Jordi Alba", 1989, "DF");
		p[6] = new Player("Dani Alves", 1983, "DF");
		p[7] = new Player("Javier Mascherano", 1984, "MF");
		p[8] = new Player("Neymar", 1992, "FW");
		p[9] = new Player("Luis Suarez", 1987, "FW");
		p[10]= new Player("Lionel Messi", 1987, "FW");
		
		// Creating team
		Team t1 = new Team("FC Barcelona", p);
		

		// Printing results of methods, hover mouse over method name to see what to input
		System.out.println(countPlayers(t1, 1984) + " Player(s) in "+ t1.teamName + " born that year.");
	
		System.out.println(countPlayers(t1, "FW") + " Player(s) in "+ t1.teamName + " play at that position.");
		
		System.out.println("Youngest player of " + t1.teamName + " is " + getYoungestPlayer(t1));
		
	}
	
	
	/**
	 * Calculates how many players in a team are born on year entered.
	 * 
	 * @param t Input is Object Team
	 * @param year Input is <code>int</code> type year 
	 * @return How many players in Team are selected age <code>int</code> type value
	 */
	public static int countPlayers(Team t, int year) {
		int counter = 0; // Counter
		for (int i = 0; i < t.playersInTeam.length; i++) { // Goes thru length of array players in Team
			if ( year == t.playersInTeam[i].yearOfBirth) { // Checks if selected year is the same as year of birth for each player 
				counter++; // If it's same count it
			}
		}
		return counter; // Return number of players born that year
		
	}
	
	/**
	 * Calculates how many players in a team play at some position provided by user input.
	 * 
	 * @param t Input is Object Team
	 * @param position Input is <code>String</code> type player position
	 * @return How many players in team play at that position <code>int</code> type value
	 */
	public static int countPlayers(Team t, String position) {
		int counter = 0; // Counter
		for (int i = 0; i < t.playersInTeam.length; i++) { // Goes thru length of array players in Team
			if (position.equals(t.playersInTeam[i].position)) { // Checks if players position is same as one entered by user
				counter++; // If it is count it
			}
		}
		return counter; // Return number of players who play at that position
	}
	
	
	/**
	 * Calculates who is youngest player in a team and returns his profile. 
	 * 
	 * @param t Input is Object Team
	 * @return Youngest player profile
	 */
	public static Player getYoungestPlayer(Team t) {
		int index = 0; // Index of array
		int min = 0; // Minimum year
		for (int i = 0; i < t.playersInTeam.length; i++) { // Goes thru length of array players in Team
			if (min < t.playersInTeam[i].yearOfBirth) { // Checks if player yearOfBirth is higher then previous player, if yes he is younger
				min = t.playersInTeam[i].yearOfBirth; // Assign value to higher year number
				index = i; // Player at that index is youngest
			}
		}
		return t.playersInTeam[index]; // Return player at youngest index in array
	}

}
