package vpa;

public class RobotCat extends Cat implements Robot {

	public RobotCat(String petName, int health) {
		super(petName, health);
	}

	int maintenanceLevel = 0;

	public int getMaintenanceLevel() {
		return maintenanceLevel;
	}

	@Override
	public void oil() {
		maintenanceLevel += 5;

	}
	
	@Override
	public void tick() {
		maintenanceLevel -=5;
	}

}
