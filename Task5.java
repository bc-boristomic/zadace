package home.boris.homework.weekend1;

public class Task5 {

	public static void main(String[] args) {
		
		// Sort four numbers from smallest to largest.

		int a = 178;
		int b = 754;
		int c = 354;
		int d = 46;

		int min, min1, min2, max, max1, max2, m1, m2;

		if (a < b) {
			min1 = a;
			max1 = b;
		} else {
			min1 = b;
			max1 = a;
		}
		if (c < d) {
			min2 = c;
			max2 = d;
		} else {
			min2 = d;
			max2 = c;
		}
		if (min1 < min2) {
			min = min1;
			m1 = min2;
		} else {
			min = min2;
			m1 = min1;
		}
		if (max1 > max2) {
			max = max1;
			m2 = max2;
		} else {
			max = max2;
			m2 = max1;
		}
		if (m1 < m2) {
			System.out.printf("Sorted: %d %d %d %d", min, m1, m2, max);
		} else {
			System.out.printf("Sorted: %d %d %d %d", min, m2, m1, max);
		}

	}
}
