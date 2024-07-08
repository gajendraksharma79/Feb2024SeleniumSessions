package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForBrowserWindow {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //parent
		By twitter = By.xpath("//a[contains(@href,'twitter')]");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickWhenReady(twitter, 10);
		
		if(waitForWindowsToBe(2,5)) {
			
		}
		
		
		
			
		
	}
	
	public static boolean waitForWindowsToBe(int totalWindows, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindows));
		
	}

}
