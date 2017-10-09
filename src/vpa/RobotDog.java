package vpa;

public class RobotDog extends Dog implements Robot {

	public RobotDog(String petName, int health) {
		super(petName, health);

	}

	int maintenanceLevel = 0;
	int happiness = 0;

	public int getMaintenanceLevel() {
		return maintenanceLevel;
	}

	@Override
	public void oil() {
		maintenanceLevel += 5;
	}

	@Override
	public void walk() {
		happiness += 10;
	}

	@Override
	public void tick() {
		happiness -= 5;
		maintenanceLevel -=5;

	}

}
