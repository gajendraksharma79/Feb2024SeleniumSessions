package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandling {

	public static void main(String[] args) throws InterruptedException {

		// Pseudo Classes:
		// ::Before
		// ::After
		// ::Has

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String firstNameJSContent = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before')"
				+ ".getPropertyValue(\"content\")";
		
		String firstNameJSColor = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before')"
				+ ".getPropertyValue(\"color\")";

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String mandatory_FieldText = js.executeScript(firstNameJSContent).toString();
		
		String mandatory_FieldColor = js.executeScript(firstNameJSColor).toString();
		
		System.out.println(mandatory_FieldText);
		
		
		if(mandatory_FieldText.contains("*")) {
			System.out.println("Fist Name is mandatory field");
		}
		
		System.out.println(mandatory_FieldColor);
		
		if(mandatory_FieldColor.contains("rgb(255, 0, 0)")) {
			System.out.println("First Name mandatory field color is Red");
		}
	}

}
