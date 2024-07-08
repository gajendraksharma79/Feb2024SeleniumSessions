package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();//Browser
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//page DOM v1 
		WebElement emailID = driver.findElement(By.id("input-email")); //v1
		emailID.sendKeys("gajendra@gmail.com"); //v1
		
		
		driver.navigate().refresh();
		
//		DOM get updated in following case:
		//1. Refresh
		//2. Moving one page and coming back to first page.
		
		// DOM v2 ---After refresh DOM updated
		
//		issue can be resolved by re-initializing the WebElement variable after refresh
		//v2
		emailID = driver.findElement(By.id("input-email"));
		
		//v1
		emailID.sendKeys("sachin@gmail.com"); ///emailID element was created from DOM v1 and due to which we are
		//getting StaleElementReferenceException
//		StaleElementReferenceException: stale element reference: stale element not found
		

	}

}
