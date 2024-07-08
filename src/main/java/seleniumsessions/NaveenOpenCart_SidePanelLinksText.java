package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaveenOpenCart_SidePanelLinksText {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By links = By.xpath("//aside[@id='column-right']//a");
		
		List<WebElement> sideLinksList = driver.findElements(links);
		System.out.println(sideLinksList.size());
		for(WebElement e : sideLinksList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Wish List")) {
				e.click();
				break;
			}
		}
		
		

	}

}
