package vpa;

public class OrganicDog extends Dog implements Organic {

	public OrganicDog(String organicDogName, String organicDogType) {
	}

	int hunger = 0;
	int thirst = 0;
	int cageIsClean = 0;
	int happiness = 0;

	@Override
	public int feed() {
		return hunger += 10;
	}

	@Override
	public int water() {
		return thirst = +10;
	}

	public int cleanDogCage() {
		int cageIsClean = 0;
		return cageIsClean;
	}

	@Override
	public int walk() {
		
		return happiness += 10;
	}

}
