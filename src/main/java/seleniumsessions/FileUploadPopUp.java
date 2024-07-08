package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		// driver.get("https://classic.freecrm.com/register/");
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type = file: windows/linux/mac
		//driver.findElement(By.name("upfile")).click();//if we use
		// click method then file-uploa popup will open and we will not be able to interact with the page.
		//So we will use .sendkeys method instead
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\gajen\\OneDrive\\Desktop\\Learning\\Python\\WebsiteForPractice.txt");
		
		//1. AutoIT - tool: Windows -- not recommended
		//2. Sikuli - lib: images (works on resolution of elements) -- not recommended
		//3. Robot class - Jave: windows machine -- not recommended -- not work in headless mode, aws, linux, pipeline docker etc.
		
		
		//other types of pop-up
		//cookies pop-up
		//adv pop-up
		//browser window pop-up
	}

}
