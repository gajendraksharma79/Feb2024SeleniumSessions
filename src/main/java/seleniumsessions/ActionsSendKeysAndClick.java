package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysAndClick {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		Actions action = new Actions(driver);
		
		action.sendKeys(driver.findElement(firstName), "Gajendra Sharma").perform();
		action.click(driver.findElement(By.linkText("Forgotten Password"))).perform();
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(driver.findElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(driver.findElement(locator)).perform();
	}

}
