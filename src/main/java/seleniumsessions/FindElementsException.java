package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsException {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//driver.findElement(By.id("input-email11")).sendKeys("abc");
		
		List<WebElement> elements = driver.findElements(By.xpath("//aside[@id='column-right123']//a"));
		System.out.println(elements.size());
		

	}

}
