package seleniumsessions;

public class XpathAxes {

	public static void main(String[] args) {
		
		//parent to child
		//direct child: use single "/"
		//direct+indirect child: user double "//"
		//div[@id='content']//form//input
		
		//div[@id='content']/div : 1 direct div
		
		//div[@id='content']//div : 7 divs which will provide direct+indirect divs under 'content' div
		
		//select[@name='Country']/option ---233 options
		//select[@name='Country']//option ---233 options
		
		// (//div[@class='form-group']/input)[1]
		
		// (//div[@class='form-group']/input)[2]
		
		// (//div[@class='form-group'])[2]/a
		
		
		//child to parent
		// 2 options
		// //input[@id='input-email']/.. -- using forward slash with 2 dots will traverse to the immediate parent
		//input[@id='input-email']/../../../../../../../../../..
		
		//2 option by using 'parent::<element tag of parent>
		//input[@id='input-email']/parent::div --- it will work for immediate parent only
		//option[@value='Albania']/parent::select/parent::div/parent::div
		//option[@value='Albania']/parent::select/
		
		//child to grandparent : use ancestor::<grandparent tagname> --it will give you direct parent 
		//and all the indirect grandparents
		//input[@id='input-email']/ancestor::form -- all the grandparents with form tag
		//input[@id='input-email']/ancestor::div -- all the grandparents with div tag
		
		//accessing siblings
		//preceding-sibling ---if you want to access sibling in backward direction/left sibling in case of webtable
		//following-sibling ---if yu want access sibling in forward direction/right sibling for table.
		
		//a[text()='John.Smith']/parent::td/preceding-sibling::td/input
		//a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		//by traversing to grandparent and then accessing the child
		//a[text()='John.Smith']/ancestor::tr//input[@type='checkbox']
		
		//following-sibling
		//a[text()='John.Smith']/parent::td/following-sibling::td ---all the sibiling td's ---3 in this case.
		
		//input[@id='input-email']/preceding::input ---all the input before email
		//input[@id='input-email']/following::input --all the input after email
		
		
		

	}

}
