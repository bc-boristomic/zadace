package ba.home.boris.homework.weekend4;

public class Team {

	String teamName;
	Player[] playersInTeam;

	public Team(String name, Player[] players) {
		this.teamName = name;
		this.playersInTeam = players;
	}

	
	public String toString() {
		String s = "";
		s += teamName;
		return s;
	
	}
}
