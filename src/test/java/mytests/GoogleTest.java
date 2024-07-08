package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{

	@Test(description = "Validating Login Page Title")
	public void googleTitleTest() {
		String actualTitle = driver.getTitle();
		System.out.println("Page title : "+actualTitle);
		Assert.assertEquals(actualTitle, "Google", "===Title is not matched===");
	}
	
	@Test(description = "Validating google Page URL")
	public void googleURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println("Page URL : "+actualURL);
		//Assert.assertEquals(actualURL, "Account Login");
		Assert.assertTrue(actualURL.contains("google"),"===url is not matched===");
	}
	
		
	

}
