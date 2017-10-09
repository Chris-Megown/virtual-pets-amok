package vpa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, NewVirtualPet> myShelter = new HashMap<String, NewVirtualPet>();

	public Collection<NewVirtualPet> availablePets() {
		return myShelter.values();
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

	public void tickAllPets(NewVirtualPet currentPet) {
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
}
