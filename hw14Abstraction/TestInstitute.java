package hw14Abstraction;

public class TestInstitute {

	public static void main(String[] args) {

		ColumbiaUniversity columbia = new ColumbiaUniversity();
		columbia.biology();
		columbia.commonRoom();
		columbia.laboratory();
		columbia.languageClub();
		columbia.emergencyRoom();
		columbia.surgeryRoom();
		columbia.cafeteria();
		columbia.lawInfo();
		columbia.vocationalInfo();
		columbia.classSize();
		columbia.playGround();
		columbia.teacher();
		columbia.anatomyLab();
		columbia.hygiene();

		University university = new University() {

			@Override
			public void surgeryRoom() {
				// TODO Auto-generated method stub

			}

			@Override
			public void emergencyRoom() {
				// TODO Auto-generated method stub

			}

			@Override
			public void cafeteria() {
				// TODO Auto-generated method stub

			}

			@Override
			public void languageClub() {
				// TODO Auto-generated method stub

			}

			@Override
			public void laboratory() {
				// TODO Auto-generated method stub

			}

			@Override
			public void commonRoom() {
				// TODO Auto-generated method stub

			}

			@Override
			public void teacher() {
				// TODO Auto-generated method stub

			}

			@Override
			public void playGround() {
				// TODO Auto-generated method stub

			}

			@Override
			public void classSize() {
				// TODO Auto-generated method stub

			}
		};

		university.gymnasium();
		University.library();

		MedicalSchool medicalSchool = new MedicalSchool() {

			@Override
			public void lawInfo() {
				// TODO Auto-generated method stub

			}

			@Override
			public void hygiene() {
				// TODO Auto-generated method stub

			}

			@Override
			public void anatomyLab() {
				// TODO Auto-generated method stub

			}
		};

		medicalSchool.anatomyLab();
		medicalSchool.lawInfo();
		medicalSchool.hygiene();
		medicalSchool.biochemistryLab();

	}

}
