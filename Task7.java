package ba.home.boris.homewoork.weekend2;

public class Task7 {
	public static void main(String[] args) {

		int n = 14;
		int k = 5;
		int extra = 0;

		if (n % 2 != 0) {
			n++;
			extra++;
		}
		int n2 = n;
		while (n2 % 2 == 0) {
			n2 /= 2;
			if (n2 == extra) {
				break;
			} else if (n2 % 2 != 0) {
				n2 = n++;
				extra++;
			}
		}
		if (extra != 0) {
			System.out.printf("Additional containers needed %d", extra);
		} else {
			System.out.println("No need for aditional containers.");
		}

	}
}
