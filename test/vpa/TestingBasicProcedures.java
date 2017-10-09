package vpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestingBasicProcedures {

	@Test
	public void shouldMakeAnOrganicDog() {

		OrganicDog underTest = new OrganicDog(null, 0, 0, 0, 0, 0);

		assertNotNull(underTest);

	}

	@Test
	public void shouldBeAbleToWalkOrganicDog() {

		OrganicDog underTest = new OrganicDog(null, 0, 0, 0, 0, 0);

		underTest.walk();

		int walking = underTest.getHappiness();

		assertEquals(55, walking);

	}

	@Test
	public void shouldMakeARobotDog() {

		RoboticDog underTest = new RoboticDog(null, 0, 0);

		assertNotNull(underTest);

	}

	@Test
	public void shouldMakeRobotDogExtendsDog() {

		Dog underTest = new RoboticDog(null, 0, 0);

		assertNotNull(underTest);

	}

	@Test
	public void shouldMakeOrganicDogExtendsDog() {

		Dog underTest = new OrganicDog(null, 0, 0, 0, 0, 0);

		assertNotNull(underTest);
	}

	@Test
	public void shouldMakeAnOrganicCat() {

		OrganicCat underTest = new OrganicCat(null, 0, 0, 0, 0, 0);

		assertNotNull(underTest);

	}

	@Test
	public void shouldMakeARobotCat() {

		RoboticCat underTest = new RoboticCat(null, 0, 0);

		assertNotNull(underTest);

	}

	@Test
	public void shouldMakeRobotCatExtendsCat() {

		Cat underTest = new RoboticCat(null, 0, 0);

		assertNotNull(underTest);

	}

	@Test
	public void shouldMakeOrganicCatExtendsCat() {

		Cat underTest = new OrganicCat(null, 0, 0, 0, 0, 0);

		assertNotNull(underTest);
	}

}
