package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// html tag = select
		// Select class in selenium
		
		
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/contact-sales");
		
		By country = By.id("Form_getForm_Country");
		System.out.println(getDropDownOptionsCount(country));
		System.out.println(getDropDownOptionsTextList(country));
//		By numEmployees = By.name("NoOfEmployees");
		
//		Select selectC = new Select(driver.findElement(country));
//		Select selectEmp = new Select(driver.findElement(numEmployees));
//				
//		List<WebElement> countryOptions = selectC.getOptions();
//		int totalCountries = countryOptions.size();
//		System.out.println(totalCountries);
//		
//		for(WebElement e : countryOptions) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
//		for(int i=0;i<options.size();i++) {
//			options.get(i).getText();
//		}
		
		
	}
	public static WebElement getElement(By locator) {

		WebElement element = driver.findElement(locator);
			return element;
	}
	
	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}
	
	public static List<String> getDropDownOptionsTextList(By locator) {
		Select select = new Select(getElement(locator));
		List<String> optionsTextList = new ArrayList<String>();
		List<WebElement> allOptions = select.getOptions();
		for(WebElement e: allOptions) {
			String text=e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
		
	}

}
