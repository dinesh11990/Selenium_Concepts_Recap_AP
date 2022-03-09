package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		
		//Select the checkbox
		
		WebElement java = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		java.click();
		
		WebElement Checked = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		boolean obj = Checked.isSelected();
		
		System.out.println(obj);
		
		//Deselect only checked
		
		WebElement firstElement = driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		
		if(firstElement.isSelected()) {
			firstElement.click();
		}
		
		WebElement secondElement = driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		
		if(secondElement.isSelected()) {
			secondElement.click();
		}
		
		
		//Select all the checkbox
		
		WebElement selectallCB = driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input"));
		
		selectallCB.click();
		
		WebElement selectallCB1 = driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input"));
		
		selectallCB1.click();
		
		WebElement selectallCB2 = driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input"));
		
		selectallCB2.click();
		
		WebElement selectallCB3 = driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input"));
		
		selectallCB3.click();
		
		WebElement selectallCB4 = driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input"));
		
		selectallCB4.click();
		
		
		
		
	}

}
