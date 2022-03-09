package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
	
	//assert is used by developers for unit testing
	//Not used by Automation developers
	String name="agni";
	boolean value=true;
	
	@Test
	public void checkEqual() {
		
		//Assert.assertNotEquals(name, "Agni");
		
		//To use boolean value
		Assert.assertTrue(value, "This should not be true");
		
		  
		
	}
}
