package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//Create a WebElement + Perform an action (click, sendkeys, gettext, isDisplayed etc.)
		
		//1. id: Unique attribute
//			driver.findElement(By.id("input-email")).sendKeys("abc.com");
//			//driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("xyz.com"); \
//			driver.findElement(By.id("input-password")).sendKeys("abc");
//			//driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
				 
		//2. Name: can be duplicate
			
//			driver.findElement(By.name("email")).sendKeys("gajendra@gmail.com");
//			driver.findElement(By.name("password")).sendKeys("test@123");
//			
		//3. Class name: can be duplicate
//			driver.findElement(By.className("form-control")).sendKeys("gajendra@gmail.com");
		
		//4. xpath: its not an attribute. Xpath is the address of element in HTML DOM.
		
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("gajendra@gmail.com");
		//driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("xyz.com"); 
		//driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		//5. cssSelector: its not an attribute
		//CSS: Cascaded Style Sheet
		
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("gajendra@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		
		//6. LinkText: Only for links. html tag <a
		
//		driver.findElement(By.linkText("Register")).click();
		
		//7. PartialLinkText: only for links : sub-string of link
		
		//driver.findElement(By.partialLinkText("Delivery")).click();
		
		//Delivery Information
		//Delivery Products --- if we want to click on Delivery Products then if we use partial link text then it will click on Delivery Information
		// We should use LinkText in that case.
		
		//8. tagName: html tag
		
//		System.out.println(driver.findElement(By.tagName("h2")).getText());
		
		
		
	}
	

}
