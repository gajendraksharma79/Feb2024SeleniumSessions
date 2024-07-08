package seleniumsessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	WebDriver driver;
	Properties prop;
	
	public WebDriver launchBrowser(String browserName) {
		System.out.println("Launching Browser"+browserName);
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
	
		default:
			System.out.println("Plzz pass the right Browser..."+browserName);
			throw new BrowserException("Invalid Browser"+browserName);
			
		}
		
		return driver;
		
	}
	
	public void launchURL(String url) {
		if(url==null) {
			throw new BrowserException("Invalid URL"+url);
		}
		if(url.isBlank() || url.isEmpty()) {
			throw new BrowserException("Blank/Empty URL"+url);
		}
		//https://www.google.com
		if(url.indexOf("http")!=0 || url.indexOf("http")>0) {
			throw new BrowserException("http(s) is missing from URL"+url);
		}
		//launch browser with the given URL
		driver.get(url.trim());
	}
	
	public String getTitle() {
		String title=driver.getTitle();
		if(title == null) {
			System.out.println("Getting the null title...");
			return null;
		}
		return title;
		
	}
	
	public String getPageCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
}
