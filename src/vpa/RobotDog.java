package vpa;

public class RobotDog extends Dog implements Robot {

	public RobotDog(String robotDogName, String robotDogType) {
	}

	int maintenanceLevel = 0;
	int happiness = 0;


	@Override
	public int oil() {
		return maintenanceLevel += 5;
	}

	@Override
	public int walk() {
			return happiness += 10;
		}

}
