package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// Wait(I) --- until() - Abstract method
		// implemented by FluentWait(C) ---methods() with method body{} +until method
		// (from parent)
		// extended by WebDriverWait(C) ---> inherited methods + individual methods
		
		//Don't mix implicit wait and explicit wait together
		//e.gs
		// Both waits would be appplied in this case as both have separate mechanisms. If implicit wait is applied
		//that doesn't mean explicit wait will not be executed.
		//both wait will be applied and driver will wait for cumulative wait of implicit and explicit
		
		//e1: imp wait = 20 + exp wait = 10 ---> 30 secs
		//e1: 5 sec + 2 sec --->7 secs
		//e1: 18 secs = 1 sec ---> 19 secs
		//e1: 0 sec + 9 secs ---> 9 secs
		//e1: 21 secs (NSE)
		//e1: 0sec + 0 sec ---> 0 secs
		//e1: 20 secs + 0 sec ---> 20 secs

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By emailID = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //sele 4.x
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailID));
//		email_ele.sendKeys("test@gmail.com");
//		
//		getElement(password).sendKeys("test@123");
//		getElement(loginBtn).click();

//		waitForElementPresence(emailID, 10).sendKeys("test@gmail.com");
//		getElement(password).sendKeys("test@123");
//		waitForElementPresence(loginBtn, 5).click();
		
//		waitForElementVisible(emailID, 10).sendKeys("test@gmail.com");
		
		ElementUtil util = new ElementUtil(driver);
		util.doSendKeys(emailID, "test@gmail.com", 10);
		util.doSendKeys(password, "test@123");
		util.doClick(loginBtn, 3);

	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementPresence(By locator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */

	public static WebElement waitForElementVisible(By locator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

}
