package hw3JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();

		System.out.println("Name: " + aboutMe.myName + ", Age: " + aboutMe.myAge + ", \nYear of Birth: "
				+ aboutMe.yearOfBirth + ", Favorite Number: " + aboutMe.favoriteNumber + ", \nPhone: "
				+ aboutMe.phoneNumber + ", Height:" + aboutMe.height + "feet, \nWeight: " + aboutMe.weight
				+ " lbs, Gender: " + aboutMe.gender + ", \nFull-time Student: " + aboutMe.fullTimeStudent);

	}

}