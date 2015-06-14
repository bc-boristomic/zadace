package ba.home.boris.homework.weekend4.fromExercises;

public class Album {
	
	public String albumTitle;
	public Artist name;
	public Song[] songAlbumName;
	public String albumGenre;
	public Album[] albums;
	
	
	
	public Album(String albumTitle, Artist name, Song songName[],
			String albumGenre) {
		
		this.albumTitle = albumTitle;
		this.name = name;
		this.songAlbumName = songName;
		this.albumGenre = albumGenre;
	}
	
	
	public String toString() {
		String s = "";
		s += albumTitle + " ";
		
		
		return s;
	}
	
}