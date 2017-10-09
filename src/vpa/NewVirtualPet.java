package vpa;

public abstract class NewVirtualPet {

	String petName;
	int health = 0;
	int happiness = 0;

	public NewVirtualPet(String petName, int health) {
		this.petName = petName;
		this.health = 55;
		this.happiness = 35;
	}

	public String getPetName() {
		return petName;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

	public abstract void tick();

}
