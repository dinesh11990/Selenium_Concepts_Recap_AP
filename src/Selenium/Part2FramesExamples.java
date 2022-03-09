package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2FramesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");

		//1. to switch to frame

		// frame(0) is first frame
		// Since there is no Id and Name we put 0
		driver.switchTo().frame(0); 
		WebElement button1=driver.findElement(By.id("Click")); 
		button1.click();


		//to get the text in between the tag you need to use "gettext" , N.B: If you need to get the attribute, you need to use "getattribute"

		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		

		//We need to use "defaultContent" only in frames
		//2) We need to come back to original content

		driver.switchTo().defaultContent(); // important********************   Only three types of Switch To - 1. original content (default content)
		//2. To go inside frame (Switch to frame) // 3. To go inside Alert (Switch to alert) //4. To move to window (Switch to window)
		driver.switchTo().frame(1);
		
		//Here for 2nd frame they have given id as "frame2" check in the web application
		
		driver.switchTo().frame("frame2");
		WebElement button2 = driver.findElement(By.id("Click1"));
		button2.click();
		
		String text2=driver.findElement(By.id("Click1")).getText();
		System.out.println(text2);
		
		//We need to go back to "defaultContent"

		driver.switchTo().defaultContent();
		
		//4) To find how many times "iframe" appeared
		//Note here we are using findElements
		
		List <WebElement> totalFrames  = driver.findElements(By.tagName("iframe"));
		int size = totalFrames.size();
		System.out.println("Total number of frames is :"+size);
		driver.quit();
		
	}

}
