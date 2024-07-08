package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//AAA
	
public class OpenCartLoginTest extends BaseTest {
	
	@Test(description = "Validatin Login Page Title")
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
	
	
}
