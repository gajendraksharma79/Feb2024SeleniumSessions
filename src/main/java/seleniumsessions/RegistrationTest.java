package seleniumsessions;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {

	

	public static void main(String[] args) throws MalformedURLException {
		
		BrowserUtil util = new BrowserUtil();
		WebDriver driver = util.launchBrowser("chrome");
		util.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
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
		eUtil.doSendKeys(firstName, "Gajendra");
		eUtil.doSendKeys(lastName, "Sharma");
		eUtil.doSendKeys(email, "gajendraks0@gmail.com");
		eUtil.doSendKeys(telephone, "9818532020");
		eUtil.doSendKeys(pwd, "test@123");
		eUtil.doSendKeys(confirmPWD, "test@123");
		eUtil.doClick(privPolicyCheck);
		eUtil.doClick(continueBtn);
		String expectedMsg = "Your Account Has Been Created!";
		String actualMsg = eUtil.doGetText(accountSuccess);
		if(actualMsg.equals(expectedMsg)) {
			System.out.println("User Registered Successfully and message :"+actualMsg+"displayed successfully");
		}
		else {
			System.out.println("There is some issue in User Registration...Please Verify Again as message: "+actualMsg+"displayed");
		}
		
		//quit browser
		util.quitBrowser();
		
		
		
		
		
	}

}
