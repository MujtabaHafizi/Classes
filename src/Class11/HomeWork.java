package Class11;

public class HomeWork {

	public static void main(String[] args) {
		/*
		 * create an array of animals and store 6  elements into it.
		 * lopps print all elements from the array.
		 */
		String []animals= {"lion","Tiger", "Goat", "Cow","Wolf","Panther","Gorilla", "Cheeta"};
		for(int i = 0 ; i<animals.length; i++) {
			System.out.print(animals[i]+ " ");
		}
		System.out.println();
		System.out.println();
		for(String sheep:animals) {
			System.out.print(sheep+ " "); // Enhanced For Loops.
		}
	}

}
