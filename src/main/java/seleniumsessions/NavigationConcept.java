package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {
	
	//1. Navigate to specific url or go to url
			//2. back
			//3. forward
			//4. refresh

	static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		
		
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		//driver.navigate().to("https://www.amazon.com");
		driver.navigate().to(new URL("https://www.amazon.com"));
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		
		
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();

	}

}
