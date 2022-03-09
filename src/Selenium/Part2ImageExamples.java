package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2ImageExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		//WebElement firstImage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		//firstImage.click();
		
		WebElement brokenImage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		
		//Important *********** how to find if the image is broken or not ==> by using "naturalWidth"
		
		//"naturalWidth"=0
		
		if(brokenImage.getAttribute("naturalWidth").equals("0")) {
			
			System.out.println("The Image is broken");
		}else {
			System.out.println("The Image is Not broken");
			
		}
		
	}

}
