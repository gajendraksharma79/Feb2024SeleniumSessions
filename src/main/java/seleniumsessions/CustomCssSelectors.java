package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelectors {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		// CSS : locator --- to find a locator in DOM based on CSS Properties.
		// Cascaded style sheet responsible for look and feel

		// id : if id is available then use #id
		// htmltag#id
		// input#input-email

		// class : if class is available then use .className
		// .form-control
		// htmltag.className
		// input.form-control ---3 elements returned on naveen opencart app
		// img.img-responsive

		// multiple classes for element scenario

		// In this case all the classes has to be writeen with "."
		// .c1.c2.c3.c4....cn
		// .form-control.input-lg
		// htmltag.c1.c2...cn
		// input.form-control.input-lg
		// .form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email
		// input.login-email
		// input.form-control.private-form__control.login-password.m-bottom-3
		// input.login-password
		// input.m-bottom-3

		// Combining id and classes together

		// htmltag having id and class
		// htmltag#id.className
		// htmltag.className#id
		// input#username.login-email ---
		// input#input-email.form-control ---naveen open cart app
		// input.form-control#input-email
		// input.form-control.private-form__control.login-email#username
		// input#username.form-control.private-form__control.login-email

		// a.list-group-item ---13 items --FEs

		// for other attributes

		// htmltag[attr='value']
		// input[name='email'] --css
		// input[@name='email'] --xpath
		// input[placeholder='E-Mail Address'] -- css
		// input[id='input-email'] --css

		// using multiple attributes in css
		// htmltag[attr1='value'][attr2='value'][attr3='value']...[attr-n='value']
		// input[id='input-email'][name='email'][placeholder='E-Mail Address']

		// css without giving value of one or more attr
		// input[id][name='email'][placeholder='E-Mail Address']
		// input[id][name][placeholder='E-Mail Address']
		// a[href]

		// using attrbute and id
		// htmltag[attr='value]#id
		// input[name='email']#input-email
		// input#input-email[name='email']

		// using attribute and class

		// htmltag.className[attr='value']
		// input.form-control[name='email']
		// input[name='email'].form-control

		// To use 'Contains' with css use '*'

		// htmltag[attr*='partial value'] ---contains
		// input[placeholder*='E-Mail']
		// input[placeholder*='Address']

		// To use 'starts-with' with css use '^'

		// htmltag[attr^='partial value'] ---starts-with
		// input[placeholder^='E-Mail']
		// input[placeholder^='Address']

		// To use 'ends-with' with css use '$'

		// htmltag[attr$='partial value'] ---starts-with
		// input[placeholder$='E-Mail']
		// input[placeholder$='Address']

		// text() in css? -- Not Available

		// Parent to Child -- direct child: Using ">" symbol -- direct child element
		// htmltag >childelementtag
		// select#Form_getForm_Country > option

		// Parent to Child -- direct+indirect child elements: Using " " without '>' symbol 
		// htmltag childelementtag
		// select#Form_getForm_Country option
		// div#content form > div.form-group > input#input-email
		// nav#top > div -- direct = 1
		// nav#top div -- direct+indirect = 4
		
		//Child to Parent? -- not available --- major drawback in which backward traversing 
		//is not allowing in DOM using css
		
		//sibling in css?
		// preceding-sibling in css : Not Available as backward traversing not supported.
		// following-sibling in css : yes using "+" symbol
		
		// label[for='input-email']+input
		// label[for='input-email']+input#input-email
		// label[for='input-password']+input+a ---direct immediate following sibling one at a time
		
		// label[for='input-password']~a --- indirect not immediate following sibling directly using "~" symbol
		
		// indexing in css	
		// select#Form_getForm_Country > option:first-child -- first element out of 233 option
		// select#Form_getForm_Country > option:last-child -- last element out of 233 option
		// select#Form_getForm_Country > option:nth-child(3) ---third/specific element out of 233 option
		// select#Form_getForm_Country > option:nth-child(7) ---seventh/specific element out of 233 option
		// select#Form_getForm_Country > option:nth-last-child(1) ---specific element from last
		// select#Form_getForm_Country > option:nth-last-child(3) ---3rd element from last
		
		// select#Form_getForm_Country > option:nth-child(odd) --- accessing odd/alternate number child out of 233
		// select#Form_getForm_Country > option:nth-child(even) ---accessing even number child out of 233
		// select#Form_getForm_Country > option:nth-child(n) ---accessing all elements
		
		// (//select[@id='Form_getForm_Country']/option)[position() mod 2 =0] ---even numbers elements from 233
		// (//select[@id='Form_getForm_Country']/option)[position() mod 2 =1] ---odd numbers elements from 233
		
		// comma in css: is used to verify/identify multiple elements in single csslocator
		// input#username,input#password,button#loginBtn,input#remember
		
		//Union of multiple elements with xpath: Use "|" symbol
		//footer//a | //footer//h5  ---Naveen opencart app ---this will fetch all the links in footer section
		//and with "|" or union operator fetch all the header information also
		
		//to get paragraph also along with header and links
		//footer//a | //footer//h5 | //footer//p
		
		//To get particular header and all the links under it
		//h5[text()='Information'] | //h5[text()='Information']/parent::div//a
		//h5[text()='Information']/following-sibling::ul//a ---to capture all the links under Information header
		
		// not operator in css: Used to exclude one or more element(s) from many elements returned from DOM on the basis of some csslocator
		// input.form-control:not(input[name='search'])
		// input.form-control:not(input[name='search']):not(input#input-firstname)
		
		//Using By.className locator we can use only one className only. If we try to use more than one classes 
		//in By.className like following example, we will get "InvalidSelectorException - compound class names not permitted.
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("test@gmail.com"); //---InvalidSelectorException
		//1. with className - only one class is allowed
		
		
		//driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");//this will work
		Thread.sleep(3000);
		//valid with xpath
	//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("test@gmail.com");
		
		//valid
		//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("test@gmail.com");
		
//		By loginFields = By.cssSelector("input#username,input#password,button#loginBtn,input#remember");
//		int fieldsCount = driver.findElements(loginFields).size();
//		System.out.println(fieldsCount);
//		if(fieldsCount == 4) {
//			System.out.println("imp elements on login page are available");
//		}
//		else {
//			System.out.println("imp elements on login page are NOT available");
//		}
		
		//driver.findElement(By.className(""))
		
		//Performance
		//1000 elements created : xpath ---xpath engine in browser
		//1000 elements created : css 
		// then which will perform better. There is no guarantee
		
		
		
		// 						xpath						vs 				css
		// 1. syntax			medium										easy		 	
		// 2. performance		slow										faster
		// 3. backward trav.	Yes											No
		// 4. sibling			Yes											following sibling
		// 5. text()			Yes											No
		// 6. ancestor			Yes											No
		// 7. indexing			Yes											Yes --better
		// 8. starts-with		Yes											Yes
		// 9. contains			Yes											Yes
		// 10. ends-with		No											Yes
		// 11. comma,union		Yes											Yes
		// 12. and				Yes											Yes
		// 13. or				Yes											No
		// 14. not				Yes											Yes
		// 15. svg element		Yes											No
		// 16. shadow DOM		no											Yes
		
		
		
	}

}
