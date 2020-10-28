package Class11;

public class ClassTaskDemensionalArrays3 {

	public static void main(String[] args) {
		// create 2D array of food:
		// 	American
			// italian
			// asian
			// afghani
			// indian
			
			
			String[][] food = { 
					{ "Steak", "Hot ", "Cheeseburger" },  // for(int i = 0 ; i<food.length; i++) { it show 5 rows
				    { "Pizza", "Pasta", "Canoli" },
					{ "Sushi", "Ramen", "Fried rice", "Dumplings" }, 
					{ "Kebab", "Manto", "Ashak", "Boolani" },
					{ "Beryani", "masala", "Checken Tandoori", "Curry" } };

			for (String[] dishes : food) {
				for (String dish : dishes) {
					System.out.print(dish + "  ");
				}
				System.out.println();
			}

			System.out.println("--------------Regular loops");
			for(int i = 0 ; i<food.length; i++) {
				for(int j = 0 ; j<food[i].length; j++) { // what does it mean? 
														// 3	
					System.out.print(food[i][j]+ " ");
				}
				System.out.println();
			}
	}

}
