package Class11;

public class ClassTaskLargestNumbers {

	public static void main(String[] args) {
		System.out.println("-----------Regular For Loops-------");
		int[][] array = {
					   { 10, 20, 30, 40, 50 },
		               { 10, 20, 30, 40, 50 },
		               };
	
		for (int i = 0; i < array.length; i++) {
			for(int j =  0 ; j<array[i].length; j++) {
				System.out.print(array[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println("-----------Regular For Loops-------");
		for(int[]number:array) {
			for(int num1:number) {
				System.out.print(num1+" ");
			}
			System.out.println();
		}
	
	}

}
