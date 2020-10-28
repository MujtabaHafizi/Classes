package Class13;

public class DogBehavior {

	public static void main(String[] args) {
		Dog pet = new Dog();

		pet.breed = "German Shepherd";
		pet.size = "Pretty Big";
		pet.age = 3;
		pet.color = "Black";
		pet.name = "Lessie";
		pet.type = " Bulldog";
		pet.isFriendly = true;
		pet.isHealthy = true;
		pet.gender = 'F';
		pet.bark();
		pet.sit();
		pet.play();
		pet.fetch();
		pet.sleep();
		pet.guard();
	}

}
