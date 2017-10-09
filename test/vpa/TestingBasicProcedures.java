package vpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import vpa.NewVirtualPet;

public class TestingBasicProcedures {

	@Test

	public void shouldMakeAVirtualPet() {

		// import virtual pet at some point for this BS
		NewVirtualPet underTest = new NewVirtualPet(null, 0);

		assertNotNull(underTest);
	}

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

		RobotDog underTest = new RobotDog(null, 0);

		assertNotNull(underTest);

	}

	@Test

	public void shouldMakeRobotDogExtendsDog() {

		Dog underTest = new RobotDog(null, 0);

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

		RobotCat underTest = new RobotCat(null, 0);

		assertNotNull(underTest);

	}

	@Test

	public void shouldMakeRobotCatExtendsCat() {

		Cat underTest = new RobotCat(null, 0);

		assertNotNull(underTest);

	}

	@Test

	public void shouldMakeOrganicCatExtendsCat() {

		Cat underTest = new OrganicCat(null, 0, 0, 0, 0, 0);

		assertNotNull(underTest);
	}

}
