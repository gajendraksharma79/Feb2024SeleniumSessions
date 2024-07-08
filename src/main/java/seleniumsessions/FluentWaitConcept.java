package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		// Wait(I) -->Fluent Wait(C) -->WebDriverWait(C)

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		By pricingLink = By.linkText("Pricing");

		// default polling time in selenium = 500 ms
		waitForElementVisibleWithFluentWait(pricingLink,10,2).click();

	}

	public static WebElement waitForElementVisibleWithFluentWait(By locator, int timeOut, int pollTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(pollTime))
				.pollingEvery(Duration.ofSeconds(pollTime)).ignoring(NoSuchElementException.class)
				.withMessage("===element is not found===");

		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	
	public static WebElement waitForElementPresenceWithFluentWait(By locator, int timeOut, int pollTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(pollTime))
				.pollingEvery(Duration.ofSeconds(pollTime)).ignoring(NoSuchElementException.class)
				.withMessage("===element is not found===");

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
}
