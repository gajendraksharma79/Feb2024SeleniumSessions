package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClickWithWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		By signUpLink = By.linkText("Sign Up");
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickWhenReady(signUpLink, 10);
		
	}

}
