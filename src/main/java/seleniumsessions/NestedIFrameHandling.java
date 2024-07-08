package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrameHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1"); //f1
		driver.findElement(By.id("inp_val")).sendKeys("testing");
		
		//F1 --> Default Content -->Page
//		driver.switchTo().defaultContent(); //page
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		//F1 --> PF --> Page
//		driver.switchTo().parentFrame();
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		driver.switchTo().frame("pact2"); //f2
		driver.findElement(By.id("jex")).sendKeys("automation");
		
		//F2 -->DC--->Page
//		driver.switchTo().defaultContent();
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		//F2 --->PF-->F1 --->DC/PF --->Page
		driver.switchTo().parentFrame(); //F1
		driver.findElement(By.id("inp_val")).sendKeys(" with Java");
		driver.switchTo().defaultContent();//Page
		String header = driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);
		
//		driver.switchTo().frame("pact3"); //f3
//		driver.findElement(By.id("glaf")).sendKeys("1M Subs");
		
		//Page --F1 : yes
		//F1 -- F2 : yes
		//F2 --F3 : yes
		//page -- F2 : no
		//page -- F3 : no
		//page -- F1 --F2 -- f3 : yes
		
		//due to line no 20, driver is currently at frame3 i.e. F3
		
		//Now using the following statement, driver switches to parent frame of F3 i.e. F2
//		driver.switchTo().parentFrame(); //F2
//		driver.findElement(By.id("jex")).sendKeys(" Selenium");
//		
//		driver.switchTo().parentFrame(); //F1
//		driver.findElement(By.id("inp_val")).sendKeys(" is love");
//		
//		driver.switchTo().parentFrame(); //page
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		//F3 ---> F2 --> F1 --> Page
		//F1 --> Page
		//F2 --> F1 --> Page
		
		//F3 --> Default Content -->Page
//		driver.switchTo().defaultContent(); //page
//		//driver.findElement(By.id("inp_val")).sendKeys(" CI CD"); //exception as it is not switching to first frame but switchig to main page as we have iframes
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		

	}

}
