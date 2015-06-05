package ba.home.boris.week3.day4;

public class Homework11 {

	public static void main(String[] args) {

		System.out.println(getMin2(7, 9)); // Task 1.a.
		System.out.println(getMin3(3, 2, 1)); // Task 1.b.

		System.out.println(getGrade(93)); // Task 2

		System.out.println(hasNumbers("5tring")); // Task 3

		System.out.println(getPercentage(50, 100)); // Task 4

		System.out.println(getNumbersOnly("5l33pn33d3d")); // Task 5

	}

	// Task 1.a. Return smaller of two numbers.
	public static int getMin2(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}

	// Task1.b. Return smaller of three numbers using previous method.
	public static int getMin3(int a, int b, int c) {
		if (a < getMin2(c, b)) {
			return a;
		} else {
			return getMin2(c, b);
		}
	}

	// Return grade for each case, 100 cases.
	public static char getGrade(int score) {

		switch (score) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
		case 30:
		case 31:
		case 32:
		case 33:
		case 34:
		case 35:
		case 36:
		case 37:
		case 38:
		case 39:
		case 40:
		case 41:
		case 42:
		case 43:
		case 44:
		case 45:
		case 46:
		case 47:
		case 48:
		case 49:
		case 50:
		case 51:
		case 52:
		case 53:
		case 54:
			return 'F';
		case 55:
		case 56:
		case 57:
		case 58:
		case 59:
		case 60:
		case 61:
		case 62:
		case 63:
			return 'E';
		case 64:
		case 65:
		case 66:
		case 67:
		case 68:
		case 69:
		case 70:
		case 71:
		case 72:
		case 73:
			return 'D';
		case 74:
		case 75:
		case 76:
		case 77:
		case 78:
		case 79:
		case 80:
		case 81:
		case 82:
		case 83:
			return 'C';
		case 84:
		case 85:
		case 86:
		case 87:
		case 88:
		case 89:
		case 90:
		case 91:
		case 92:
		case 93:
			return 'B';
		case 94:
		case 95:
		case 96:
		case 97:
		case 98:
		case 99:
		case 100:
			return 'A';
		}
		return ' ';

	}

	// Task3. Return true if characters in string are numbers, use ASCII to
	// check.
	public static boolean hasNumbers(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				return true;
			}
		}
		return false;
	}

	// Task4. Return value in percentage of two numbers
	public static double getPercentage(int N, int M) {
		return (double)N * 100 / (double)M;
	}

	// Task5. Return numbers from string, similar to Task3.
	public static String getNumbersOnly(String s) {
		String numbers = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				numbers = numbers + s.charAt(i);
			}
		}
		return numbers;
	}

}
