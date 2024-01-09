package hw6Methods;

public class FullName {

	public String FullNmae(String fName, String lName) {
		System.out.println("Family Member: " + fName + " " + lName);
		return fName + " " + lName;

	}

	public static void main(String[] args) {
		FullName fullName = new FullName();
		fullName.FullNmae("Ahmed", "Hussain");
		fullName.FullNmae("Imtiaz", "Hussain");

	}

}
