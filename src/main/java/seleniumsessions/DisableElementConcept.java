package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		//driver.get("https://classic.freecrm.com/register/");
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
//		By submitBtn = By.id("submitButton");
//		
//		driver.findElement(submitBtn).click();
		
		By pwdTextField = By.id("pass");
		driver.findElement(pwdTextField).click();
		driver.findElement(pwdTextField).sendKeys("test@123");
	}

}
