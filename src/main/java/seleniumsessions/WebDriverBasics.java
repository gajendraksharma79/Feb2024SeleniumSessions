package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//open the browser
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		
		//Enter the URL
		driver.get("https://naveenautomationlabs.com/opencart");
		
		//get the browser title
		
		String browserTitle = driver.getTitle();
		System.out.println("The Page title is : " +browserTitle);
		
		if(browserTitle.equals("Google")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
		
		//Automation Steps + Validation/Checkpoint = Automation Testing
		
		//fetch the URL
		
		String url = driver.getCurrentUrl();
		
		System.out.println("Page URL is : "+url);
		
		if(url.contains("google.com")) {
			System.out.println("URL is correct");
		}
		else {
			System.out.println("URL is not correct");
		}
		
		//Close the Browser
		//driver.close();
		//driver.quit();
	}

}
