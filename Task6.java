package home.boris.homework.weekend1;

public class Task6 {

	public static void main(String[] args) {
		
		/* 24 HH time to 12 HH time (AM/PM) Digital clocks excluded. Negative HH
		 * and above 24 HH excluded, 60 and above MM and negative MM excluded.
		 * Correct way of showing HH in AM/PM format (no 0 in front of single digit).
		*/

		int h = 0;
		int m = 60;
		boolean b = h >= 0 && h <= 24 && m >= 0 && m <= 59;
		boolean sameHours = (h == 1 || h == 2 || h == 3 || h == 4 || h == 5
				|| h == 6 || h == 7 || h == 8 || h == 9 || h == 10 || h == 11);
		boolean diffHours = (h == 13 || h == 14 || h == 15 || h == 16
				|| h == 17 || h == 18 || h == 19 || h == 20 || h == 21
				|| h == 22 || h == 23);

		if (b && sameHours) {
			System.out.printf("Time: %d:%02d AM", h, m);
		} else if (b && h == 12) {
			System.out.printf("Time: %d:%02d PM (noon)", h, m);
		} else if (b && diffHours) {
			System.out.printf("Time: %d:%02d PM", h - 12, m);
		} else if (h == 24 && m == 0) {
			System.out.printf("Time: %d midnight", h - 12);
		} else if (h == 24 && m > 0) {
			System.out.println("Illegal time, please correct.");
		} else if (h == 0 && m == 0) {
			System.out.printf("Time: %d:%02d AM (midnight)", h + 12, m);
		} else if (b && h == 0 && m > 0) {
			System.out.printf("Time: %d:%02d AM", h + 12, m);
		} else {
			System.out.println("Illegal time, please correct.");
		}

	}

}
