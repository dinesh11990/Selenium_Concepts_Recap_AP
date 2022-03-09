package Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Part2SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		//This selectable concepts are rarely use - Just for interview prospective
		
		//In selectables , Eventhough there is id and name you should take only xpath because In the UI you see multiple
		//selectable items , it ll be arranged in list. if you choose "name" or "id" it will take only one value because you 
		//can see the tag <ol> thats the reason
		//you have to choose findelements (More than one dropdown) not findelement
		//Need to put the li in xpath in order to select all the items in the list
		//We need to use only xpath in order select all the items in the list
		
		
		List<WebElement> selectable=driver.findElements(By.xpath("//*[@id='selectable']/li"));
		
		
		int listSize = selectable.size();
		System.out.println(listSize);
		
		//Interaction packages- Mostly for Keyboard and Mouse - We need to use Actions (Mostly we use it for mouse)
		
		/*Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2)).build().perform();*/
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(selectable.get(0));
		actions.clickAndHold(selectable.get(1));
		actions.clickAndHold(selectable.get(2));
		actions.build().perform();
		
	}

}
