package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		//right click ---> context click ---> context menu
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions action = new Actions(driver);
		
		
		By rightClickElement = By.xpath("//span[text()='right click me']");
		action.contextClick(driver.findElement(rightClickElement)).perform();
		
		By contextMenuItems = By.xpath("//ul[@class='context-menu-list context-menu-root']//li/span");
		List<WebElement> contextMenuItemList = driver.findElements(contextMenuItems);
		
			for(WebElement e : contextMenuItemList) {
			
//				String text = e.getText();
//				System.out.println(text);
	//				if(text.equals("Copy")) {
	//					e.click();
	//					break;
	//				}
				e.click();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				
				action.contextClick(driver.findElement(rightClickElement)).perform();
			}
		
	}
	public static void doContextClick(By contextLocator) {
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(contextLocator)).perform();
		
	}
	

}
