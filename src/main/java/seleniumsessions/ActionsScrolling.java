package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.co.in");
		Actions action = new Actions(driver);
//		action.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		action.sendKeys(Keys.PAGE_UP).perform();
		
//		action.sendKeys(Keys.CONTROL)
//		.sendKeys(Keys.END).perform();
//		Thread.sleep(2000);
//		action.sendKeys(Keys.CONTROL)
//		.sendKeys(Keys.HOME).perform();
//		Thread.sleep(2000);
//		action.sendKeys(Keys.CONTROL)
//		.sendKeys(Keys.END).perform();
		
	//Scroll to Element
		
		action.scrollToElement(driver.findElement(By.linkText("Help")))
			.click(driver.findElement(By.linkText("Help")))
			.build().perform();
	
	}

}
