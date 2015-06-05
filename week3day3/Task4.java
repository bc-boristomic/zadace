package ba.home.boris.week3.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number");
		int n = input.nextInt();

		char[] arr = { 'B', 'I', 'T', 'C', 'A', 'M', 'P', 'I', 'N', 'G', };

		while (n > 0) {
			char c = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = c;
			n--;
		}

		while (n < 0) {
			char c = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = c;
			n++;
		}

		System.out.println(Arrays.toString(arr));

		input.close();
	}

}
