package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	
	//total links
	//fetch text (if available)
	//check link is valid/not broken

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		//driver.get("https://flipkart.com");
		
		//htmltag = <a>
		
//		List<WebElement> linksList = driver.findElements(By.tagName("a"));
//		
//		int totalLinks = cartLinks.size();
//		System.out.println("Total Links = "+totalLinks);
//		
//		for (WebElement e : linksList) {
//			String text = e.getText();
//				if(text.length()!=0) {
//					
//				}
//		
//		}
//		int countLinkWithText=0;
//		int countLinkWithoutText=0;
//		for(int i=0;i<totalLinks;i++) {
//			String text =cartLinks.get(i).getText();
//			
//			if(text.length()>0) {
//				System.out.println(text);
//				countLinkWithText=countLinkWithText+1;
//			}
//			else {
//				countLinkWithoutText=countLinkWithoutText+1;
//			}
//		}
//		System.out.println("Total Links with Text = "+countLinkWithText);
//		System.out.println("Total Linkw without Text are = "+countLinkWithoutText);
//		
//		driver.quit();
		
		By Links = By.tagName("a");
		List<WebElement> cartLinks = getElements(Links);
		System.out.println(getElementsCount(Links));
		
		By images = By.tagName("img");
		System.out.println(getElementsCount(images));
		
		List<String> eleText = getElementsTextList(Links);
		System.out.println(eleText);
			
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		
	}
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	//WAF: to fetch the text of each link, store it in some list and return
	//Name:getElementTextList
	//Param: By locator
	//return: List<String>
	
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eletextList=new ArrayList<String>();
		for(WebElement e: eleList) {
			String text = e.getText();
			if(text.length()!=0) {
				eletextList.add(text);
			}
		}
		return eletextList;
		
	}

}
