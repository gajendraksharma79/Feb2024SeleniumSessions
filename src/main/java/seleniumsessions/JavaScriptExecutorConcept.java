package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		
		//JavaScriptExecutor --> Interface ---executeScript();
		//RWD --> JavaScriptExecutor
		//RWD --> WebDriver
		
		//To execute the JS on the browser --JS
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.get("https://classic.crmpro.com/");
		driver.get("https://app.hubspot.com/login");
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		System.out.println(jsUtil.getTitleByJs());
//		System.out.println(jsUtil.getURLByJs());
//		
//		jsUtil.generateJSAlert("This is user generated pop-up");
		
		String pageText = jsUtil.getPageInnerText();
		System.out.println(pageText);
		
		System.out.println(pageText.contains("Powered By OpenCart"));
		
		//WebElement ele = driver.findElement(By.xpath("//h3[text()='Deals & Sales Pipeline']"));
		WebElement ele = driver.findElement(By.id("hs-login"));
//		jsUtil.scrollIntoView(ele);
		jsUtil.drawBorder(ele);
		

	}

}
