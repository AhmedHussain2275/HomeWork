package hw5Q1Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		Computer computer1 = new Computer(); // Using the default constructor
		computer1 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false); // Parameterized constructor
		Computer computer2 = new Computer("Lenovo", "Flex 5", "Windows 11", 700, 'B', true); // Mock data for a Windows
																								// laptop
	}
}
