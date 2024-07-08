package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4LevelMenuHandlingBigBasket {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");

		By shopByCatMenuL1 = By.xpath("(//button[contains(@id,'headlessui-menu-button')]//span[text()='Shop by'])[2]");
		By catSubMenuL2 = By.linkText("Snacks & Branded Foods");
		By catSubMenuL3 = By.linkText("Ready To Cook & Eat");
		By catSubMenuL4 = By.linkText("Dessert Mixes");

//		level4MenuSubmenuHandlingUsingClick(shopByCatMenuL1, catSubMenuL2, catSubMenuL3, catSubMenuL4);
		
		level4MenuSubmenuHandlingUsingClick(shopByCatMenuL1, "Cleaning & Household", "Fresheners & Repellents", "Mosquito Repellent");
	
}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void level4MenuSubmenuHandlingUsingClick(By level1, String level2, String level3, String level4)
			throws InterruptedException {
		
		getElement(level1).click();
		
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		// action.moveToElement(shopByCatMenuL1).click();
		action.moveToElement(getElement(By.linkText(level2))).perform();
		Thread.sleep(1000);
		action.moveToElement(getElement(By.linkText(level3))).perform();
		Thread.sleep(1000);
		getElement(By.linkText(level4)).click();
	}

	public static void level4MenuSubmenuHandlingUsingClick(By level1, By level2, By level3, By level4)
			throws InterruptedException {

		getElement(level1).click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		// action.moveToElement(shopByCatMenuL1).click();
		action.moveToElement(getElement(level2)).perform();
		Thread.sleep(1000);
		action.moveToElement(getElement(level3)).perform();
		Thread.sleep(1000);
		getElement(level4).click();
	}

	public static void level4MenuSubmenuHandlingUsingMouseHover(By level1, By level2, By level3, By level4)
			throws InterruptedException {
		
		Actions action = new Actions(driver);
		action.moveToElement(getElement(level1)).perform();;
		Thread.sleep(1000);
		
		// action.moveToElement(shopByCatMenuL1).click();
		action.moveToElement(getElement(level2)).perform();
		Thread.sleep(1000);
		action.moveToElement(getElement(level3)).perform();
		Thread.sleep(1000);
		getElement(level4).click();
	}

}
