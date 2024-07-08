package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		boolean flag = driver.findElement(By.id("input-email1")).isDisplayed();
//		System.out.println(flag);
//		
		By emailID = By.id("input-email");
		By logo = By.className("img-responsive12");
		
		By forgotPwdLink = By.linkText("Forgotten Password1");
		
		System.out.println(isElementDisplayed(forgotPwdLink, 2));
		
		
//		if(doIsDisplayed(emailID)) {
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		}
		
//		List<WebElement> emailIdList = driver.findElements(emailID);
		
//		if(emailIdList.size()== 1) {
//			System.out.println("email id is present on the page");
//		}
//		else {
//			System.out.println("email id is NOT present on the page or coming more than two times");
//		}
 
	}
	
	public static WebElement getElement(By locator) {

		WebElement element = driver.findElement(locator);
			return element;
	}
	
	public static boolean isElementDisplayed(By locator) {
		int elementCount = driver.findElements(locator).size();
		if(elementCount == 1) {
			System.out.println("single element is displayed " + locator);
			return true;
		}
		else {
			System.out.println("multiple or zero elements are displayed " + locator);
			return false;
		}
	}
	
	public static boolean isElementDisplayed(By locator, int expectedElementCount ) {
		int elementCount = driver.findElements(locator).size();
		if(elementCount == expectedElementCount) {
			System.out.println("element with locaor : "+locator+" is displayed " + elementCount+ " times on page");
			return true;
		}
		else {
			System.out.println("multiple or zero elements are displayed " + locator+" with occurrence of "+elementCount);
			return false;
		}
	}
	
	public static boolean doIsDisplayed(By locator) {
		try {
			boolean flag = getElement(locator).isDisplayed();
			System.out.println("element is displayed " + locator);
			return flag;
		}
		catch(NoSuchElementException e) {
			System.out.println("element with locator :"+locator + " is not displayed");
			return false;
		}
	}

}
