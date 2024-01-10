package hw7Inheritance;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.animalInfo();

		Mammal mammal = new Mammal();
		mammal.mammalInfo();

		Reptile reptile = new Reptile();
		reptile.reptileInfo();

		Birds birds = new Birds();
		birds.birdsInfo();

		Dog dog = new Dog();
		dog.dogInfo();

		Snake snake = new Snake();
		snake.snakeInfo();

		Robin robin = new Robin();
		robin.robinInfo();

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();

		Cobra cobra = new Cobra();
		cobra.cobraInfo();

		// All possible calls

		bullDog.dogInfo(); 							// from Dog class method
		bullDog.mammalInfo(); 					// from Mammal class method
		bullDog.animalInfo(); 						// from Animal class method
		
		

		// Single Inheritance: When a class extends one class only
		// Example: class Dog extends Mammal {}

		// Multilevel Inheritance: When a class is derived from a class which is also
		// derived from another class
		// Example: class BullDog extends Dog {} (BullDog -> Dog -> Mammal -> Animal)

		// Hierarchical Inheritance: When one class is inherited by multiple classes
		// Example: class Dog extends Mammal {} and class Cat extends Mammal {}

		// Parent class: Animal
		// Child class: Mammal extends Animal

	}

}
