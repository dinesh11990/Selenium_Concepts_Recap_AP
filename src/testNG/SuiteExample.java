package testNG;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void launchBrowser() {
		
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}
	
	@Test
	public void openBing(){
		driver.get("http://www.bing.com");
	}
	
	@Test
	public void openGoogle(){
		driver.get("http://www.google.com");
	}
	
	@Test
	public void openYahoo(){
		driver.get("http://www.yahoo.com");
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time taken: "+totalTime);
		
	}

}
