package hw18JavaSwitch;

import java.util.Scanner;

public class LevelOfJava {

	public static void main(String[] args) {
		System.out.println("<-- Please Write about your Java level -->");

		Scanner scanner = new Scanner(System.in);
		String myLevel = scanner.nextLine();

		// Step 04: Use switch method
		switch (myLevel.toLowerCase()) { // Using toLowerCase to make the switch case-insensitive
		case "beginner":
			System.out.println("I am at the beginning level");
			break;
		case "intermediate":
			System.out.println("I am at the intermediate level");
			break;
		case "expert":
			System.out.println("I am at expert level");
			break;
		case "excellent":
			System.out.println("I have a Java Certification from Oracle");
			break;
		default:
			System.out.println("I am a drop out");
			break;
		}

		// Don't forget to close the scanner
		scanner.close();
	}
}
