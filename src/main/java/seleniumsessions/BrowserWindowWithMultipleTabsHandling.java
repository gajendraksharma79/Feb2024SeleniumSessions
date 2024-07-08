package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowWithMultipleTabsHandling {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //parent
		
		//Window handler apis
		//any browser: window/tab
		//advertisements
		String parentWindow = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click(); //child
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> itr = handles.iterator();
		//String parentWindow = itr.next();
		
		while(itr.hasNext()) {
			String windowID = itr.next();
			driver.switchTo().window(windowID);
			System.out.println(driver.getCurrentUrl());
			if(!windowID.equals(parentWindow)) {
			driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
