package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
//		
//		String forgotLinkText = driver.findElement(By.linkText("Forgotten Password")).getText();
//		System.out.println(forgotLinkText);
//		
//		String para = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]")).getText();
//		System.out.println(para);
		
		By header = By.tagName("h2");
		By forgotPwdLink = By.linkText("Forgotten Password");
		By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		
		ElementUtil util = new ElementUtil(driver);
		String headerText=util.doGetText(header);
		String fgtPwdLinkText=util.doGetText(forgotPwdLink);
		String paraText = util.doGetText(para);
		
		System.out.println(headerText+" : "+fgtPwdLinkText+" : "+paraText);
		
		
	}

}
