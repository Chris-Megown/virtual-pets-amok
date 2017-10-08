package vpa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, OrganicDog> orgDogShelter = new HashMap<String, OrganicDog>();

	public void addOrganicDog(OrganicDog dog) {
		orgDogShelter.put(dog.getName().toLowerCase(), dog);
	}

	Map<String, OrganicCat> orgCatShelter = new HashMap<String, OrganicCat>();

	public void addOrganicCat(OrganicCat cat) {
		orgCatShelter.put(cat.getName().toLowerCase(), cat);
	}

	Map<String, RobotDog> robDogShelter = new HashMap<String, RobotDog>();

	public void addRobotDog(RobotDog dog) {
		robDogShelter.put(dog.getName().toLowerCase(), dog);
	}

	Map<String, RobotCat> robCatShelter = new HashMap<String, RobotCat>();

	public void addRobotCat(RobotCat cat) {
		robCatShelter.put(cat.getName().toLowerCase(), cat);
	}

	public void feedAllOrganicPets() {
		for (OrganicDog dogToFeed : orgDogShelter.values()) {
			dogToFeed.feed();
		}
		for (OrganicCat catToFeed : orgCatShelter.values()) {
			catToFeed.feed();
		}
	}

	public void waterAllPets() {
		for (OrganicDog dogToWater : orgDogShelter.values()) {
			dogToWater.feed();
		}
		for (OrganicCat catToWater : orgCatShelter.values()) {
			catToWater.feed();
		}
	}

	public void tickAllPets() {
		for (NewVirtualPet petToTick : myShelter.values()) {
			petToTick.tick();
		}
	}

	

}
