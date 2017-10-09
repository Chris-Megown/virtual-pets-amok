package vpa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, NewVirtualPet> myShelter = new HashMap<String, NewVirtualPet>();

	public Collection<NewVirtualPet> availablePets() {
		return myShelter.values();
	}
	
	public NewVirtualPet whichPet(String name) {
		return myShelter.get(name);
	}

	public void addPet(NewVirtualPet newPet) {
		String petsAvailable = newPet.getPetName();
		myShelter.put(petsAvailable, newPet);
	}

	public void removePet(String adoptedPet) {
		myShelter.remove(adoptedPet);
	}

	public void feedAllOrganicPets() {
		for (NewVirtualPet pet : availablePets()) {
			if (pet instanceof Organic) {
				Organic organicPet = (Organic) pet;
				organicPet.feed();
			}
		}

	}

	public void waterAllOrganicPets() {
		for (NewVirtualPet pet : availablePets()) {
			if (pet instanceof Organic) {
				Organic organicPet = (Organic) pet;
				organicPet.water();
			}
		}

	}
	public void cleanAllDogCages() {
		for (NewVirtualPet pet : availablePets()) {
			if (pet instanceof OrganicDog) {
				OrganicDog organicPet = (OrganicDog) pet;
				organicPet.cleanDogCage();
			}
		}

	}
	
	public void cleanTheLitterBox() {
		for (NewVirtualPet pet : availablePets()) {
			if (pet instanceof OrganicCat) {
				OrganicCat organicPet = (OrganicCat) pet;
				organicPet.cleanLitterBox();
			}
		}

	}

	public void oilAllRobotPets() {
		for (NewVirtualPet pet : availablePets()) {
			if (pet instanceof Robot) {
				Robot robotPet = (Robot) pet;
				robotPet.oil();
			}
		}

	}
	
	public void walkEveryDog() {
		for (NewVirtualPet pet : availablePets()) {
			if (pet instanceof Dog) {
				Dog dogPet = (Dog) pet;
				dogPet.walk();
			}
		}

	}

	public void tickAllPets() {
		for (NewVirtualPet petToTick : availablePets()) {
			if (petToTick instanceof Organic) {
				Organic organicPet = (Organic) petToTick;
				organicPet.tick();
			} else if (petToTick instanceof Robot) {
				Robot robotPet = (Robot) petToTick;
				robotPet.tick();
			}
		}
	}

	// public void checkForDead() {
	// for (NewVirtualPet maybeDeadPet : myShelter.availablePets()) {
	// if (maybeDeadPet instanceof Organic) {
	// Organic organicPet = (Organic) maybeDeadPet;
	// organicPet.get();
	// }
	// System.out.println(maybeDeadPet.getPetName() + " has died of starvation," + "
	// we are bad at our jobs...\n");
	// myShelter.removePet(maybeDeadPet.getPetName());
	// break;
	// }
	// if (maybeDeadPet.getThirst() <= 0) {
	// System.out
	// .println(maybeDeadPet.getPetName() + " has died of dehydration," + " we are
	// bad at our jobs...\n");
	// myShelter.removePet(maybeDeadPet.getPetName());
	// break;
	// }
	//
	// }
}
