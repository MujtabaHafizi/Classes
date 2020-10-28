package Class11;

public class ClassTaskDimensionalArrays2 {

	public static void main(String[] args) {
		System.out.println("------Enhanced For Loops--------");
		String[][] cars = { { "Jeep", "Ford", "Dodge" }, 
				{ "Audi", "Porsche", "BMW" },
				{ "Kia", "Hyundai", "hyundai sonata" },
				{ "Ferrari", "Maserati", "Lamborghini" },
				};

		for (String[] carArray : cars) {
			for (String car : carArray) {
				System.out.print(car + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("------Regular For Loops------");
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
			}
		}
	}

}
