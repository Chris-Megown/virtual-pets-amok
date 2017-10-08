package vpa;

public class OrganicDog extends Dog implements Organic {

	public OrganicDog(String petName, String petType) {
		super(petName, petType);

	}


	int hunger = 0;
	int thirst = 0;
	int happiness = 0;
	int cleanliness = 0;

	@Override
	public void feed() {
		hunger += 10;
	}

	@Override
	public void water() {
		thirst = +10;
	}

	public int cleanDogCage() {
		return 0;
	}

	@Override
	public void walk() {
		happiness += 10;
		cleanliness = 0;
	}

}
