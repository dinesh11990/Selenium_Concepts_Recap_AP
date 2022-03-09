package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups= {"Apple"})
	public void apple1() {
		System.out.println("Apple testing");
	}
	@Test(groups= {"Apple"})
	public void apple2() {
		System.out.println("Apple testing");
	}
	@Test(groups= {"vivo"})
	public void vivo1() {
		System.out.println("Apple testing");
	}
	@Test(groups= {"vivo"})
	public void vivo2() {
		System.out.println("Apple testing");
	}
	@Test(groups= {"moto"})
	public void moto1() {
		System.out.println("Apple testing");
	}
	@Test(groups= {"moto"})
	public void moto2() {
		System.out.println("Apple testing");
	}


}
