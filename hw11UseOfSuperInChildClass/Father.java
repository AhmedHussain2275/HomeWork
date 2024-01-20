package hw11UseOfSuperInChildClass;

public class Father {
	// Step 02: Variables
	String name;
	int age;
	char sex;
	boolean usCitizen;
	String familyName;

	// Step 03: Default Constructor
	public Father() {
		System.out.println("Father default constructor");
	}

	// Step 03: Parameterized Constructor
	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father parameterized constructor");
	}

	// Step 04: Regular Method
	public void father() {
		System.out.println("Father's void method");
	}

	// Step 05: Parameterized Method
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		System.out.println(
				"Father's info: Name: " + name + ", Age: " + age + ", Sex: " + sex + ", US Citizen: " + usCitizen);
	}
}