package Class11;

public class TwoDemensionalArrays2 {

	public static void main(String[] args) {
		char[][] $array = new char[3][4];
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
		
		System.out.println($array.length);
		
		for(int row = 0; row<$array.length; row++) { // loops through rows
			for(int column=0; column< $array[row].length; column++) {
				System.out.print($array[row][column]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(" ---------------------");
		int [][]array = {
				{10,20,30},
				{1,2,3},
				{100,200,300},
				{200,300,500,1000},
		                        };
		System.out.println(array.length);
		for(int i = 0 ; i<array.length; i++) {
			for(int j = 0 ; j<array[i].length; j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
