package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		
		//sync concept:
		//sel script <--> app
		
		Thread.sleep(10000); //10 secs -- static wait/hard wait ---> Java
		
		//e1 --> 0 secs, 2 secs, 14 secs, 18 secs 
		
		//dynamic wait: 10 secs ------>2 secs ---->8 secs (cancelled)
		//10 secs ------>0 secs ---->10 secs (cancelled)
		//10 secs ------>8 secs ---->2 secs (cancelled)
		//10 secs ------>12 secs ---->Timout Exception
		
		//1. Implicitly Wait
			//global wait: it will be applied for all the webelements by default
		//2. Explicit Wait
			//2.a: WebDriverWait
			//2.b: FluentWait
		
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Sel 4.x
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//Login Page : 10 secs
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com"); //10 secs : 2 secs (8 secs cancelled)
//		driver.findElement(By.id("input-password")).sendKeys("test@123"); // 10 secs : 5 secs (5 secs cancelled)
//		driver.findElement(By.xpath("//input[@value='login']")).click();//10 secs : 11 secs (Timeout exception after 10 secs)
//		
		//e4 e5 e6....e10 --->10 secs
		
//		//Home Page: 15 secs
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		//e11 e12 e13: 15 secs
//		
//		//After logout let suppose user again loads login page then in that case we again have to update the implicit wait
//		
//		//login page: 10 secs
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		//reg page: 5secs
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//nullify the imp wait == 0
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		//login page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //again we have to update it to 10 sec as in 
		//line 58 we have updated the global wait to 0.
		
		//we should never user implicit wait as it is a global wait which will be applied for all the webelements by default
		
		//Also implicit wait cannot be applied for non webelements: url, title, alerts
		
		
	}

}
