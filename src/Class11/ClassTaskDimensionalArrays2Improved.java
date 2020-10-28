package Class11;

public class ClassTaskDimensionalArrays2Improved {

	public static void main(String[] args) {
		System.out.println("-----------Regular For Loops-----------");

		String [][]cars= {
		         {"Jeep", "Ford", "Dodge"},  
				 {"Audi", "Porsche", "BMW"},
				 {"Kia", "Hyundai", "hyundai sonata"},
				 {"Ferrari", "Maserati", "Lamborghini"},
		         };
				
		for(int i = 0; i<cars.length; i++) {
			for(int j = 0 ; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("-----------Enhaned For Loops-----------");
		for(String[] auto:cars) {
			for(String motor: auto) {
				System.out.print(motor+" ");
			}
			System.out.println();
		}

	}

}
