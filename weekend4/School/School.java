package ba.home.boris.homework.weekend4.part3;

public class School {

	String name;
	Director director;
	Classes[] classes;
	School[] schools;

	public School(String name, Director director, Classes[] classes) {
		this.name = name;
		this.director = director;
		this.classes = classes;
	}
	
	
	public String toString() {
		String s = "";
		s += name + " ";
		
		return s;
	}

}
