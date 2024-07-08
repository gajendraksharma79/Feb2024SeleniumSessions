package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		//driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//By checkBoxJoe = By.xpath("//a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']");
		//By checkBoxJoe = By.xpath("//a[text()='John.Smith']/ancestor::tr//input[@type='checkbox']");
		
		//driver.findElement(checkBoxJoe).click();
		selectUserFromWebTable("Joe.Root");
		selectUserFromWebTable("Jasmine.Morgan");
//		List<WebElement> elements = driver.findElements(By.xpath("//a[text()='John.Smith']/parent::td/following-sibling::td"));
//		for(WebElement e: elements) {
//			System.out.println(e.getText());
//		}
		System.out.println(getUserDataList("Joe.Root"));
		System.out.println(getUserDataList("John.Smith"));
		
		driver.findElement
			(By.xpath("//a[text()='Mustafa Hanif']/parent::td/preceding-sibling::td/input[@name='contact_id']"));
		
		
	}
	
	public static List<String> getUserDataList(String userName) {
		List<String> dataList = new ArrayList<String>();
		List<WebElement> userDataList = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		for(WebElement e: userDataList) {
			String text=e.getText();
			dataList.add(text);
		}
		return dataList;
		
	}
	
	public static void selectUserFromWebTable(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/ancestor::tr//input[@type='checkbox']")).click();
		
		
	}

}
