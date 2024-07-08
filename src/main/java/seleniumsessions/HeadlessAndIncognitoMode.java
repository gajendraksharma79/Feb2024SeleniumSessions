 package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessAndIncognitoMode {

	public static void main(String[] args) {
		
		//headless mode:
		//no browser - blocking the browser visibility (no browser gets opened and test runs in background)
		//slightly faster then normal mode
		//not recommended - no user experience
		// when to use? --> headless based OS --> linux, docker, VM
		// for simple and small test cases --> yes
		// it might not work with complex html components
		//Actions class operations like move to element, click etc will work.
		//screenshots will work
		//chromeoptions class is responsible for headless
		
		//incognito --> private window
		
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		
		WebDriver driver = new ChromeDriver(co);
		//WebDriver driver = new FirefoxDriver(fo);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
