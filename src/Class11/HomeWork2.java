package Class11;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		 /*
		  * create an array on double using scanner
		  * and calculate the sum of all elements that was stored in an array.
		  */
		double []num; 		double sum = 0; 		int size;

		Scanner scan = new Scanner(System.in);

		System.out.println("How many numbers would you like to add up?");

		size = scan.nextInt();

		num = new double[size];

		// store values into array

		for(int i = 0 ; i<size; i++) {

			System.out.println("Please enter double numbers");

			num[i] = scan.nextDouble();
		}

		for(double number : num) {

			sum +=number;
		}

		System.out.println(sum);

	}

}
