package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	// Xpath: Address of the element in the html DOM
	// 1. absolute Xpath
	// 2. Relative or Custom Xpath.

	// formula
	// xpath axes: relationship: parent, child, siblings
	// functions: text(),starts-with(), contains() etc.

	// formula designing
	// //htmltag[@attr='value']
	// //input[@id='input-email']
	// //input[@name='email']
	// //input[@placeholder='E-Mail Address']
	// input --6 elements --FindElements

	// input[@id] -- 2 elements --- it means give me those input elements which have
	// id's
	// input[@placeholder] --- it means give me those input elements which have
	// placeholder's

	// Using 2 or more attributes with same xpath
	// htmltag[@attr1='value' and @attr2='value' and @attr3='value']
	// input[@name='firstname' and @type='text' and @id='input-firstname']
	// input[@name and @type='text' and @id='input-firstname'] --
	// input[@name and @type and @id] --- multiple elements returned

	// xpath using or operator --- which means return elements having either of
	// supplied attribute
	// htmltag[@attr1='value' or @attr2='value']
	// input[@type='text' or @name='search']
	// input[@type='text' or @name='search' or @type='email']

	// using '*' instead of htmltag
	// *[@attr='value']
	// *[@type='text'] --- 100:3 elems --- it means out of all the elements in the
	// DOM give me those
	// elements which have type = 'text'. It is not good in terms of performance
	// input[@type='text'] ---14:3 elems --- better performance

	// using text() function

	// htmltag[text()='value']
	// h1[text()='Register Account']
	// legend[text()='Your Personal Details']
	// a[text()='Forgotten Password']

	// using contains() function
	// 1. contains with attribute
	// htmltag[contains(@attr,'value')]
	// input[contains(@name,'email')]
	// input[contains(@id,'email')] ---full @id attribute value = 'input-email'
	// input[contains(@placeholder,'E-Mail')]

	// 2. contains in addition of other attribute
	// htmltag[contains(@attr1,'value') and @attr2='value']
	// input[contains(@placeholder,'E-Mail') and @name='email']
	// input[contains(@id='email')] --- Wrong xpath because with function we always
	// use "," and not "="

	// 3. both attr with contains()
	// htmltag[contains(@attr1,'value') and contains(@attr2,'value')]
	// input[contains(@placeholder,'E-Mail') and contains(@name,'email')]
	// input[contains(@placeholder,'E-Mail') and contains(@id,'email')]

	// Use case for contains --- suppose we have some attribute which is changing
	// everytime we are hitting html DOM
	// dynamic elements with dynamic attributes
	// e.g <input id=firstname_12345/>
	// <input id=firstname_76893/>
	// <input id=firstname_88765/>
	// By.id("firstname_12345") --- it will not work
	// By.xpath("//input[contains(@id,'firstname_')] will work

	// contains() with text()
	// htmltag[contains(text(),'value')]
	// p[contains(text(),'By creating')]
	// h2[contains(text(),'New')]
	// h2[contains(text(),'Customer')]
	// a[contains(text(),'Conditions')]
	// a[contains(text(),'Address') and @class='list-group-item']

	// starts-with() function
	// htmltag[starts-with(@attr,'value']
	// input[starts-with(@id, 'input')]
	// input[starts-with(@placeholder, 'E-Mail')]
	// input[starts-with(@placeholder, 'E-Mail') and contains(@id,'email')]

	// start-with() with text()
	// htmltag[starts-with(text(),'value')]
	// a[starts-with(text(), 'Wish')]
	// p[starts-with(text(), 'By creating an account ')]

	// ends-with() function --- NOT AVAILABLE WITH LATEST VERSION OF XPATH
	
	
	// indexing in xpath: we have to use capture group using parenthesis (<xpath>) and then apply indexing using [<index>]
	//a[text()='Forgotten Password'][2] --- Wrong Indexing and will not work
	// (//a[text()='Forgotten Password'])[2] --- it will work after grouping using brackets
	// (//a[text()='Forgotten Password'])[1]
	// By.xpath("(//a[text()='Forgotten Password'])[2]");
	// (//input[@id])[6]
	
	// position()
	// (//input[@id])[position()=1] --- both are same
	// (//input[@id])[1] ---same
	
	
	// last() ---to interact or get th last element from the capture group
	// (//input[@id])[6] ---there are total 6 elements in the group
	// (//input[@id])[last()] --- it will point to the last element in the group
	// (//input[@id])[last()]
	// (//input[@id])[last()-1] --- point to second last
	// (//input[@id])[last()-2] ---3rd last
	// (//input[@id])[last()-3] ---4th last and so on
	// (//input[@id])[last()-last()+1] --- Point to the first element
	
	// ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
	
	//text with space
	//label[normalize-space()='Yes']
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		// driver.get("https://classic.freecrm.com/register/");
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

	}

}
