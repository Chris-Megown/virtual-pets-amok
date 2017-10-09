package vpa;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class TestingInterfaces {

	@Test

	public void shouldImplementRobotToRobotDog() {

		Robot underTest = new RobotDog(null, 0);

		assertNotNull(underTest);

	}

	@Test

	public void shouldImplementRobotToRobotCat() {

		Robot underTest = new RobotCat(null, 0);

		assertNotNull(underTest);

	}

	@Test

	public void shouldOilRobots() {

		Robot underTest = new RobotDog(null, 0);

		underTest.oil();
		assertNotNull(underTest);

	}

	@Test

	public void shouldImplementOrganicToOrganicDog() {

		Robot underTest = new RobotDog(null, 0);

		assertNotNull(underTest);

	}

	@Test

	public void shouldImplementOrganicToOrganicCat() {

		Robot underTest = new RobotCat(null, 0);

		assertNotNull(underTest);

	}

	@Test
	public void shouldMonitorMaintenanceLevelOfRobotDog() {

		RobotDog underTest = new RobotDog(null, 0);

		underTest.oil();

		int result = underTest.getMaintenanceLevel();

		Assert.assertEquals(5, result);
	}

	@Test
	public void shouldMonitorMaintenanceLevelOfRobotCat() {

		RobotCat underTest = new RobotCat(null, 0);

		underTest.oil();

		int result = underTest.getMaintenanceLevel();

		Assert.assertEquals(5, result);
	}

	@Test
	public void shouldFeedOrganicDog() {

		OrganicDog underTest = new OrganicDog(null, 0, 0, 0, 0, 0);

		underTest.feed();

		int result = underTest.getHunger();

		Assert.assertEquals(-10, result);

	}

	@Test
	public void shouldFeedOrganicCat() {

		OrganicCat underTest = new OrganicCat(null, 0, 0, 0, 0, 0);

		underTest.feed();

		int result = underTest.getHunger();

		Assert.assertEquals(-10, result);

	}

	@Test
	public void shouldWaterOrganicCat() {

		OrganicCat underTest = new OrganicCat(null, 0, 0, 0, 0, 0);

		underTest.water();

		int result = underTest.getThirst();

		Assert.assertEquals(-10, result);

	}

	@Test
	public void shouldWaterOrganicDog() {

		OrganicDog underTest = new OrganicDog(null, 0, 0, 0, 0, 0);

		underTest.water();

		int result = underTest.getThirst();

		Assert.assertEquals(-10, result);

	}

}
