package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //parent
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click(); //child
		
		//1. Fetch the windows ids:
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> itr = handles.iterator();
		
		String parentWindowID = itr.next();
		System.out.println(parentWindowID);
		
		String childWindowID = itr.next();
		System.out.println(childWindowID);
		
		//2. Switching Work:
		
		driver.switchTo().window(childWindowID);
		System.out.println("This is child window URL: "+driver.getCurrentUrl());
		driver.close(); //close the child window
		
		//driver is lost
		
		driver.switchTo().window(parentWindowID);
		System.out.println("This is Parent Window URL: "+driver.getCurrentUrl());
		driver.quit(); //Close the parent window
		
		
		
		
		
		
		
		
		
		
		

	}

}
