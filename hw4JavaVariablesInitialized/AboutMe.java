package hw4JavaVariablesInitialized;

public class AboutMe {
	// Variable declaration

	String exampleVariable;

	// Variable initialization

	String myName = "Md Ahmed Hussain";
	byte myAge = 22;
	short yearOfBirth = 2001;
	int favoriteNumber = 25;
	long phoneNumber = 3473026171L;
	float height = 5.6f;
	double weight = 120.5;
	char gender = 'M';
	boolean fullTimeStudent = false;

	// constructor

	public AboutMe() {
		System.out.println(":------------ This is all about Myself ------------:");

	}

	// Method implemented.
	public void aboutMe() {
		System.out.println(
				"Name: " + myName + ", Age: " + myAge + ", \nYear of Birth: " + yearOfBirth + ", Favorite Number: "
						+ favoriteNumber + ", \nPhone: " + phoneNumber + ", Height:" + height + "feet, \nWeight: "
						+ weight + " lbs, Gender: " + gender + ", \nFull-time Student: " + fullTimeStudent);

	}

}