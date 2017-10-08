package vpa;

public class OrganicCat extends Cat implements Organic {

	public OrganicCat(String petName, String petType) {
		super(petName, petType);

	}

	int hunger = 0;
	int thirst = 0;

	@Override
	public void feed() {
		hunger += 10;
	}

	@Override
	public void water() {
		thirst = +10;
	}
}
