package hw14Abstraction;

public abstract class EngineeringSchool extends NYUniversity {

	public abstract void mechanicalLab(); // abstract method

	public void computerLab() {
		System.out.println("This is non-abstract  computerLab method");
	}

}
