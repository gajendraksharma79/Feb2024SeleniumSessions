package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConceptWithException {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		try {
//		driver.findElement(By.id("input-email11")).sendKeys("test");
//		}
//		catch(NoSuchElementException e) {
//			e.printStackTrace();
//		}
		
		By by_pwd = By.id("input-password");//java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(by_pwd, null);
		
		
		
	}

}
