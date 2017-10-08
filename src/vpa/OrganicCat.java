package vpa;

public class OrganicCat extends Cat implements Organic {

	public OrganicCat(String organicCatName, String organicCatType) {
	}
	
	int hunger = 0;
	int thirst = 0;
	
	@Override
	public int feed() {
		return hunger += 10;
	}
	
	@Override
	public int water() {
		return thirst = +10;
	}
}
