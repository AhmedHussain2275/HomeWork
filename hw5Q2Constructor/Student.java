package hw5Q2Constructor;

public class Student {

	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public Student() {

		System.out.println("---------This is from the default Constructor of the Student class.-----------\n");

	}

	public Student(String stName, int stID, char sex, float grade, boolean isProgrammer) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.grade = grade;
		this.isProgrammer = isProgrammer;

		System.out.println("Student Name: " + stName + ", ID: " + stID + ", Gender: " + sex + ", Grade: " + grade
				+ ", java Programmer?: " + isProgrammer + ".\n");

	}

}
