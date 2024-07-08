package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
//		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
//		By contentMenu = By.cssSelector("a.menulink");
//		By coursesLink = By.linkText("ARTICLES");
//		handleParentSubmenu(contentMenu, coursesLink);
		driver.get("https://www.spicejet.com/");
		
		By parentMenu = By.xpath("//div[text()='Add-ons']");
		By childMenu = By.xpath("//div[text()='Extra Seat']");
		handleParentSubmenu(parentMenu,childMenu);
		
	}
	
	
	public static void handleParentSubmenu(By parentLocator, By childLocator) throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement parent = driver.findElement(parentLocator);
				
		action.moveToElement(parent).perform();
		
		Thread.sleep(2000);
//		action.moveToElement(contentMenu).build().perform();
		driver.findElement(childLocator).click();
		
	}

}
