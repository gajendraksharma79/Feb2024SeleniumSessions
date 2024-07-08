package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowTabConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String pWindow = driver.getWindowHandle();
		//Selenium 4.x
		
		driver.switchTo().newWindow(WindowType.WINDOW); //Create new blank tab and automatically switch to it also		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(pWindow);
		System.out.println(driver.getTitle());
	}

}
