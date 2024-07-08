package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By forgotPwdLink = By.linkText("Forgotten Password");
		//String forgotPwdHref = driver.findElement(forgotPwdLink).getAttribute("href");
		//System.out.println(forgotPwdHref);
		
		ElementUtil util = new ElementUtil(driver);
		String forgotPwdHref = util.doGetAttribute(forgotPwdLink, "href");
		System.out.println(forgotPwdHref);
		
		By inputEmail = By.id("input-email");
		System.out.println(util.doGetAttribute(inputEmail, "placeholder"));
		
		driver.findElement(inputEmail).sendKeys("gajendrasharma@gmail.com");
		System.out.println(driver.findElement(inputEmail).getAttribute("value"));
		

	}

}
