package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with; //using this we don't have to use "with" metho
//using classname

public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {

//Selenium 4.x onwards
//							Above Element	
//								|
//								|
//		 	Left Element<--WebElement --->Right Element
//								|
//								|
//					near	Below Element	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.linkText("Yellowknife, Canada"));
		
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
		
		String aqiScore = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(aqiScore);
		
		//String belowCityName = driver.findElement(with(By.tagName("a")).below(ele)).getText();
		String belowCityName = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCityName);
		
		//String aboveCityName = driver.findElement(with(By.tagName("a")).above(ele)).getText();
		String aboveCityName = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCityName);
		
		String nearCity = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearCity);
	
	
	}	

}
