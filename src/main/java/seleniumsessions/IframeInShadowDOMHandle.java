package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeInShadowDOMHandle {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(3000);
		String jsScript = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement parentIframe = (WebElement)js.executeScript(jsScript);
		driver.switchTo().frame(parentIframe);
		String jsScriptDest = "return document.querySelector(\"#glaf\")";
		
		WebElement destinyInput = (WebElement)js.executeScript(jsScriptDest);
		
		destinyInput.sendKeys("Want to be an Automation Engineer");
	}

}
