package Class13;

public class CarGarage {

	public static void main(String[] args) {

		Car car1 = new Car(); // Car is the name of Class Car

		System.out.println("-----car 1 ----");
		car1.NumberOfDoors = 4;
		car1.color = "black";
		car1.size = 4;
		car1.make = "BMW";
		car1.model = "i8";

		Car car2 = new Car();

		car2.NumberOfDoors = 2;
		car2.color = "blue";
		car2.size = 2;
		car2.make = "lamborghini";
		car2.model = "Gallardo";

		Car car3 = new Car();

		car3.NumberOfDoors = 4;
		car3.color = "Red";
		car3.size = 4;
		car3.make = "Toyota";
		car3.model = "Corolla";
		
		
		
		Car car4 = new Car();

		car4.NumberOfDoors = 4;
		car4.color = "Gray";
		car4.size = 4;
		car4.make = "Toyota";
		car4.model = "Camry";

		System.out.println("car1.NumberOfDoors " + car1.NumberOfDoors);
		System.out.println("car1.color " + car1.color);
		System.out.println("car1.size " + car1.size);
		System.out.println("car1.make " + car1.make);
		System.out.println("car1.model " + car1.model);

		System.out.println("-----car 2 ----");
		System.out.println("car2.NumberOfDoors " + car2.NumberOfDoors);
		System.out.println("car2.color " + car2.color);
		System.out.println("car2.size " + car2.size);
		System.out.println("car2.make " + car2.make);
		System.out.println("car2.model " + car2.model);

		System.out.println("-----car 3 ----");
		System.out.println("car3.NumberOfDoors " + car2.NumberOfDoors);
		System.out.println("car3.color " + car3.color);
		System.out.println("car3.size " + car3.size);
		System.out.println("car3.make " + car3.make);
		System.out.println("car3.model " + car3.model);

		System.out.println("-----car 4 ----");
		System.out.println("car4.NumberOfDoors "+car4.NumberOfDoors);
		System.out.println("car4.color "+car4.color);
		System.out.println("car4.size "+car4.size);
		System.out.println("car4.make "+car4.make);
		System.out.println("car4.modle "+car4.model);
	}

}
