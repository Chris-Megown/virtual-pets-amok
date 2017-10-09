package vpa;

import org.junit.Assert;
import org.junit.Test;

public class TestingSomeMethods {

	@Test

	public void shouldCleanDogCage() {

		OrganicDog underTest = new OrganicDog(null, null);

		underTest.cleanDogCage();
		
		int result = underTest.getCageCleanliness();
		
		Assert.assertEquals(0, result);

	}
	
	@Test
	
	public void shouldCleanGiantLitterBox() {
		
		
	}
}
