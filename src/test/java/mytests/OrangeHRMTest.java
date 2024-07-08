package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {
	
	
	@Test(description = "Validatin Login Page Title")
	public void orangeHRMTitleTest() {
		String actualTitle = driver.getTitle();
		System.out.println("Page title : "+actualTitle);
		Assert.assertEquals(actualTitle, "30-Day Advanced Free Trial | OrangeHRM", "===Title is not matched===");
	}
	
	@Test(description = "Validating Login Page URL")
	public void orangeHRMURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println("Page URL : "+actualURL);
		//Assert.assertEquals(actualURL, "Account Login");
		Assert.assertTrue(actualURL.contains("30-day-free-trial"),"===url is not matched===");
	}
	
		
	

}
