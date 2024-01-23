package hw14Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	// public abstract void chemistry(); Abstract method cannot be created inside a
	// regular class

	/*
	 * -------------------------HW12-------------------------------------------
	 * Keywords for inheritance in a regular class: 'extends' and 'implements'. A
	 * regular class can extend one other class (either regular or abstract) using
	 * 'extends'. A regular class can implement interfaces using 'implements'. It
	 * can implement multiple interfaces but only extend one class (single
	 * inheritance for 'extends').
	 */

	public void biology() {

		System.out.println("This is non-abstract biology method");

	}

	public ColumbiaUniversity() {
		// yes we can create a constructor in regular class.
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

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
