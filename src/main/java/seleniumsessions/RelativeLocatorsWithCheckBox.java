package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class RelativeLocatorsWithCheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		
//		WebElement privPolicyCheck = driver.findElement(By.linkText("Privacy Policy"));
//		
////		driver.findElement(with(By.name("agree")).toRightOf(privPolicyCheck)).isDisplayed();
//		driver.findElement(with(By.name("agree")).toRightOf(privPolicyCheck)).click();
//		
//		driver.findElement(with(By.cssSelector("input.btn.btn-primary")).toRightOf(privPolicyCheck)).click();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement newCustomerEle = driver.findElement(By.xpath("//h2[text()='New Customer']"));
		WebElement continueBtn = driver.findElement(By.linkText("Continue"));
		
		List<WebElement> pElements = driver.findElements(with(By.tagName("p")).below(newCustomerEle).above(continueBtn));
		
		for(WebElement e : pElements) {
			String text = e.getText();
			System.out.println(text);
		}
		
		
		
	}

}
