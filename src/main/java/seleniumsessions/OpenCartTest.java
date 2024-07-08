package seleniumsessions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class OpenCartTest {

	public static void main(String[] args) {
		
		ReadProperty readprop = new ReadProperty();
		Properties prop =readprop.initProp();
		
		String browser = prop.getProperty("browser");
		//String url = prop.getProperty("url");
		
		
		BrowserUtil util = new BrowserUtil();
		util.launchBrowser(browser);
		util.launchURL(prop.getProperty("url"));
		String actTitle = util.getTitle();
		System.out.println("Page Title: "+actTitle);
		
		
		
		
	}

}
