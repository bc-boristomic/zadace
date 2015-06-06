package ba.home.boris.homework.from.classes;

public class Main {
	public static void main(String[] args) {
		
		Zivotinja dog = new Zivotinja(true, false, true, false, null, "Dog", 0, "woof-woof");
		Zivotinja lion = new Zivotinja(true, false, false, true, null, "Lion", 0, "rooar!");
		
		dog.makeSound();
		lion.makeSound();
	}

}
