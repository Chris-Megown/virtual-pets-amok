package vpa;

public class RobotCat extends Cat implements Robot {

	public RobotCat(String robotCatName, String robotCatType) {
	}

	int maintenanceLevel = 0;

	@Override
	public int oil() {
		return maintenanceLevel += 5;

	}

}
