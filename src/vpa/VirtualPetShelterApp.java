package vpa;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		VirtualPetShelter petShelter = new VirtualPetShelter();
		
		OrganicDog billy = new OrganicDog("Billy", 40, 40, 40, 40, 40);
		petShelter.addPet(billy);
		
		RobotDog stuart = new RobotDog("Stuart", 30, 20);
		petShelter.addPet(stuart);

		OrganicCat wanda = new OrganicCat("Wanda", 20, 20, 20, 20, 20);
		petShelter.addPet(wanda);

		RobotCat sally = new RobotCat("Sally", 25);
		petShelter.addPet(sally);
		
		System.out.println("     -Welcome to Petopia!-");
		System.out.println("\nThe happiest pet-place on Earth!\n");

		String userChoice;
		
		while (!petShelter.myShelter.isEmpty()) {

			do {
				
				for (NewVirtualPet maybeUnhappyPet : petShelter.availablePets()) {

					if (maybeUnhappyPet.getHappiness() < 5) {
						System.out.println(
								"You should really consider playing with " + maybeUnhappyPet.getPetName() + ".\n");
					}
				}
				
				System.out.println("\n");
				System.out.println("\t1. Feed all of the organic pets");
				System.out.println("\t2. Water all of the organic pets");
				System.out.println("\t3. Clean all of the dog cages");
				System.out.println("\t4. Clean the filthy litterbox");
				System.out.println("\t5. Oil all of the robot pets");
				System.out.println("\t6. Walk all of the dogs");
				System.out.println("\t7. Adopt a current pet");
				System.out.println("\t8. Admit a new pet");
				System.out.println("\t9. Check all of the current pets");
				System.out.println("\t10. Quit\n");
				System.out.print("What would you like to do next: ");

				userChoice = input.next();
				
				switch (userChoice) {

				case "1":
					petShelter.feedAllOrganicPets();
					System.out.println("\nAll the pets have had their food bowls refilled!\n");
					petShelter.tickAllPets();
					break;
				case "2":
					petShelter.waterAllOrganicPets();
					System.out.println("\nAll the pets have had their water bowls refilled!\n");
					petShelter.tickAllPets();

					break;
				case "3":
					petShelter.cleanAllDogCages();
					petShelter.tickAllPets();
					break;
				case "4":
					System.out.println("Which pet would you like to adopt? Enter their name and kind of pet below.");
					for (NewVirtualPet currentPet : petShelter.availablePets()()) {
						System.out.println(currentPet.getPetName() + ", " + currentPet.getType());
					}
					String adoptablePet = input.next();
					adoptablePet = adoptablePet.substring(0, 1).toUpperCase() + adoptablePet.substring(1).toLowerCase();
					petShelter.removePet(adoptablePet);
					System.out.println("You adopted " + adoptablePet);
					petShelter.tickAllPets();
					break;

				case "5":
					System.out.println("\nIf you would like to admit an animal here we'll need some information.");
					System.out.print("\nWhat is the animal's name: ");
					String newPetName = input.next();
					newPetName = newPetName.substring(0, 1).toUpperCase() + newPetName.substring(1).toLowerCase();
					System.out.print("\nWhat kind of animal is this: ");
					String newPetDescription = input.next();
					NewVirtualPet foundPet = new NewVirtualPet(newPetName, newPetDescription);
					petShelter.addPet(foundPet);
					System.out.println("\nHere at Petopia we will take great care of " + newPetName + ".\n");
					petShelter.tickAllPets();
					break;
				case "6":
					System.out.println("\nThanks for stopping by and have a nice day.");
					System.exit(0);
				default:
					System.out.println("Invalid option! Try again");
			} while (petShelter.myShelter.isEmpty());

			

			
		}
		System.out.println(
				"All the Petopia animals have either been adopted or have traggically died. Have a wonderful day!");
		input.close();
	}
}
