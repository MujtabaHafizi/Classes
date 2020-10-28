package Class12;

public class Q9 {

	public static void main(String[] args) {

		//create an array of countries: north America countries, south America countries, europe countries, asian countries, african countries. Then print all values from that array using 2 different loops and calculate how many total countries been stored.
		
		/*
		 * Create an array of countries: north America countries, south America
		 * countries, Europe countries, Asian countries, African countries. Then print
		 * all values from that array using 2 different loops and calculate how many
		 * total countries been stored.
		 */

		String[][] countries = {

							  with
		int sum = 0;

		for (String[] c : countries) {

			for (String name : c) {
				System.out.print(name + ". ");
				sum++;
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Total number of countries that has been stored is " + sum);


		System.out.println();
		System.out.println("--------------different loop--------------");

		int total = 0;

		for (int i = 0; i < countries.length; i++) {

			total = total + countries[i].length;
			for (int j = 0; j < countries[i].length; j++) {
				System.out.print(countries[i][j] + ". ");

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Total number of countries that has been stored is " + total);
	}

}
