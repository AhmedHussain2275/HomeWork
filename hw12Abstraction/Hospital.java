package hw12Abstraction;

public interface Hospital {

	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	default void morgue() {
		System.out.println("defult morgue method in Hospital interface ");
	}

	static void pharmacy() {
		System.out.println(" static pharmacy methon in Hospital interface");
	}

}
