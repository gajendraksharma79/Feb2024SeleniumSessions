package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Frame is used to provide extra layer of security for some elements i.e to provide security. You cannot directly snif into 
		//any iFrame/frame on the webpage. for e.g in Banking app, login fields are present on some frame.
		
		WebDriver driver = new ChromeDriver(); //browser
		driver.get("https://www.formsite.com/templates/registration-from-templates/vehicle-registration-form/"); //page
		//Thread.sleep(3000);
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		//driver.switchTo().frame("frame-one748593425");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		//String header = driver.findElement(By.tagName("h2")).getText();
		driver.findElement(By.cssSelector("input#RESULT_TextField-1")).sendKeys("Gajendras Proposal");
		//System.out.println(header);
		driver.switchTo().defaultContent(); //navigate back to the main page containing frame/iframe.
		System.out.println(driver.findElement(By.tagName("h3")).getText());
	}

}
