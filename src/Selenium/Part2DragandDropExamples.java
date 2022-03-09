 package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Part2DragandDropExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");
		
		//Write the draggable and droppable
		
		WebElement From=driver.findElement(By.id("draggable"));
		WebElement To=driver.findElement(By.id("droppable"));
		
		//Drag and drop using mouse 
		//Important *************************************
		
		Actions actions=new Actions(driver);
		//actions.dragAndDrop(From, To).build().perform();
		//If you want to drag and drop in different way
		actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
		driver.close();

		
		
		
		
		
		
	}

}
