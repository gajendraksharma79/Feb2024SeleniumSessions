package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsActionConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		Actions action = new Actions(driver);
		
		action.sendKeys(driver.findElement(firstName), "Gajendra Sharma").perform();
//		action.click(driver.findElement(By.linkText("Forgotten Password"))).perform();
		
		Action act = action.sendKeys(driver.findElement(firstName), "Gajendra Sharma").build();
		act.perform();
		
	
	
	}

}
