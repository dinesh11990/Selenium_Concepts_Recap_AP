 package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2LinksExtendedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\ArulPrasad Academy\\backup selenium and JDK\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//links are more important
		//difference between driver.get (will not store the history) and driver.navigate (will store the history)
		//Important ************ In "GET" you cannot do forward or backward or refresh, In order to use this functionality we need to use navigate().to
		//driver.get("http://www.leafground.com/pages/Link.html");
		
		//What is stale element reference exception ?
		//We should not use homePageLink for 2 times after refresh and going back or forward
		//You need to call the webelement again in order to avoid stale element reference exception
		
		
		//Common Causes
		//1. The element has been deleted entirely
		//2. The element is no longer attached to the DOM
		
		
		
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement homePageLink = driver.findElement(By.linkText("Go to Home Page"));
		homePageLink.click();
		
		driver.navigate().back();
		
		//2. Where to go ///Important ******************
		
		WebElement whereToGo = driver.findElement(By.partialLinkText("Find where"));
		String where =  whereToGo.getAttribute("href");
		System.out.println("This link is going to: " +where);
		
		//3. Broken element
		
		WebElement brokenLink = driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();
		
		String title = driver.getTitle();
		
		if(title.contains("404")) {
			
			System.out.println("Link is broken");
		}
		driver.navigate().back();
		
		//click and comeback
		
		//Error occured - Stale element reference exception in selenium
		WebElement homePageLink1 = driver.findElement(By.linkText("Go to Home Page"));
		homePageLink1.click();
		
		driver.navigate().back();
		
		//4.How many elements available in this page
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int linkCount = totalLinks.size();
		System.out.println("Total links :" +linkCount);
		
		
	}
	
	
	

}
