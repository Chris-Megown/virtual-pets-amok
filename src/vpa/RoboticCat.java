package vpa;

public class RoboticCat extends Cat implements Robot {

	public RoboticCat(String petName, int health, int maintenanceLevel) {
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
