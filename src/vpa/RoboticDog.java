package vpa;

public class RoboticDog extends Dog implements Robot {

	public RoboticDog(String petName, int health, int maintenanceLevel) {
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
		happiness += 20;
	}

	@Override
	public void tick() {
		happiness -= 5;
		maintenanceLevel -=5;

	}

}
