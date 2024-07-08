package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// html tag = select
		// Select class in selenium
		
		
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/contact-sales");
		
		By country = By.id("Form_getForm_Country");
		By numEmployees = By.name("NoOfEmployees");
		
//		Select select_country = new Select(driver.findElement(country));
//		Select select_employee = new Select(driver.findElement(numEmployees));
//		
//		select_country.selectByIndex(5);
//		Thread.sleep(2000);
//		select_country.selectByValue("Belarus");
//		Thread.sleep(2000);
//		select_country.selectByVisibleText("India");
//		
//		select_employee.selectByIndex(5);
//		Thread.sleep(2000);
//		select_employee.selectByVisibleText("201 - 250");
//		Thread.sleep(2000);
//		select_employee.selectByValue("11 - 15");
		
		doSelectByIndex(country, 5);
		Thread.sleep(2000);
		doSelectByVisibleText(country, "India");
		Thread.sleep(2000);
		doSelectByValue(numEmployees, "21 - 25");
		
		

	}
	
	public static WebElement getElement(By locator) {

		WebElement element = driver.findElement(locator);
			return element;
	}
	
	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	
	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
		
	}
	
	public static void doSelectByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
		
	}

}
