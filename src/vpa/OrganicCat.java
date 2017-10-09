package vpa;

public class OrganicCat extends Cat implements Organic {

	public OrganicCat(String petName, int health, int hunger, int thirst, int happiness, int cleanliness) {
		super(petName, health);
	}

	int hunger = 0;
	int thirst = 0;
	int cleanliness = 0;

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getCleanliness() {
		return cleanliness;
	}

	@Override
	public void feed() {
		hunger -= 10;
		cleanliness += 5;
	}

	@Override
	public void water() {
		thirst -= 10;
		cleanliness += 5;
	}

	public void tick() {
		hunger += 5;
		thirst += 5;
		cleanliness += 5;
	}
	
	public void cleanLitterBox() {
		cleanliness = 0;
		happiness += 5;
	}
}
