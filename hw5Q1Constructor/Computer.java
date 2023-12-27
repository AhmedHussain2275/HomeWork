package hw5Q1Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	// Default Constructor declare
	public Computer() {
		System.out.println("This is from the default Constructor of Computer class.\n");
	}

	// parameterized constructor declare
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		super();
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("-----------------------Laptop Configuration-----------------------------\n");
		System.out.println(" My Brand: " + brand + ", Model:" + model + ", Operating system: " + operatingSystem
				+ ", Price: " + price + ", Grade: " + grade + ", Made in the USA?: " + madeInUSA + ".\n");
	}
}
