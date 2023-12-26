package hw4JavaVeriableDeclared;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe me = new AboutMe(); // Created an instance for myself
		me.name = "Md Ahmed Hussain";
		me.age = 22; // And so on for other variables
		me.yearOfBirth = 2001;
		me.gender = 'M';
		me.phoneNumber = 3473026171l;
		me.height = 5.6f;
		me.aboutMe();

		AboutMe friend = new AboutMe(); // an instance for my friend Alex
		friend.name = "Alex";
		friend.age = 30; // And so on for other variables
		friend.gender = 'M';
		friend.phoneNumber = 234567890l;

		friend.height = 5.6f;

		// Call aboutMe method for both instances
		friend.aboutMe();

	}
}