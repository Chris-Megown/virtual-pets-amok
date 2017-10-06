package vpa;

public class NewVirtualPet {

	String petName;
	String type;
	int hunger = 25;
	int thirst = 25;
	int happiness = 25;

	public NewVirtualPet(String petName, String type, int hunger, int thirst, int happiness) {
		this.petName = petName;
		this.type = type;
		this.hunger = hunger;
		this.thirst = thirst;
		this.happiness = happiness;
	}

	public NewVirtualPet(String petName, String type) {
		this.petName = petName;
		this.type = type;
		hunger = 25;
		thirst = 25;
		happiness = 25;
	}

	public String getName() {
		return petName;
	}

	public String getType() {
		return type;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getHappiness() {
		return happiness;
	}

	boolean petIsDed() {
		return (hunger <= 0 && thirst <= 0);
	}

	void feed() {
		hunger += 5;
	}

	void water() {
		thirst += 5;
	}

	void fetch() {
		happiness += 6;
	}

	void tick() {
		hunger -= 1;
		thirst -= 1;
		happiness -= 2;
	}
}
