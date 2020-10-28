package Class10;

public class ArraysHomeWork2 {

	public static void main(String[] args) {
		System.out.println("--------------First Way-------------");
		String[] animals = new String[6];
		animals[0] = "Donkey";
		animals[1] = "Monkey";
		animals[2] = "Horse";
		animals[3] = "Zebra";
		animals[4] = "Lion";
		animals[5] = "Tiger";

		System.out.print(animals[0] + " ");
		System.out.print(animals[1] + " ");
		System.out.print(animals[2] + " ");
		System.out.print(animals[3] + " ");
		System.out.print(animals[4] + " ");
		System.out.print(animals[5] + " ");

		System.out.println();
		System.out.println("--------------Second Way-------------");
		
		String[]animal = {"Donkey", "Monkey", "Horse","Zebra", "Lion", "Tiger"};
		System.out.print(animal[0]+" ");
		System.out.print(animal[1]+" ");
		System.out.print(animal[2]+" ");
		System.out.print(animal[3]+" ");
		System.out.print(animal[4]+" ");		
		System.out.print(animal[5]+" ");

		System.out.println();
		System.out.println("--------------Another Way-------------");
		for(String jungle:animal) {
			System.out.print(jungle+ " ");
		}
		System.out.println();
		System.out.println("--------------SecondAnother Way-------------");
		for(int i = 0; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
		}
	}

}
