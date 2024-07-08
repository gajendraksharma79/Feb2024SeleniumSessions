package mytests;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import seleniumsessions.BrowserUtil;
import seleniumsessions.ElementUtil;

public class RegistrationPageTest extends BaseTest{
	
	public String getRandomEmailId() {
		
		String emailId = "opencart"+System.currentTimeMillis() +"@openmail.com";
		//String emailId = "opencart"+UUID.randomUUID() +"@openmail.com";
		
		return emailId;
	}
	
	@DataProvider
	public Object[][] getRegTestData() {
		return new Object [][] {
			{"Samiksha", "Sharma","9889987654","test@123"},
			{"Saksham", "Sharma","8889987654","test@123"},
			{"Sonu", "Sharma","7789987654","test@123"}
			
		};
	}
	
	
	@Test(dataProvider = "getRegTestData")
	public void registerTest(String firstNm, String lastNm,  String phone, String password) {
		
		//First Name
		By firstName = By.id("input-firstname");
		
		//Last Name
		By lastName = By.name("lastname");
		
		//Email
		By email = By.id("input-email");
		
		//telephone
		By telephone = By.name("telephone");
		//Password
		By pwd = By.id("input-password");
		//Confirm Password
		By confirmPWD = By.name("confirm");
		//Privacy Policy
		By privPolicyCheck = By.name("agree");
		//Continue button
		By continueBtn = By.xpath("//input[@value='Continue']");
		//Account created Header
		By accountSuccess = By.tagName("h1");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(firstName,firstNm );
		eUtil.doSendKeys(lastName, lastNm);
		eUtil.doSendKeys(email, getRandomEmailId());
		eUtil.doSendKeys(telephone, phone);
		eUtil.doSendKeys(pwd, password);
		eUtil.doSendKeys(confirmPWD, password);
		eUtil.doClick(privPolicyCheck);
		eUtil.doClick(continueBtn);
		String expectedMsg = "Your Account Has Been Created!";
		String actualMsg = eUtil.doGetText(accountSuccess);
//		if(actualMsg.equals(expectedMsg)) {
//			System.out.println("User Registered Successfully and message :"+actualMsg+"displayed successfully");
//		}
//		else {
//			System.out.println("There is some issue in User Registration...Please Verify Again as message: "+actualMsg+"displayed");
//		}
		Assert.assertEquals(actualMsg, expectedMsg);
		
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Register")).click();
		//quit browser
		
		
		
		
	}
	

}
