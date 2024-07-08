package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(brUtil.getTitle());
		System.out.println(brUtil.getPageCurrentURL());
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		By by_email = By.id("input-email");
		By by_pwd = By.id("input-password");
		
		eleUtil.doSendKeys(by_email, "gajendra@gmail.com");
		eleUtil.doSendKeys(by_pwd, "test@123");
		brUtil.closeBrowser();
		
	}

}
