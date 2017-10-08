package vpa;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter petShelter = new VirtualPetShelter();
		NewVirtualPet billy = new NewVirtualPet("Billy", "Dog", 40, 40, 40);
		NewVirtualPet stuart = new NewVirtualPet("Stuart", "Dog", 20, 20, 20);
		NewVirtualPet wanda = new NewVirtualPet("Wanda", "Cat", 30, 30, 30);
		petShelter.addPet(billy);
		petShelter.addPet(stuart);
		petShelter.addPet(wanda);
		System.out.println("     -Welcome to Petopia!-");
		System.out.println("\nThe happiest pet-place on Earth!\n");

		String userChoice;
		// might make this false within a boolean
		while (!petShelter.myShelter.isEmpty()) {

			do {
				for (NewVirtualPet maybeDeadPet : petShelter.allPets()) {
					if (maybeDeadPet.getHunger() <= 0) {
						System.out.println(
								maybeDeadPet.getName() + " has died of starvation," + " we are bad at our jobs...\n");
						petShelter.removePet(maybeDeadPet.getName());
						break;
					}
					if (maybeDeadPet.getThirst() <= 0) {
						System.out.println(
								maybeDeadPet.getName() + " has died of dehydration," + " we are bad at our jobs...\n");
						petShelter.removePet(maybeDeadPet.getName());
						break;
					}

				}
				for (NewVirtualPet maybeUnhappyPet : petShelter.allPets()) {

					if (maybeUnhappyPet.getHappiness() < 5) {
						System.out.println(
								"You should really consider playing with " + maybeUnhappyPet.getName() + ".\n");
					}
				}
				System.out.println("This is the status of your current pets:");
				System.out.println();
				System.out.println("Name\t\t|Hunger\t|Thirst\t|Boredom");
				System.out.println("------------------------------------------");
				for (NewVirtualPet currentPet : petShelter.allPets()) {
					System.out.println(currentPet.getName() + "\t\t" + "|  " + currentPet.getHunger() + "\t" + "|  "
							+ currentPet.getThirst() + "\t" + "|  " + currentPet.getHappiness());
					System.out.println("------------------------------------------");

				}
				System.out.println("\n");
				System.out.println("\t1. Feed the pets");
				System.out.println("\t2. Water the pets");
				System.out.println("\t3. Play with a pet");
				System.out.println("\t4. Adopt a pet");
				System.out.println("\t5. Admit a pet");
				System.out.println("\t6. Quit\n");
				System.out.print("What would you like to do next: ");

				userChoice = input.next();
			} while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")
					&& !userChoice.equals("4") && !userChoice.equals("5") && !userChoice.equals("6"));

			switch (userChoice) {

			case "1":
				petShelter.feedAllPets();
				System.out.println("\nAll the pets have had their food bowls refilled!\n");
				petShelter.tickAllPets();
				break;
			case "2":
				petShelter.waterAllPets();
				System.out.println("\nAll the pets have had their water bowls refilled!\n");
				petShelter.tickAllPets();

				break;
			case "3":
				System.out.println();
				System.out.println("Name\t  |  Description");
				System.out.println("--------------------------");
				for (NewVirtualPet currentPet : petShelter.allPets()) {

					System.out.println(currentPet.getName() + "\t" + "  |  " + currentPet.getType());
					System.out.println("--------------------------");
				}
				System.out.print("\nWhich pet would you like to play with: ");

				String petPlayInput = input.next();
				petPlayInput = petPlayInput.substring(0, 1).toUpperCase() + petPlayInput.substring(1).toLowerCase();
				petShelter.whichPet(petPlayInput).fetch();
				System.out.println("\nYou threw the ball with " + petPlayInput + ", and he liked it.\n");
				petShelter.tickAllPets();

				break;
			case "4":
				System.out.println("Which pet would you like to adopt? Enter their name and kind of pet below.");
				for (NewVirtualPet currentPet : petShelter.allPets()) {
					System.out.println(currentPet.getName() + ", " + currentPet.getType());
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

			}
		}
		System.out.println(
				"All the Petopia animals have either been adopted or have traggically died. Have a wonderful day!");
		input.close();
	}
}
