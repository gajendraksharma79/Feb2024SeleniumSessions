package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {
	static WebDriver driver;
	
	public static void main(String[] args) {
		

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// Create a WebElement + Perform an action (click, sendkeys, gettext,
		// isDisplayed etc.)

		// 1. id: Unique attribute
		//driver.findElement(By.id("input-email")).sendKeys("abc.com");
		
		String name = "Gajendra";
		String desig = "SDET";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sbf = new StringBuffer("Selenium");
		driver.findElement(By.id("input-email")).sendKeys(name," ",desig, "OPs",sb," ", sbf);
		
		//Use Case: address: aptt name, flat Number, block etc.

	}

}
