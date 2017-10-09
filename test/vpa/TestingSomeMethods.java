package vpa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestingSomeMethods {

	@Test
	public void shouldCleanDogCage() {

		OrganicDog underTest = new OrganicDog(null, 0, 0, 0, 0, 0);

		underTest.cleanDogCage();

		int result = underTest.getCleanliness();

		assertEquals(0, result);

	}

	@Test
	public void shouldCleanGiantLitterBox() {
		
		OrganicCat underTest = new OrganicCat(null, 0, 0, 0, 0, 5);
		
		underTest.cleanLitterBox();
		
		int result = underTest.getCleanliness();
		
		assertEquals(0, result);
	}
}
