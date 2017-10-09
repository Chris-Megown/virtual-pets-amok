package vpa;

public class Dog extends NewVirtualPet {

	public Dog(String petName, int health) {
		super(petName, health);
	}

	public void walk() {
		
	}

	@Override
	public void tick() {
		happiness -= 5;
	}
	

}
