package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElementInsideIframeHandle {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		Thread.sleep(2000);
		
		//Browser --> Page --Iframe ---ShadowDOM --Element
		js.executeScript("window.scrollTo(0,'400')");
		
		driver.switchTo().frame("pact");
		
		String jsScript = "return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		
	
		
		WebElement tea = (WebElement)js.executeScript(jsScript);
		tea.sendKeys("I love Himachal Tea");
		
		
		
		

	}

}
