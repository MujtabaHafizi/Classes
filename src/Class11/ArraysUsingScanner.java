package Class11;

import java.util.Scanner;

public class ArraysUsingScanner {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String [] cars = new String[3];
		String temp;
		
		for(int i = 0 ; i<cars.length; i++) {
			System.out.println("Please Enter The Car Model");
			temp = userInput.next();
			
			cars [i]= new String();

			
		}
		for(int i = 0 ; i<cars.length; i++) {
			System.out.println("Model "+ cars[i]);
		}
		System.out.println();
	}

}
