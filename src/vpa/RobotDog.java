package vpa;

public class RobotDog extends Dog implements Robot {

	public RobotDog(String robotDogName, String robotDogDescription ) {
	}
	
	int maintenanceLevel = 0;
	@Override
	public int oil() {
		return maintenanceLevel+= 5;
	}

}
