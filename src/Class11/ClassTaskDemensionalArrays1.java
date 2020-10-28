package Class11;

public class ClassTaskDemensionalArrays1 {

	public static void main(String[] args) {

		// Create a 2D array where you will store the following values:
		// Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
	
		//After storing values print the following:
		// Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		
		String [][]people = {
							{"Mr", "Mrs", "Ms", "Miss"},
							{"Smith", "Jordan", "Jackson", "Obama"},
							
		};
		
		System.out.println(people[0][1]+" "+people[1][0]);
		System.out.println(people[0][0]+" "+people[1][3]);
		System.out.println(people[0][2]+" "+people[1][2]);
		System.out.println(people[0][3]+" "+people[1][1]);
	}

}
