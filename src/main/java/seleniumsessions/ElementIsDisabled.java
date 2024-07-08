package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisabled {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/register/");
		
		By submitBtn = By.id("submitButton");
		By agreeTermsChkbox = By.name("agreeTerms");
		
		boolean f1 = driver.findElement(submitBtn).isDisplayed();
		System.out.println(f1);//true
		
		boolean f2 = driver.findElement(submitBtn).isEnabled();
		System.out.println(f2);//false
		
		boolean f3 = driver.findElement(submitBtn).isDisplayed();
		System.out.println(f3);//true
		
		driver.findElement(agreeTermsChkbox).click();
		boolean f4 = driver.findElement(submitBtn).isEnabled();
		System.out.println(f4);//true
		
		System.out.println(driver.findElement(agreeTermsChkbox).isSelected());
		
		

	}

}
