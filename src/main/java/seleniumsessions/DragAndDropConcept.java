package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();

		//drag an element and drop it on some other element
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		Actions action = new Actions(driver);
		
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		//action.dragAndDrop(sourceElement, targetElement).perform();
		action
			.clickAndHold(sourceElement)
				.moveToElement(targetElement)
					.release().build().perform(); //not mandatory to use buil() in selenium4. It was mand till sel3
		
		
		//.perform --> calling build().perform() internally
		//.build() ---> alone will not work
		//,build().perform() ---> will work
	}
	
	public static void doDragAndDrop(By sourceLocator, By targetLocator) {
		Actions action = new Actions(driver);
		WebElement sourceElement = driver.findElement(sourceLocator);
		WebElement targetElement = driver.findElement(targetLocator);
		action.dragAndDrop(sourceElement, targetElement).perform();;
		
		
	}

}
