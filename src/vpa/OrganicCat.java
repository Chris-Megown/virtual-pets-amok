package vpa;

public class OrganicCat extends Cat implements Organic {

	public OrganicCat(String petName, String petType) {
		super(petName, petType);

	}

	int hunger = 0;
	int thirst = 0;
	int happiness = 0;
	int cleanliness = 0;
	
	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getCleanliness() {
		return cleanliness;
	}
	@Override
	public void feed() {
		hunger -= 10;
		happiness += 5;
		cleanliness += 5;
	}

	@Override
	public void water() {
		thirst -= 10;
		happiness += 5;
		cleanliness += 5;
	}
	
	public void tick() {
		hunger += 5;
		thirst += 5;
		happiness -= 5;
		cleanliness += 5;
	}
}
