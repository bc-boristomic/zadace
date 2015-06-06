package ba.home.boris.homework.from.classes;

public class Zivotinja {

	private boolean isCarnivore;
	private boolean isHerbivore;
	private boolean isDomestic;
	private boolean isWild;
	private String species;
	private String name;
	private double mass;
	private String sound;

	// Public constructor
	public Zivotinja(boolean isCarnivore, boolean isHerbivore,
			boolean isDomestic, boolean isWild, String species, String name,
			double mass, String sound) {
		super();
		this.isCarnivore = isCarnivore;
		this.isHerbivore = isHerbivore;
		this.isDomestic = isDomestic;
		this.isWild = isWild;
		this.species = species;
		this.name = name;
		this.mass = mass;
		this.sound = sound;
	}
	
	
	public void makeSound () {
		System.out.println(this.sound);
	}

}
