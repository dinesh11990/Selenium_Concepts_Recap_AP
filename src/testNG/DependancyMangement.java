package testNG;

import org.testng.annotations.Test;

public class DependancyMangement {
	@Test(enabled=true)
	public void highSchool() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary() {
		System.out.println("High sec school");
	}
	@Test(dependsOnMethods="higherSecondary")
	public void engineering() {
		System.out.println("college");
	}

}
