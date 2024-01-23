package hw13Polymorphism;

public class TestFamily {

	public static void main(String[] args) {

		Sister sister = new Sister();
		sister.sister(22);
		sister.sister("Five", 10);
		sister.sister(22, 5, 10);
		sister.sister(22, "35");
		sister.sister("Five");
		sister.sister(30, 40);

		// Step 09: Initialize all the methods from Niece class
		Niece niece = new Niece();
		niece.sister(25); // This will call the overridden method in Niece class

	}

}
