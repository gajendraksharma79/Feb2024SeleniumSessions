package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownGetOptionsWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
		// 1. Select the value from drop down without using Select class methods like
		// ByValue, ByIndex, ByVisibleText
		// 2. Select the value from drop down without using Select class

		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/contact-sales");

		By country = By.id("Form_getForm_Country");
		By numEmployees = By.name("NoOfEmployees");

		// selectValueFromDropDown(country,"Pakistan");
//		By countryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");
//
//		// List<WebElement> countryList = driver.findElements(country);
//		// System.out.println(countryList.size());//will return 1 value
//
//		 List<WebElement> countryList = driver.findElements(countryOptions);
//		 System.out.println(countryList.size());//will return 233 value
//		 
//		 for(WebElement e: countryList) {
//			 if(e.getText().equals("India")) {
//				 e.click();
//				 break;
//			 }
//		 }

	}

	public static WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

	public static void selectValueFromDropDown(By locator, String optionText) {
		Select select = new Select(getElement(locator));
		List<WebElement> selectOptions = select.getOptions();

		for (WebElement e : selectOptions) {
			String text = e.getText();
			if (text.equals(optionText.trim())) {
				e.click();
				break;
			}
		}
	}
	
	public static void selectValueFromDropDownWithoutSelectClass(By locator, String optionText) {
		List<WebElement> optionsList = driver.findElements(locator);
		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals(optionText.trim())) {
				e.click();
				break;
			}
		}
	}

}
