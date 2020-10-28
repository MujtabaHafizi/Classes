package Class12;

public class HomeWork {

	public static void main(String[] args) {

		/*
		 * write a program to swap 2 number without a temporary available?
		 * 
		 */
		int x = 10;
		int y = 20;

		x = y + x; // 30
		y = x - y;// 10
		x = y - y;// 20

		System.out.println("Value of x = " + x);
		System.out.println("Value of y = " + y);

	}

}
