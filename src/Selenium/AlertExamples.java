package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		//to display alert box
		
		WebElement alertbox = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		//button to display confirm box
		
		WebElement confirmButton = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmButton.click();
		
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(3000);
				confirmAlert.dismiss();
		
				
		//display a prompt box
				
		WebElement  promptBox = driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		
		promptBox.click();
		
		Alert promptAlert = driver.switchTo().alert();
		
		promptAlert.sendKeys("Dinesh");
		Thread.sleep(3000);
		promptAlert.accept();
		
	}

}
