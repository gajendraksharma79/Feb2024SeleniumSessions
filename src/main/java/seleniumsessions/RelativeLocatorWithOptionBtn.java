package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorWithOptionBtn {

	public static void main(String[] args) throws InterruptedException {
		//normalize-space with text
		//label[text()[normalize-space() = 'Yes']]
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Thread.sleep(3000);
		String toSelect = "Rigt";
		
		WebElement yesLabel = driver.findElement(By.xpath("//label[text()[normalize-space() = 'Yes']]"));
		
		System.out.println(driver.findElement(By.xpath("//label[text()[normalize-space() = 'Yes']]")).getText());
//		if(toSelect.equals("Right")) {
		//	driver.findElement(with(By.tagName("input")).toRightOf(yesLabel)).click();
//		}
//		else {
			driver.findElement(with(By.tagName("input")).toLeftOf(yesLabel)).click();
//		}
		
		
		
	}

}
