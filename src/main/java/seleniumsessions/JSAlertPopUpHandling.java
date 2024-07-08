package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertPopUpHandling {

	// JS Alerts:
	// 1. alert()
	// 2. prompt()
	// 3. confirm()

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		// driver.get("https://classic.freecrm.com/register/");
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.switchTo().alert();
		
		//1. Alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		Alert alert = driver.switchTo().alert();
//		
//		String text = alert.getText();
//		System.out.println(text);
//		Thread.sleep(3000);
//		//alert.accept();
//		alert.dismiss();
		
		//2. Confirm
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
////		
//		Alert alert = driver.switchTo().alert();
//		
//		String text = alert.getText();
//		System.out.println(text);
//		Thread.sleep(3000);
//		//alert.accept();//To click on OK button
//		alert.dismiss();//To click on Cancel button
		
		//3. Prompt
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();	
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		
//		alert.sendKeys("Gajendra");
//		Thread.sleep(3000);
//		//alert.accept();//To click on OK button
//		alert.dismiss();//To click on Cancel button
		
		

	}

}
