package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJSAlert {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();

		// driver.get("https://classic.freecrm.com/register/");
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		String text = getAlertText(5);
//		System.out.println(text);
		alertSendKeys(5, "Gajendra");
	}

	public static Alert waitForJSAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getAlertText(int timeOut) {
		Alert alert = waitForJSAlert(timeOut);
		String text = alert.getText();
		alert.accept();
		return text;
	}
	
	public static void acceptAlert(int timeOut) {
		waitForJSAlert(timeOut).accept();
	}
	
	public static void dismissAlert(int timeOut) {
		waitForJSAlert(timeOut).dismiss();;
	}
	
	public static void alertSendKeys(int timeOut, String value) {
		Alert alert = waitForJSAlert(timeOut);
		alert.sendKeys(value);
		alert.accept();
	}
	
}
