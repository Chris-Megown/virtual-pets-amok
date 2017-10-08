package vpa;

import org.junit.Test;

public class TestingSomeMethods {

	@Test

	public void shouldCleanDogCage() {

		OrganicDog underTest = new OrganicDog(null, null);

		underTest.cleanDogCage();

	}
}
