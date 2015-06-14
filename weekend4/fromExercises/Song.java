package ba.home.boris.homework.weekend4.fromExercises;

public class Song {

	public Artist name;
	public String songName;
	public int songYear;
	public String songGenre;
	
	
	
	public Song(Artist name, String songName, int songYear, String songGenre) {

		this.name = name;
		this.songName = songName;
		this.songYear = songYear;
		this.songGenre = songGenre;
	}

	
	public String toString() {
		String s = "";
		s += "Song name: " + songName + "";
		
		return s;
	}
	
	
}