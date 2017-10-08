package vpa;

public class RobotCat extends Cat implements Robot {

	public RobotCat(String petName, String petType) {
		super(petName, petType);

	}

	int maintenanceLevel = 0;

	@Override
	public void oil() {
		maintenanceLevel += 5;

	}

}
