package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By search = By.name("search");
		String searchKey = "sa";
		
//		Actions action = new Actions(driver);
//		
//		char ch[]= searchKey.toCharArray();
//		
//		
//		for(char c : ch) {
//			action.sendKeys(driver.findElement(search), String.valueOf(c)).pause(500).build().perform();
//	
//		}
		doSendKeysWithPause(search,"samsung",1000);
		
	}
	
	public static void doSendKeysWithPause(By locator,  String value, long pauseTime) {
		
		Actions action = new Actions(driver);
		char ch[] = value.toCharArray();
		for(char c : ch) {
			action.sendKeys(driver.findElement(locator), String.valueOf(c)).pause(pauseTime).perform();
		}
	}
	
	
	
}
