package ba.home.boris.week3.day3;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {

		int[] arr = new int[100];
		int num = 0;

		// For every i add index to array with value starting from 0 num.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num;
			num++;	// Increase value by one for each lap.
			if (num == 10) { // When value reaches 10, reset to 0.
				num = 0;
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
