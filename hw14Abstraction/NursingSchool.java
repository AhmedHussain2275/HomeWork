package hw14Abstraction;

public abstract class NursingSchool extends RockefellerUniversity{

	public abstract void hygiene(); // abstract method

	public void caring() {
		System.out.println("This is non-abstract caring method");
	}

}
