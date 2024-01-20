package hw11UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		// Step 06: Instantiate Father class and initialize methods
		System.out.println("---- Father's Info ----");
		Father father = new Father();
		Father fatherParam = new Father("Abdul", 65, 'M', true);
		father.father();
		father.fatherInfo("Abdul", 65, 'M', true);

		// Step 11: Instantiate Daughter class and initialize methods
		System.out.println("\n---- Daughter's Info ----");
		Daughter daughter = new Daughter();
		Daughter daughterParam = new Daughter("January", 25);
		daughter.daughter();
		daughter.daughterInfo("January", 25);

		// Step 12 and 13: Instantiate Daughter with super keyword and initialize
		// methods
		System.out.println("\n---- Daughter with Super's Info ----");
		Daughter daughterWithSuper = new Daughter("Hussain");
		daughterWithSuper.fatherInfo("Jasmin", 25, 'F', true); // This will call the overridden method in Daughter
	}
}