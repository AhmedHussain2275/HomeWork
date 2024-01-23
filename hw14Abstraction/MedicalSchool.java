package hw14Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	/*--------------------------------------HW12----------------------------------------------
	 * Keywords for inheritance in abstract class: 'extends' and 'implements'. An
	 * abstract class can inherit another abstract class using 'extends'. An
	 * abstract class can implement interfaces using 'implements'. It cannot inherit
	 * from a regular class. It can implement multiple interfaces but only extend
	 * one class (single inheritance for 'extends').
	 */

	public abstract void anatomyLab(); // abstract method

	public void biochemistryLab() {
		System.out.println("This is non-abstract biochemistryLab method ");

	}

	public MedicalSchool() {
		// yes we can have constructor in an abstract class.

	}

	/*
	 * Step 06: Keywords for abstract class inheritance: 'extends' - An abstract
	 * class can inherit another abstract class using 'extends'. - An abstract class
	 * cannot implement interfaces directly; it must provide implementations for all
	 * abstract methods. - Only single inheritance is possible in abstract classes.
	 * For example: `abstract class MedicalSchool extends NursingSchool { ... }`
	 */

}
