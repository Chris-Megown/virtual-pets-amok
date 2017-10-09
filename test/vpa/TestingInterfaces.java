package vpa;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class TestingInterfaces {

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

		underTest.oil();

		int result = underTest.getMaintenanceLevel();

		Assert.assertEquals(5, result);
	}

	@Test
	public void shouldMonitorMaintenanceLevelOfRobotCat() {

		RobotCat underTest = new RobotCat(null, null);

		underTest.oil();

		int result = underTest.getMaintenanceLevel();

		Assert.assertEquals(5, result);
	}

	@Test
	public void shouldFeedOrganicDog() {

		OrganicDog underTest = new OrganicDog(null, null);

		underTest.feed();

		int result = underTest.getHunger();

		Assert.assertEquals(-10, result);

	}

	@Test
	public void shouldFeedOrganicCat() {

		OrganicCat underTest = new OrganicCat(null, null);

		underTest.feed();

		int result = underTest.getHunger();

		Assert.assertEquals(-10, result);

	}

	@Test
	public void shouldWaterOrganicCat() {

		OrganicCat underTest = new OrganicCat(null, null);

		underTest.water();

		int result = underTest.getThirst();

		Assert.assertEquals(-10, result);

	}

	@Test
	public void shouldWaterOrganicDog() {

		OrganicDog underTest = new OrganicDog(null, null);

		underTest.water();

		int result = underTest.getThirst();

		Assert.assertEquals(-10, result);

	}

}
