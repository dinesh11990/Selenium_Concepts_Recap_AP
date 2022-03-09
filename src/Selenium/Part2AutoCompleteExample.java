package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");

		// need to take all the options in the dropdown and compare which one is
		// webservice
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("s");
		Thread.sleep(4000); // Explicit wait //implicit wait

		List<WebElement> optionList = driver.findElements(By.xpath("//*[@id='ui-id-1\']/li"));

		System.out.println(optionList.size());

		// use getText when it is inbetween the tags
		// need to continue research until we find the web services, once u find use
		// "break" to come out of loop
		// Important ************** concept interview point of view
		for (WebElement webElement : optionList) {

			if (webElement.getText().equals("Selenium")) {
				webElement.click();
				// System.out.println("Selecting "+webElement.getText());
				// break;
				System.out.println("If part");
				break;
			} else {

				System.out.println("else part");

			}

		}

	}

}
