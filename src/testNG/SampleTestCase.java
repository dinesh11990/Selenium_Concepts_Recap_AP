package testNG;

import org.testng.annotations.Test;

public class SampleTestCase {
	
	@Test(priority=0)
	public void startTheCar() {
		System.out.println("Started");
	}
	
	@Test(priority=1)
	public void putFirstGear() {
		System.out.println("First Gear");
	}
	
	//Skip a test case
	@Test(priority=4,enabled=false)
	public void turnTheMusicOn() {
		System.out.println("Music turned ON");
	}
	
	@Test(priority=2)
	public void putSecondGear () {
		System.out.println("Second Gear");
	}
	

	@Test(priority=3)
	public void putThirdGear () {
		System.out.println("Third Gear");
	}

}
