package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCRMWebTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		//driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.get("https://classic.crmpro.com/");
		
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		//driver.findElement(By.xpath("//a[text()='Contacts' and @title='Contacts']")).click();
		driver.findElement(By.linkText("CONTACTS")).click();
//		driver.findElement
//		(By.xpath("//a[text()='Mustafa Hanif']/parent::td/preceding-sibling::td/input[@name='contact_id']")).click();
//		//By checkBoxJoe = By.xpath("//a[text()='John.Smith']/ancestor::tr//input[@type='checkbox']");
//		String companyName = driver.findElement
//			(By.xpath("//a[text()='Rakesh King']/parent::td/following-sibling::td/a[@context='company']")).getText();
//		System.out.println(companyName);
		selectMultiUserName("neha sharma");
		// get emailid
//		(//a[text()='Rakesh King']/parent::td/following-sibling::td)[last()-1]/a
		//a[text()='Rakesh King']/parent::td/following-sibling::td/a[contains(@href,'mailto:')]
	}
	
	public static String getCompanyName(String userName) {
		return driver.findElement
				(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}
	
	public static void selectUserName(String userName) {
		driver.findElement
		(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@name='contact_id']")).click();
		
	}
	
	public static void selectUserName(String userName, int index) {
		driver.findElement
		(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@name='contact_id']["+index+"]"))
			.click();
		
	}
	public static void selectLastUserName(String userName, int index) {
		driver.findElement
		(By.xpath("(//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@name='contact_id'])[last()]"))
			.click();
		
	}
	public static void selectMultiUserName(String userName) {
		List<WebElement> userCheckList = driver.findElements
			(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@name='contact_id']"));
		for(WebElement e : userCheckList) {
			e.click();
		}
	}

}
