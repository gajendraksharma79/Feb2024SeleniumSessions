package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectValueDropDown {

	static WebDriver driver;

	public static void main(String[] args) {
		// 1. Multiple attribute should be there with select tag
		// 2. Select the value from drop down without using Select class

		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"post-291\"]/div/div[2]/select")));
		System.out.println(select.isMultiple());
		if(select.isMultiple()) {
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Lesser flamingo");
			select.selectByVisibleText("Greater flamingo");
		}
		//select.deselectAll();
		select.deselectByVisibleText("Greater flamingo");
		
	}
	public static WebElement getElement(By locator) {

		WebElement element = driver.findElement(locator);
			return element;
	}

	
	public void deSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.deselectByIndex(index);
		
	}
	
	public void deSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.deselectByValue(value);
		
	}
	
	public void deSelectByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.deselectByVisibleText(value);
		
	}

}
