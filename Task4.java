package home.boris.homework.weekend1;

public class Task4 {

	public static void main(String[] args) {
		
		/* What is your zodiac sign?
		 * 
		 * Month is equal to entered month and with zodiac month. Day starts from start of zodiac sign and ends with last day of that month.
		 * OR
		 * Month is equal to entered month and with zodiac month. Day starts with first day of that month and ends with last day of zodiac sign.
		*/
		
		int day = 31;
		int month = 6;
		
		if ((month == 3 && day >= 21 && day <= 31) || (month == 4 && day >= 1 && day <= 19)) {
			System.out.println("Your zodiac sign is Aries.");
		} else if ((month == 4 && day >= 20 && day <= 30) || (month == 5 && day >= 1 && day <= 20)) {
			System.out.println("Your zodiac sign is Taurus.");
		} else if ((month == 5 && day >=21 && day <= 31) || (month == 6 && day >= 1 && day <= 20)) {
			System.out.println("Your zodiac sign is Gemini.");
		} else if ((month == 6 && day >= 21 && day <= 30) || (month == 7 && day >= 1 && day <= 22)) {
			System.out.println("Your zodiac sign is Cancer.");
		} else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22)) {
			System.out.println("Your zodiac sign is Leo.");
		} else if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22)) {
			System.out.println("Your zodiac sign is Virgo.");
		} else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22)) {
			System.out.println("Your zodiac sign is Libra.");
		} else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21)) {
			System.out.println("Your zodiac sign is Scorpio.");
		} else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21)) {
			System.out.println("Your zodiac sign is Sagittarius.");
		} else if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 19)) {
			System.out.println("Your zodiac sign is Capricorn.");
		} else if ((month == 1 && day >= 20 && day <= 31) || (month == 2 && day >= 1 && day <= 18)) {
			System.out.println("Your zodiac sign is Aquarius.");
		} else if ((month == 2 && day >= 19 && day <= 29) || (month == 3 && day >= 1 && day <= 20)) {		// Don't discriminate people who celebrate birthday every four years.
			System.out.println("Your zodiac sign is Pisces.");
		} else {
			System.out.println("Please enter the date correctly.");
		}
		
	}

}
