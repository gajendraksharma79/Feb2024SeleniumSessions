package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Language_Links {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//By searchField = By.name("keyword");
		By links = By.xpath("//div[@id='SIvCob']/a");	
		List<WebElement> googleLangLinks = driver.findElements(links);
		System.out.println(googleLangLinks.size());
		
		for(WebElement e : googleLangLinks) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("मराठी")){
				e.click();
				break;
			}
		}
		
		
	
		
		
		
	}

}
