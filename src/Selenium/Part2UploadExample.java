package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2UploadExample {
	
	
	// 80 % of SELENIUM COVERED FROM THE BEGINNING TO THIS VIDEO

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\ArulPrasad Academy\\backup selenium and JDK\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		
		WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\'mydiv\']/input"));
		uploadButton.click();
		
		//Windows control
		
		Thread.sleep(3000);
		String file = "G:\\down\\teastleaf.xlsx";
		
		
		//Ctrl+C operation, It will copy into the clipboard
		//It ll transfer the Java string to plain text format 
		
		StringSelection selection = new StringSelection(file); // Pasting ctrl+v
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		//For windows based we need to used robot class
		//Robot class to simulate the keyboard action for windows based application
		//Action class to simulate the keyboard action for the web based application
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		

	}

}
