package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select obj =new Select(dropDown1);
		
		//select value in different way
		obj.selectByIndex(3);
		obj.selectByValue("2");
		obj.selectByVisibleText("Loadrunner");
		
		
		//total size
		List<WebElement> list = obj.getOptions();
		int totalSize = list.size();
		System.out.println("Number of elements :" + totalSize);
		
		//select by using send keys
		dropDown1.sendKeys("UFT/QTP");
		
		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		
		Select obj2 = new Select(multiselect);
		
		obj2.selectByIndex(2);
		obj2.selectByIndex(3);
		//*[@id="contentblock"]/section/div[6]/select/option[1]
	}

}
