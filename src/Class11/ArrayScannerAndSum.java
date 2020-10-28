package Class11;

import java.util.Scanner;

public class ArrayScannerAndSum {

	public static void main(String[] args) {
		double sum = 0;
		int size;
		double[] num;
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many numbers would you like to add up?");
		size = userInput.nextInt();
		
		num = new double [size];
		
		// store values into array
		for(int i = 0; i<size; i++) {
			System.out.println("Please enter double numbers");
			num[i]= userInput.nextDouble();
		}
		// loop through created array
		for(int i =  0; i<num.length; i++) {
			sum = sum + num[i];
			
		}
		System.out.println(sum);
	}

}
