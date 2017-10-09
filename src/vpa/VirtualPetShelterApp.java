package vpa;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter petShelter = new VirtualPetShelter();

		OrganicDog billy = new OrganicDog("Billy", 40, 40, 40, 40, 40);
		petShelter.addPet(billy);

		RoboticDog stuart = new RoboticDog("Stuart", 30, 20);
		petShelter.addPet(stuart);

		OrganicCat wanda = new OrganicCat("Wanda", 20, 20, 20, 20, 20);
		petShelter.addPet(wanda);

		RoboticCat sally = new RoboticCat("Sally", 25, 25);
		petShelter.addPet(sally);

		System.out.println("     -Welcome to Petopia!-");
		System.out.println("\nThe happiest pet-shelter on Earth!\n");

		String userChoice;

		while (!petShelter.myShelter.isEmpty()) {

			do {
				petShelter.checkForDead();
				petShelter.checkForUnhappy();

				System.out.println("");
				System.out.println("\t1. Feed all of the organic pets");
				System.out.println("\t2. Water all of the organic pets");
				System.out.println("\t3. Clean all of the dog cages");
				System.out.println("\t4. Clean the filthy litterbox");
				System.out.println("\t5. Oil all of the robot pets");
				System.out.println("\t6. Walk all of the dogs");
				System.out.println("\t7. Adopt a current pet");
				System.out.println("\t8. Admit a new pet");
				System.out.println("\t9. See all of the current pets");
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
					System.out.println("\nAll the dogs have had their cages cleaned horray!\n");
					petShelter.tickAllPets();
					break;
				case "4":
					petShelter.cleanTheLitterBox();
					System.out.println("\nThe litter box has been completely cleaned...whew!\n");
					petShelter.tickAllPets();
					break;
				case "5":
					petShelter.oilAllRobotPets();
					System.out.println("\nAll the robot pets have been oiled up. They are ready to go!\n");
					petShelter.tickAllPets();
					break;
				case "6":
					petShelter.walkEveryDog();
					System.out.println("\nAll the dogs have had their walks for the day!");
					petShelter.tickAllPets();
				case "7":
					System.out.println("Here is a list of our adoptable pets:\n");
					System.out.println("Name\t\t|Type");
					System.out.println("------------------------------");
					for (NewVirtualPet currentPet : petShelter.availablePets()) {
						System.out.println(
								currentPet.getPetName() + "\t\t" + "|  " + currentPet.getClass().getSimpleName());
						System.out.println("------------------------------");
					}
					System.out.println("Please provide the name of the pet that will be adopted: ");
					String adoptablePet = input.next();
					adoptablePet = adoptablePet.substring(0, 1).toUpperCase() + adoptablePet.substring(1).toLowerCase();
					petShelter.removePet(adoptablePet);
					System.out.println(adoptablePet + " has been adopted!");
					petShelter.tickAllPets();
					break;
				case "8":
					System.out.println("\nIf you would like to admit an animal here we'll need some information.");
					System.out.print("\nWhat is the pet's name: ");
					String newPetName = input.next();
					newPetName = newPetName.substring(0, 1).toUpperCase() + newPetName.substring(1).toLowerCase();
					System.out.print(
							"\nWe are currently accepting:\nA. Organic Dogs\nB. Organic Cats\nC. Robotic Dogs\nD. Robotic Cats\nWhat type of pet is this(choose letter please): ");
					String newPetType = input.next();
					switch (newPetType) {
					case "A":
						OrganicDog foundOrgDog = new OrganicDog(newPetName, 25, 25, 25, 25, 25);
						petShelter.addPet(foundOrgDog);
						System.out.println("\nHere at Petopia we will take great care of " + newPetName + ".\n");
						break;
					case "B":
						OrganicCat foundOrgCat = new OrganicCat(newPetName, 25, 25, 25, 25, 25);
						petShelter.addPet(foundOrgCat);
						System.out.println("\nHere at Petopia we will take great care of " + newPetName + ".\n");
						break;
					case "C":
						RoboticDog foundRobDog = new RoboticDog(newPetName, 25, 25);
						petShelter.addPet(foundRobDog);
						System.out.println("\nHere at Petopia we will take great care of " + newPetName + ".\n");
						break;
					case "D":
						RoboticCat foundRobCat = new RoboticCat(newPetName, 25, 25);
						petShelter.addPet(foundRobCat);
						System.out.println("\nHere at Petopia we will take great care of " + newPetName + ".\n");
						break;
					}
					petShelter.tickAllPets();
					break;
				case "9":
					System.out.println("\nHere are all of the current pets we have in our shelter\n");
					System.out.println();
					System.out.println("Name\t\t|Type\t\t|Health\t|Happiness");
					System.out.println("-----------------------------------------------");
					for (NewVirtualPet currentPet : petShelter.availablePets()) {
						System.out.println(
								currentPet.getPetName() + "\t\t" + "|  " + currentPet.getClass().getSimpleName() + "\t"
										+ "|  " + currentPet.getHealth() + "\t" + "|  " + currentPet.getHappiness());
						System.out.println("-----------------------------------------------");
					}
					break;
				case "10":
					System.out.println("\nThanks for stopping by and have a nice day.");
					System.exit(0);
				default:
					System.out.println("Invalid option! Try again");
				}

			} while (!petShelter.myShelter.isEmpty());

			System.out.println(
					"All the Petopia animals have either been adopted or have traggically died. Have a wonderful day!");
			input.close();
		}
	}
}