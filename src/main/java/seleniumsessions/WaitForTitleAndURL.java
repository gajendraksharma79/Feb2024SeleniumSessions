package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;

public class WaitForTitleAndURL {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.isPageLoaded(10);
//		if(eleUtil.isPageLoaded(10)) {
//			System.out.println("page is loaded");
//		}
//		else {
//			System.out.println("page is not loaded");
//		}

		By pricingLink = By.linkText("Pricing");
		//ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickWhenReady(pricingLink, 10);
		
		String title = waitForTitle("PRICING11",5);
		System.out.println(title);
		System.out.println(title.contains("PRICING11"));
	}

	public static String waitForTitle(String titleFraction, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("Title not found");
		}
		return driver.getTitle(); //return incorrect/invalid title
	}
	
	public static String waitForTitleToBe(String titleVal, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleIs(titleVal))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("Title not found");
		}
		return driver.getTitle(); //return incorrect/invalid title
	}

}
