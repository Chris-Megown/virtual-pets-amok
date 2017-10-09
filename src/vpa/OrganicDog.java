package vpa;

public class OrganicDog extends Dog implements Organic {

	public OrganicDog(String petName, String petType) {
		super(petName, petType);

	}

	int hunger = 0;
	int thirst = 0;
	int happiness = 0;
	int cageCleanliness = 0;
	int timeSinceLastWalk = 0;

	
	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getCageCleanliness() {
		return cageCleanliness;
	}
	
	public int getTimeSinceLastWalk() {
		return timeSinceLastWalk;
	}
	
	@Override
	public void feed() {
		hunger -= 10;
		cageCleanliness += 5;
		health += 5;
	}

	@Override
	public void water() {
		thirst -= 10;
		cageCleanliness += 5;
		health += 5;
	}

	@Override
	public void walk() {
		happiness += 20;
		cageCleanliness -= 5;
	}

	public void cleanDogCage() {
		cageCleanliness = 0;
		happiness += 5;
	}

	public void tick() {
		hunger += 5;
		thirst += 5;
		happiness -= 5;
		cageCleanliness += 5;
		timeSinceLastWalk += 5;
	}
	
}
