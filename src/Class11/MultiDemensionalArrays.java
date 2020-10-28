package Class11;

public class MultiDemensionalArrays {

	public static void main(String[] args) {
		int table[][] = new int[4][4];

		table[0][0] = 10;
		table[0][1] = 50;
		table[0][2] = 100;
		table[0][3] = 200;

		table[1][0] = 100;
		table[1][1] = 500;
		table[1][2] = 110;
		table[1][3] = 280;

		table[2][0] = 170;
		table[2][1] = 150;
		table[2][2] = 99;
		table[2][3] = 250;

		table[3][0] = 199;
		table[3][1] = 56;
		table[3][2] = 125;
		table[3][3] = 236;

		System.out.println(table[0][0] + " " + table[0][1] + " " + table[0][2] + " " + table[0][3]);
		System.out.println(table[1][0] + " " + table[1][1] + " " + table[1][2] + " " + table[1][3]);
		System.out.println(table[2][0] + " " + table[1][1] + " " + table[2][2] + " " + table[2][3]);
		System.out.println(table[3][0] + " " + table[3][1] + " " + table[3][2] + " " + table[3][3]);

	}

}
