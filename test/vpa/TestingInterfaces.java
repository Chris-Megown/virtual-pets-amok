package vpa;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class TestingInterfaces {

	@Test

	public void shouldCreateRobotInterface() {

		Robot underTest;

	}

	@Test

	public void shouldImplementRobotToRobotDog() {

		Robot underTest = new RobotDog(null, null);

		assertNotNull(underTest);

	}

	@Test

	public void shouldImplementRobotToRobotCat() {

		Robot underTest = new RobotCat(null, null);

		assertNotNull(underTest);

	}

	@Test

	public void shouldOilRobots() {

		Robot underTest = new RobotDog(null, null);

		underTest.oil();
		assertNotNull(underTest);

	}

	@Test

	public void shouldCreateOrganicInterface() {

		Organic underTest;

	}

	@Test

	public void shouldImplementOrganicToOrganicDog() {

		Robot underTest = new RobotDog(null, null);

		assertNotNull(underTest);

	}

	@Test

	public void shouldImplementOrganicToOrganicCat() {

		Robot underTest = new RobotCat(null, null);

		assertNotNull(underTest);

	}

	@Test
	public void shouldMonitorMaintenanceLevelOfRobotDog() {

		RobotDog underTest = new RobotDog(null, null);

		int result = underTest.oil();
		
		Assert.assertEquals(5, result);
	}

}
