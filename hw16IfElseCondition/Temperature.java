package hw16IfElseCondition;

/*
 * HW16 Update in Step 07:
 * Issue: Original code missed temperatures exactly 73 and 101.
 * Fix: Changed conditions 'todaysTemperature < 101' to 'todaysTemperature <= 101'.
 * This adjustment ensures 73 and 101 are included in the "Very Hot" category.
 */

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("...................Today's Weather...................");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter today's temperature: ");
		int todaysTemperature = scanner.nextInt();

		if (todaysTemperature < 32) {
			System.out.println("Freezing");
		} else if (todaysTemperature < 55) {
			System.out.println("Pleasant");

		} else if (todaysTemperature < 73) {
			System.out.println("Getting Warmer");

		} else if (todaysTemperature <= 101) {
			System.out.println("Very Hot");

		} else {
			System.out.println("Please put a valid temperature");
		}

		scanner.close();
	}

}
