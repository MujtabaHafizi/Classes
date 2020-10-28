package Class11;

import java.util.Scanner;

public class HomeWork2DifferentWay {

	public static void main(String[] args) {
		
		/*
		  * create an array on double using scanner
		  * and calculate the sum of all elements that was stored in an array.
		  */
		double []num;	    double sum = 0;		    int size;

		Scanner userInput = new Scanner(System.in);

		System.out.println("How many numbers would you like to add up?");

		size = userInput.nextInt();

		num = new double[size];

		// store values into array

		for(int i = 0 ; i<size; i++) {

			System.out.println("Please enter double numbers");

			num[i] = userInput.nextDouble();
		}
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
	}
		System.out.println(sum);
	}

}
