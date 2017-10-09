package vpa;

public class Cat extends NewVirtualPet {

	public Cat(String petName, int health) {
		super(petName, health);

	}

	@Override
	public void tick() {
		happiness -= 5;

	}

}
