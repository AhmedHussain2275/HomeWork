package hw13Polymorphism;

/* 
 * Step 08: Method Overriding allows a subclass to provide a specific implementation for a method that is already defined in its superclass.
 * This is a part of runtime polymorphism. The method must have the same name, return type, and parameter list in the subclass.
 */

public class Niece extends Sister {
	// Step 07: Overriding methods
	@Override
	public void sister(int age1) { // Override possible
		System.out.println("Niece's age: " + (age1 + 5));
	}

	// Cannot override a static method
	// Cannot override a final method

}
