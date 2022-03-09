package Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2TableExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		
		
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columnCount = columns.size();
		System.out.println("Number of columns "+ columnCount);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowCount = columns.size();
		System.out.println("Number of columns "+ rowCount);
		
		WebElement getPercent=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String percent=getPercent.getText();
		System.out.println("Percentage is : "+percent);
		
		List<WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numberList = new ArrayList<Integer>();
		
		for(WebElement webElement : allProgress) {
			
			String individualValue = webElement.getText().replace("%", "");
			
			numberList.add(Integer.parseInt(individualValue));
		}
		System.out.println("Final List" +numberList);
		
		int smallValue = Collections.min(numberList);
		System.out.println(smallValue);
		
		String smallValueString=Integer.toString(smallValue)+"%";
		String finalXpath="//td[normalize-space()="+"\""+smallValueString+"\""+"]"+"//following::td[1]";
		
//td[normalize-space()='Learn to interact with Elements']//following::td[1]
		
		WebElement check=driver.findElement(By.xpath(finalXpath));
		check.click();
		
		
		
	}

}
