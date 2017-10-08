package vpa;

public abstract class NewVirtualPet {

	String petName;
	String petType;
	int health = 0;
	int happiness = 0;
	

	public NewVirtualPet(String petName, String petType) {
		this.petName = petName;
		this.petType = petType;
		this.health = 55;
		this.happiness = 35;
	}

	public String getName() {
		return petName;
	}

	public String getPetType() {
		return petType;
	}
	
	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

}
