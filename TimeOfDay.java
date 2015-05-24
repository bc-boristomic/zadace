public class TimeOfDay {

	public static void main(String[] args) {

		/*
		 * System.currentTimeMillis() vraca broj milisekundi koji je prosao od
		 * ponoci 1.1.1970, UTC (UTC je oznaka za vremensku zonu koja kasni 2
		 * sata za nasom zonom). Napisati program koji ce na osnovu vracene
		 * vrijednosti pomenute metode na standardni izlaz ispisati koji je dio
		 * dana: 6 - 10 - "Jutro" 10 - 18 - "Dan" 18 - 22 - "Vece" 22 - 6 -"Noc"
		 */

		long time = System.currentTimeMillis();
		int hours = (int) (((time / (60 * 60 * 1000)) % 24) + 2); // Milliseconds to hours to 24 hours format plus our time zone.

		if (hours >= 6 && hours <= 10) {
			System.out.println("Jutro");
		} else if (hours > 10 && hours <= 18) {
			System.out.println("Dan");
		} else if (hours > 18 && hours <= 22) {
			System.out.println("Vece");
		} else {
			System.out.println("Noc");
		}
	}

}
