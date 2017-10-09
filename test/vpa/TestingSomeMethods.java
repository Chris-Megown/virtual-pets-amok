package vpa;

import org.junit.Assert;
import org.junit.Test;

public class TestingSomeMethods {

	@Test

	public void shouldCleanDogCage() {

		OrganicDog underTest = new OrganicDog(null, 0, 0, 0, 0, 0);

		underTest.cleanDogCage();
		
		int result = underTest.getCleanliness();
		
		Assert.assertEquals(0, result);

	}
	
	@Test
	
	public void shouldCleanGiantLitterBox() {
		
		
	}
}
