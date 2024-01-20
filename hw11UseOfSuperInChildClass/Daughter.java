package hw11UseOfSuperInChildClass;

public class Daughter extends Father {
	// Step 07: Variables
	String birthMonth;
	int age;

	// Step 08: Default Constructor
	public Daughter() {
		super(); // Calls Father's default constructor
		System.out.println("Daughter default constructor");
	}

	// Step 08: Parameterized Constructor
	public Daughter(String birthMonth, int age) {
		super(); // Calls Father's default constructor
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Daughter parameterized constructor");
	}

	// Step 09: Regular Method
	public void daughter() {
		System.out.println("Daughter's void method");
	}

	// Step 10: Parameterized Method
	public void daughterInfo(String birthMonth, int age) {
		System.out.println("Daughter's info: Birth Month: " + birthMonth + ", Age: " + age);
	}

	// Step 13: Using super to access Father's 'familyName'
	public Daughter(String familyName) {
		super();
		super.familyName = familyName;
		System.out.println("Family Name set using super: " + familyName);
	}

	@Override
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		super.fatherInfo(name, age, sex, usCitizen);
	}
}