package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartLoginTest {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	}
	
	@Test(description = "Validatin Loin Page Title")
	public void loginPageTitleTest() {
		String actualTitle = driver.getTitle();
		System.out.println("Page title : "+actualTitle);
		Assert.assertEquals(actualTitle, "Account Login", "===Title is not matched===");
	}
	
	@Test(description = "Validating Login Page URL")
	public void loginPageURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println("Page URL : "+actualURL);
		//Assert.assertEquals(actualURL, "Account Login");
		Assert.assertTrue(actualURL.contains("route=account/login"),"===url is not matched===");
	}
	
	@Test(description = "Checkingh logo is displayed")
	public void loginPageLogoTest() {
		By logo = By.cssSelector("img.img-responsive");
		boolean flag = driver.findElement(logo).isDisplayed();
		Assert.assertEquals(flag, true,"===logo is missing===");
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
