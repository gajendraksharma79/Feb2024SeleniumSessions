package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//Create a WebElement + Perform an action (click, sendkeys, gettext, isDisplayed etc.)
		
		//1st approach
		/*
		 * driver.findElement(By.id("input-email")).sendKeys("abc.com");
		 * //driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(
		 * "xyz.com"); driver.findElement(By.id("input-password")).sendKeys("abc");
		 * driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		 */
		
		//2nd approach
		/*
		 * WebElement emailID= driver.findElement(By.id("input-email")); WebElement
		 * password= driver.findElement(By.id("input-password"));
		 * 
		 * emailID.sendKeys("abc.com"); password.sendKeys("abc@123.com");
		 */
		
		//3rd approach - By locator: OR
		
		/*
		 * By by_email = By.id("input-email"); By by_pwd = By.id("input-password");
		 * 
		 * WebElement emailID1= driver.findElement(by_email); WebElement pwd1 =
		 * driver.findElement(by_pwd);
		 * 
		 * emailID1.sendKeys("abc.com"); pwd1.sendKeys("abc@123");
		 */
		
		//4th approach - By locator + generic function for webelements
		
//		By by_email = By.id("input-email");
//		By by_pwd = By.id("input-password");
//		getElement(by_email).sendKeys("abc.com");
//		getElement(by_pwd).sendKeys("abc@123");
		
		//5th approach: By locators + Generic functions for WebElements and generic functions for sendkeys
		
//		By by_email = By.id("input-email");
//		By by_pwd = By.id("input-password");
//		doSendKeys(by_email,"gajendra.com");
//		doSendKeys(by_pwd,"test@123");
		
		//6th approach: By locators + Generic functions for WebElements and generic functions for sendkeys: ElementUtil
		By by_email = By.id("input-email");
		By by_pwd = By.id("input-password");
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendKeys(by_email, "gajendra@gmail.com");
		eleutil.doSendKeys(by_pwd, "test@123");
		
		//7th approach: By locators + BrowserUtil + ElementUtil
	}
	
	public static WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		
	}

}
