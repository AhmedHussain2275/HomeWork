package hw12Abstraction;

public interface University extends College, Hospital {

	/*----------------------HW12----------------------------
	 * Total keywords for inheritance in Interface: 'extends'. An interface can
	 * inherit other interfaces using the 'extends' keyword. An interface cannot
	 * inherit a regular class or an abstract class. An interface can extend
	 * multiple other interfaces (multiple inheritance).
	 */

	public void classSize();

	public void playGround();

	public void teacher();

	// public University() {} constructor are not allowed in interfaces

	default void gymnasium() {
		System.out.println("Deafult gymnasium method in university interface");

	}

	static void library() {
		System.out.println("static libary method in university interface");
	}

}

//...
/*
 * Step 05: Keywords for interface inheritance: 'extends' - An interface can
 * inherit other interfaces using 'extends'. - An interface cannot extend
 * regular classes or abstract classes. - Multiple inheritance is possible in
 * interfaces. For example: `interface University extends College, Hospital {
 * ... }`
 */
