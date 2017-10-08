package vpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
public class TestingBasicProcedures {

	@Test

	public void shouldMakeAVirtualPet() {


		// import virtual pet at some point for this BS
		NewVirtualPet underTest = new NewVirtualPet(null, null);

		assertNotNull(underTest);
	}

	@Test

	public void shouldMakeAnOrganicDog() {

		OrganicDog underTest = new OrganicDog(null, null);
		assertNotNull(underTest);

	}

	@Test

	public void shouldBeAbleToWalkOrganicDog() {

		Dog underTest = new OrganicDog(null, null);

		underTest.walk();
		
		int walking = underTest.getHappiness();
		assertEquals(10, walking);

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

		RobotCat underTest = new RobotCat();

		assertNotNull(underTest);

	}

	@Test

	public void shouldMakeRobotCatExtendsCat() {

		Cat underTest = new RobotCat();

		assertNotNull(underTest);

	}

	@Test

	public void shouldMakeOrganicCatExtendsCat() {

		Cat underTest = new OrganicCat(null, null);

		assertNotNull(underTest);
	}

}
