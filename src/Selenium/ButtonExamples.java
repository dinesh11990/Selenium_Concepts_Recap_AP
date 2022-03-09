package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://leafground.com/pages/Button.html");	
		driver.get("H:/Leafground/leafground/www.leafground.com/pages/Button.html");


		//1. Get the XY position
		WebElement getButtonPosition = driver.findElement(By.id("position"));
		
		//Point class to identify the position
		Point xypoint = getButtonPosition.getLocation();
		int x = xypoint.getX();
		int y = xypoint.getY();

		System.out.println("X value is :"+x+"Y value is :"+y);


		//2 Get the button color
		WebElement colorButton = driver.findElement(By.id("color"));
		String color = colorButton.getCssValue("background-color");
		System.out.println("Button color is: "+color);


		//3. Find the size of the button
		WebElement buttonSize = driver.findElement(By.id("size"));
		int height = buttonSize.getSize().getHeight();
		int width = buttonSize.getSize().getWidth();
		System.out.println("Height is :" +height+ "Widht is :"+width);


		//4. Go to home page

		WebElement homePage = driver.findElement(By.id("home"));
		homePage.click();

	}

}
