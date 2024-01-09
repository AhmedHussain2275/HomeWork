package hw6Methods;

public class MyFamily {

	public int child1Age = 10;
	public int child2Age = 5;
	public int child3Age = 1;

	public int MyFamily() { // return type method with the same name as class.
		int sum = child1Age + child2Age + child3Age;
		System.out.println("The sum of my children's age is :" + sum);
		return sum;

	}

	public static void main(String[] args) {

		MyFamily family = new MyFamily();
		family.MyFamily();

	}

}
