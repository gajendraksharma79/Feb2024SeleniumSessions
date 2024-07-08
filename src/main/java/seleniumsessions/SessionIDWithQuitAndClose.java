package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionIDWithQuitAndClose {

public static void main(String[] args) {
		
		//open the browser
		WebDriver driver = new ChromeDriver();
		
		
		
		//Enter the URL
		driver.get("https://naveenautomationlabs.com/opencart");
		
		//get the browser title
		
		String browserTitle = driver.getTitle();
		System.out.println("Page title :"+browserTitle);
		
		//fetch the URL
		
		String url = driver.getCurrentUrl();
		
		System.out.println("Page URL is : "+url);
		
		//Close the Browser
		driver.close(); 
		//driver.quit();
		System.out.println(driver.getTitle());//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()? 
		//with driver.close() // NoSuchSessionException: invalid session id
	}


}
