package vpa;

import org.junit.Assert;
import org.junit.Test;

public class _01_TestingBasic {

	@Test

	public void shouldMakeAVirtualPet() {
		NewVirtualPet underTest = new NewVirtualPet(null, null, 0, 0, 0);

		Assert.assertNotNull(underTest);
	}

	@Test

	public void shouldMakeADog() {

		VirtualDog underTest = new VirtualDog();

		Assert.assertNotNull(underTest);

	}

	@Test

	public void shouldBeAbleToWalkDog() {

		VirtualDog underTest = new VirtualDog();

		String walking = underTest.walk();

		Assert.assertEquals("You walked your Dog!", walking);

	}
}
