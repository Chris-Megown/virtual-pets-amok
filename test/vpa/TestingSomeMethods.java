package vpa;

import org.junit.Assert;
import org.junit.Test;

public class TestingSomeMethods {

	@Test

	public void shouldCleanDogCage() {

		OrganicDog underTest = new OrganicDog(null, null);

		int result = underTest.cleanDogCage();
		
		Assert.assertEquals(0, result);

	}
	
	@Test
	
	public void shouldCleanGiantLitterBox() {
		
		
	}
}
