package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2WindowsExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		
		//1. Click button to open home page in New Window
		
		//Store the old window identity
		
		String oldWindow = driver.getWindowHandle(); //Number 1 // important******************** get u the current window handle
		
		WebElement firstButton = driver.findElement(By.id("home"));
		firstButton.click();
		
		//getWindowHandles() stores all the window
		Set<String> handles = driver.getWindowHandles(); // important******************** It ll give total number of data of opened window
		
		
		//switch control to newly opend window
		//we don't know how many windows opened, by using this for loop we iterate and we read
		//Important ******
		for (String newWindow : handles) {
			
			driver.switchTo().window(newWindow);  //important****** to move to newly opened window
			
		}
		
		//Childwindow 
		WebElement editbox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
		editbox.click();
		driver.close();
		
			driver.switchTo().window(oldWindow); //important****** to move to previously opened window // In order to come back to oldwindow
		//we have used the handle check "Number 1"
		
		
		//OpenMultipleWindow
		
		WebElement openMultiple = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		
		openMultiple.click();
		Thread.sleep(3000);
		int numberOfWindows = driver.getWindowHandles().size();  // to check number of windows opened
		System.out.println("No of windows opened:" + numberOfWindows );
		//driver.close();
		
		
		//Close all window except the parent window
		
		WebElement dontCloseMe = driver.findElement(By.id("color"));
		dontCloseMe.click();
		Thread.sleep(3000);
		Set<String> newWindowHandles = driver.getWindowHandles();
		
		for (String allWindows : newWindowHandles) {
			
			if(!allWindows.equals(oldWindow))
			{
				driver.switchTo().window(allWindows);
				driver.close();
			}
			
			
		}
		
		driver.quit();
		
	}

}
