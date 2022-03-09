package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2ToolTipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		
		//hover the mouse in text field and u ll see the text appear
		//important ******* how will you take the tool tip text? By using the attribute "title"
		
		WebElement name=driver.findElement(By.id("age"));
		String toolTipText = name.getAttribute("title");
		System.out.println(toolTipText);
		driver.close();
		
		
		
	}

}
