package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegister {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		
//		Actions action = new Actions(driver);
//		action.sendKeys(firstName, "Gajendra")
//			.sendKeys(Keys.TAB)
//			.pause(1000)
//			.sendKeys("Sharma")
//			.sendKeys(Keys.TAB)
//			.pause(1000)
//			.sendKeys("gajendra@gmail.com")
//			.sendKeys(Keys.TAB)
//			.pause(500)
//			.sendKeys("9818532026")
//			.sendKeys(Keys.TAB)
//			.pause(1000)
//			.sendKeys("Test@123")
//			.sendKeys(Keys.TAB)
//			.pause(1000)
//			.sendKeys("Test@123")
//			.sendKeys(Keys.TAB)
//			.sendKeys(Keys.TAB)
//			.sendKeys(Keys.TAB)
//			.sendKeys(Keys.SPACE)
//			.sendKeys(Keys.TAB)
//			.sendKeys(Keys.ENTER)
//			.build()
//			.perform();
		
		driver.get("https://www.amazon.co.in");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.TAB)
		.sendKeys("macbook")
		.build().perform();
		
		
	}

}
