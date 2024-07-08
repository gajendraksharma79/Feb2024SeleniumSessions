package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindowsTabWith2WinAtATime {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //parent
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click(); //child
		
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		String parentWindowID = itr.next();
		System.out.println(parentWindowID);
		
		String childWindowID = itr.next();
		System.out.println(childWindowID);
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowID);
		
//		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
//		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
//		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
	}

}
