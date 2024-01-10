package hw8Abstraction;

public abstract class MedicalSchool {

	public abstract void anatomyLab(); // abstract method

	public void biochemistryLab() {
		System.out.println("This is non-abstract biochemistryLab method ");

	}

	public MedicalSchool() {
		// yes we can have constructor in an abstract class.

	}

}
