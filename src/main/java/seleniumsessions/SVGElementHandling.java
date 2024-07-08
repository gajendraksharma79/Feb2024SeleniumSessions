package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandling {

	public static void main(String[] args) throws InterruptedException {
		
		//SVG: Scaler Vector Graphs
		//normal xpath will not work for SVG elements
		//svg[@fill='none'] --not valid
		//(//*[local-name()='svg'])[1]
		//*[local-name()='svg' and @id='map-svg']/*[name()='g' and @id='features']/*[name()='g' and @id='regions']//*[name()='path']
		//*[local-name()='svg' and @id='map-svg']//*[name()='path']
		//*[name()='path']
		
		//svg --->local-name()='svg'
		//svg --->name()='svg'
		//*[name()='svg' and @id='map-svg']
		//*[local-name()='svg' and @id='map-svg']
		
		//*[name()='svg' and @id='map-svg']//*[local-name()='g' and @id='regions']
		
				
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("(//*[local-name()='svg'])[1]"));
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(7000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
//		String xpathVal="//*[local-name()='svg' and @id='map-svg']/*[name()='g' and @id='features']/*[name()='g' and @id='regions']//*[name()='path']";
		String xpathVal="//*[local-name()='svg' and @id='map-svg']//*[name()='path']";
		List<WebElement> stateList = driver.findElements(By.xpath(xpathVal));
		System.out.println(stateList.size());
		for(WebElement e : stateList) {
			String stateName = e.getAttribute("name");
			System.out.println(stateName);
		}
		
		
		

	}

}
