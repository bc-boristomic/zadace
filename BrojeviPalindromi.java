package ba.home.boris.week2day1;

public class BrojeviPalindromi {

	public static void main(String[] args) {
		/* Napraviti program koji ce za zadani broj provjeriti da li je
		 * palindrom. Palindrom je broj koji ima iste cifre bez obzira sa koje
		 * strane se cita, npr. 12321. U implementaciji koristiti while petlje i
		 * matematicke operacije, a ne operacije nad stringovima.
		 */
		
		int number = 1110111;	// Input number.
		int numberBackup = number; // Backup number for checking if it's palindrome and for printing.
		int palindromeCheck = 0; // Variable used to reverse input number.
		
		while (number != 0) { // Do until reach zero, will reach zero because last digit / 10 will be zero.  
			int digit = 0; // Variable used to get last digit.
			digit = number % 10; // Get last digit.
			palindromeCheck = palindromeCheck * 10 + digit; // Add last digit to new number as first digit. 
			number = number / 10; // Get rest of digits in inputed number (now without last digit) 
		}
		if (numberBackup == palindromeCheck) { // If inputed number is same as reverse it is palindrome.
			System.out.printf("Number you entered is palindrome. %d = %d", numberBackup, palindromeCheck);
		} else { // Otherwise it is not, print inputed and reversed number.
			System.out.printf("Number you entered is not palindrome. %d NOT %d", numberBackup, palindromeCheck);
		}
		
	}

}
