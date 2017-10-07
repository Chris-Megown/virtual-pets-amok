package vpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestingBasicProcedures {

	@Test

	public void shouldMakeAVirtualPet() {

		NewVirtualPet underTest = new NewVirtualPet(null, null, 0, 0, 0);

		assertNotNull(underTest);
	}

	@Test

	public void shouldMakeAnOrganicDog() {

		OrganicDog underTest = new OrganicDog(null, null);

		assertNotNull(underTest);

	}

	@Test

	public void shouldBeAbleToWalkDog() {

		Dog underTest = new Dog();

		String walking = underTest.walk();

		assertEquals("You walked your Dog!", walking);

	}

	@Test

	public void shouldMakeARobotDog() {

		RobotDog underTest = new RobotDog(null, null);

		assertNotNull(underTest);

	}

	@Test

	public void shouldMakeRobotDogExtendsDog() {

		Dog underTest = new RobotDog(null, null);

		assertNotNull(underTest);

	}

	@Test

	public void shouldMakeOrganicDogExtendsDog() {

		Dog underTest = new OrganicDog(null, null);

		assertNotNull(underTest);
	}

	@Test

	public void shouldMakeAnOrganicCat() {

		OrganicCat underTest = new OrganicCat(null, null);

		assertNotNull(underTest);

	}

	@Test

	public void shouldMakeARobotCat() {

		RobotCat underTest = new RobotCat(null, null);

		assertNotNull(underTest);

	}

	@Test

	public void shouldMakeRobotCatExtendsCat() {

		Cat underTest = new RobotCat(null, null);

		assertNotNull(underTest);

	}

	@Test

	public void shouldMakeOrganicCatExtendsCat() {

		Cat underTest = new OrganicCat(null, null);

		assertNotNull(underTest);
	}

}
