package Class12;

public class Q6 {

	public static void main(String[] args) {
		// Create a 2D array to store numbers in 3 rows and 3 columns. Print the sum of
		// all numbers.
		int[] array = { 200, 5, 7, 89, 45 };

		int max = array[0];

		for (int d = 1; d < array.length; d++) {
			if (array[d] > max) {
				max = array[d];
			}
		}
		System.out.println("largest number is " + max);

		int max2 = 0;

		for (int a = 0; a < array.length; a++) {
			if (array[a] >= max) { // I can either write like this (==max) or (>=max)
				continue;
			} else if (array[a] > max2) {
				max2 = array[a];
			}
		}

		System.out.println("second largest number is " + max2);

	}

}
