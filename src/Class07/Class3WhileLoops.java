package Class07;

public class Class3WhileLoops {

	public static void main(String[] args) {

		int a = 10;
		while (a < 33) {
			
				System.out.println(a);
				a++; // IF we keep increment here --- we will get infinite loop
			

		}

		System.out.println(" --        another way\n");
		int b = 10;
		while (b <= 30) {
		System.out.println(b);
		b += 2; // b = 11 forever cause 11 can not be divided in 2.
		
		}

	}

}
