package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
				
		//Frame is used to provide extra layer of security for some elements i.e to provide security. You cannot directly snif into 
		//any iFrame/frame on the webpage. for e.g in Banking app, login fields are present on some frame.
		
		WebDriver driver = new ChromeDriver(); //browser
		driver.get("https://www.londonfreelance.org/courses/frames/index.html"); //page
		//Thread.sleep(3000);
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
	}

}
