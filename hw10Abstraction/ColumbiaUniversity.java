package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool {

	// public abstract void chemistry(); Abstract method cannot be created inside a
	// regular class

	public void biology() {

		System.out.println("This is non-abstract biology method");

	}

	public ColumbiaUniversity() {
		// yes we can create a constructor in regular class.
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * Step 07: Keywords for regular class inheritance: 'extends' - A regular class
	 * can inherit an abstract class or another regular class using 'extends'. - A
	 * regular class cannot extend multiple classes or interfaces; it can implement
	 * multiple interfaces. - Only single inheritance is possible by 'extends' in
	 * regular classes. For example: `class ColumbiaUniversity extends MedicalSchool
	 * 
	 */
}
