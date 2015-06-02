package ba.home.boris.week3.day2;

import java.util.Scanner;

public class TaskFromClasses {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {

			// Instructional message with scanner input for String type variable.
			System.out.println("Enter math expression int operator int");
			String mathExpression = input.nextLine();
						
			// Trim all empty spaces in mathExpression string.
			mathExpression = mathExpression.trim();

			// Set value for operator before checking what character is operator.
			char operator = 'o';
			int operatorIndex = 0;
			
			// Variable sum.
			int sum = 0;

			// Check what character is inputed operator.
			if (mathExpression.indexOf('+') != -1) {
				operator = '+';
				operatorIndex = mathExpression.indexOf('+');
			} else if (mathExpression.indexOf('-') != -1) {
				operator = '-';
				operatorIndex = mathExpression.indexOf('-');
			} else if (mathExpression.indexOf('*') != -1) {
				operator = '*';
				operatorIndex = mathExpression.indexOf('*');
			} else if (mathExpression.indexOf('/') != -1) {
				operator = '/';
				operatorIndex = mathExpression.indexOf('/');
			}

			// Get string before operator and convert to int number.
			String firstNumberString = mathExpression.substring(0,
					operatorIndex);
			int firstNumber = Integer.parseInt(firstNumberString);

			// Get string after operator and convert to int number.
			String secondNumberString = mathExpression.substring(
					operatorIndex + 1, mathExpression.length());
			int secondNumber = Integer.parseInt(secondNumberString);

			// Check all operators and do math operation accordingly.
			switch (operator) {
			case '+':
				sum = firstNumber + secondNumber;
				System.out.printf("You entered %d + %d, so sum is %d", firstNumber, secondNumber, sum);
				break;
			case '-':
				sum = firstNumber - secondNumber;
				System.out.printf("You entered %d - %d, so subtraction is %d", firstNumber, secondNumber, sum);
				break;
			case '*': 
				sum = firstNumber * secondNumber;
				System.out.printf("You entered %d * %d, so multiplication is %d", firstNumber, secondNumber, sum);
				break;
			case '/':
				sum = firstNumber + secondNumber;
				System.out.printf("You entered %d / %d, so division is %d", firstNumber, secondNumber, sum);
				break;
			}
		} catch (NumberFormatException ex) {
			System.out.println("Your input was wrong, try again.");
			System.out.println("Error number for your helpdesk is below.");
			ex.printStackTrace();
		}
		
		input.close();
	}
}
