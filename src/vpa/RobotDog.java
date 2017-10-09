package vpa;

public class RobotDog extends Dog implements Robot {

	public RobotDog(String petName, String petType){
		super(petName, petType);

	}

	int maintenanceLevel = 0;
	int happiness = 0;

	@Override
	public void oil() {
		maintenanceLevel += 5;
	}

	@Override
	public void walk() {
		happiness += 10;
	}

	public int getMaintenanceLevel() {
		return maintenanceLevel;
	}

}
