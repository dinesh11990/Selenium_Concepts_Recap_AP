package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		
		
		//Check whether it checked or unchecked radio button
		//Select age group
		WebElement unchecked = driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]"));
		
		//default age group
		WebElement checked = driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
		
		boolean status1 = unchecked.isSelected();
		boolean status2 = checked.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		
		WebElement below20 = driver.findElement(By.name("age"));
		below20.click();

	}

}
