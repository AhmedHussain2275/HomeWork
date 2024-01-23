package hw14Abstraction;

public interface College {

	public void commonRoom();

	public void laboratory();

	public void languageClub();

	default void dorm() {
		System.out.println("defult dorm method in college interface");
	}

	static void studyRoom() {
		System.out.println("defult studyRoom method in college interface");
	}

}
