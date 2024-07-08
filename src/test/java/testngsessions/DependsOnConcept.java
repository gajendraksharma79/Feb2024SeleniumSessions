package testngsessions;

import org.testng.annotations.Test;

import seleniumsessions.LoginTest;

public class DependsOnConcept {
	
	@Test()
	public void loginTest() {
		System.out.println("login test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void addToCartTest() {
		System.out.println("addToCart test");
	}
	
	@Test(dependsOnMethods = "addToCartTest")
	public void orderTest() {
		System.out.println("order test");
	}
	
	//AAA : Arrange, Act, Assert

}