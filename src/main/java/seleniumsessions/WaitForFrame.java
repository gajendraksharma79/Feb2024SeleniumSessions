package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {
	static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver(); //browser
		driver.get("https://www.formsite.com/templates/registration-from-templates/vehicle-registration-form/"); //page
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		
		
		By frameLocator = By.xpath("//iframe[contains(@id,'frame-one')]");
		waitForFrameByLocator(frameLocator,5);
		driver.findElement(By.cssSelector("input#RESULT_TextField-1")).sendKeys("Gajendras Proposal");
		
		driver.switchTo().defaultContent(); //navigate back to the main page containing frame/iframe.
		System.out.println(driver.findElement(By.tagName("h3")).getText());
	}
	
	public static void waitForFrameByLocator(By frameLocator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	public static void waitForFrameByIndex(int frameIndex, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	public static void waitForFrameByIDorName(String frameIDOrName, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIDOrName));
	}
	public static void waitForFrameByframeElement(WebElement frameElement, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
}
