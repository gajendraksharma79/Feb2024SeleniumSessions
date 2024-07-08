package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidSelectorExceptionConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//driver.findElement(By.id("input-email11")).sendKeys("abc"); //NoSuchElement Exception
		
		//driver.findElement(By.xpath("//input{@@@@text())='abc'@")).click(); 
//		org.openqa.selenium.JavascriptException: javascript error: 
//		{"status":32,"value":"Unable to locate an element with the xpath expression //input{@@@@text())='abc'@ 
//		because of the following error:\nSyntaxError: Failed to execute 'evaluate' on 'Document': 
//		The string '//input{@@@@text())='abc'@' is not a valid XPath expression."}


//		driver.findElement(By.cssSelector("input//{@id==='abc'")).click();//JavascriptException: javascript error: {"status":32,"value":"An invalid or illegal selector was specified"}
		
//		driver.findElement(By.id("gajendra")).click(); //NSE
		
//		driver.findElement(By.xpath("//input{@#id='abc'")).click();
//		SyntaxError: Failed to execute 'evaluate' on 'Document': 
//		The string '//input{@#id='abc'' is not a valid XPath expression."}
		
		driver.findElement(By.className("form-control input-lg")).click();
//		InvalidSelectorException: Compound class names not permitted
	
	
	}

}
