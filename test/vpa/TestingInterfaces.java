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
}
