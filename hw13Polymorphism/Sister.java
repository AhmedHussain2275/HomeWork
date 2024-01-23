package hw13Polymorphism;

/* 
 * Step 04: Method Overloading in Java is a feature that allows a class to have more than one method with the same name, 
 * as long as their parameter lists are different. This is useful when you want to perform similar actions with different inputs.
 * The compiler differentiates these methods by the number of parameters and their types.
 */
public class Sister {

	public void sister(int age1) {

		System.out.println("Sister with Age1: " + age1);

	}

	public void sister(String age1, int age2) {
		System.out.println("Sister with Age1 and Age2: " + age1 + "," + age2);

	}

	public void sister(int age1, int age2, int age3) {
		System.out.println("Sister with Age1 ,Age2 and Age3: " + age1 + "," + age2 + "," + age3);

	}

	public int sister(int age1, String age4) {
		System.out.println("Sister with age 1 and age 4: " + age1 + "," + age4);
		return Integer.parseInt(age4);

	}

	public static void sister(String age4) {
		System.out.println("Sister with age4: " + age4);

	}

	public final void sister(int age5, int age6) {
		System.out.println("Sister with age5 and age6: " + age5 + "," + age6);
	}

}
