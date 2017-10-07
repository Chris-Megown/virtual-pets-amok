package vpa;

public class OrganicDog extends Dog implements Organic {

	public OrganicDog(String organicDogName, String organicDogDescription) {
	}
		int hunger = 0;
		int thirst = 0;
	public String walk() {
		return "You walked your OrganicDog!";
	}

	@Override
	public int feed() {
		return hunger += 10;
	}
	
	@Override
	public int water() {
		return thirst =+ 10;
	}

}
