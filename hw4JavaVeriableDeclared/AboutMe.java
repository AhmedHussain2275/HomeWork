package hw4JavaVeriableDeclared;

public class AboutMe {
	// Variable declarations
	String name; // Variable declared
	byte age; // Variable declared
	short yearOfBirth; // Variable declared
	int favoriteNumber; // Variable declared
	long phoneNumber; // Variable declared
	float height; // Variable declared
	double weight; // Variable declared
	char gender; // Variable declared
	boolean fullTimeStudent; // Variable declared

	// Constructor declared
	public AboutMe() {
		System.out.println(":------------ This is all about us ------------:");
	}

	// Method implemented
	public void aboutMe() {
		System.out
				.println("Name: " + name + ", Age: " + age + ", \nYear of Birth: " + yearOfBirth + ", Favorite Number: "
						+ favoriteNumber + ", \nPhone: " + phoneNumber + ", Height:" + height + "feet, \nWeight: "
						+ weight + " lbs, Gender: " + gender + ", \nFull-time Student: " + fullTimeStudent);

	}
}