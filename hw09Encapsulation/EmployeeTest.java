package hw09Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.setName("Ahmed Hussain");
		employee.setAge(22);
		employee.setSex('M');
		employee.setCitizen(true);

		System.out.println("..............Employ Info............... ");
		System.out.println("Name: " + employee.getName());
		System.out.println("Age: " + employee.getAge());
		System.out.println("Sex: " + employee.getSex());
		System.out.println("Citizen: " + employee.isCitizen());

	}

}
