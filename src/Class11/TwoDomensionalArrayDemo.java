package Class11;

public class TwoDomensionalArrayDemo {

	public static void main(String[] args) {
		System.out.println("---First Way-------------");
		// new char[how many rows] [How many column];
		char[][] $array = new char[3][4];
		// Add values to the first row.
		$array[0][0] = 'A';
		$array[0][1] = 'A';
		$array[0][2] = 'A';
		$array[0][3] = 'A';

		// 2 row
		$array[1][0] = 'W';
		$array[1][1] = 'X';
		$array[1][2] = 'Y';
		$array[1][3] = 'Z';

		// 3 row

		$array[2][0] = 'Q';
		$array[2][1] = 'W';
		$array[2][2] = 'B';
		$array[2][3] = 'R';

		System.out.println($array[1][3]); // Z
		
		System.out.println();
		System.out.println("---Second Way-------------");
		
		int [][]array = {
				{10,20,30},
				{1,2,3},
				{100,200,300}	
		                        };
		
		System.out.println(array[0][0]); // 1
		System.out.println(array[0][1]); // 2
		System.out.println(array[0][2]); // 3
		
		System.out.println(array[1][0]); // 1
		System.out.println(array[1][1]); // 2
		System.out.println(array[1][2]); // 3
		
		System.out.println(array[2][0]); // 100
		System.out.println(array[2][1]); // 200
		System.out.println(array[2][2]); // 300
		
		
		System.out.println("The size of array of integers=" +array.length);
	}

}
