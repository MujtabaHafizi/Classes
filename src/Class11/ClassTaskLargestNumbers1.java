package Class11;

public class ClassTaskLargestNumbers1 {

	public static void main(String[] args) {
		// I would like to find the largest number from the array
				int[] array = { 10,3580, 20, 30, 60, 50, 2500 };
				
				int max = array[0];
				
				for (int i = 1; i < array.length; i++) {
					if (array[i] > max) {
						max = array[i];
					}
				}
				System.out.println("The largest number from an array is " + max);
	}

}
