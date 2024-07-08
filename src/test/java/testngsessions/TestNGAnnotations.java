package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	// global pre-conditions
	// pre-conditions
	// test steps + expected vs actual results
	// after steps
	// global after steps

	// 1
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS -- connect with DB");
	}

	// 2
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- create user");
	}

	// 3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launch browser");
	}

	// 4 //7 //10
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM -- loginToApp");
	}

	// 11
	@Test
	public void searchTest() {
		System.out.println("search Test");
	}

	// 5
	@Test
	public void addToCartTest() {
		System.out.println("add to cart test");
	}

	// 8
	@Test
	public void checkOutTest() {
		System.out.println("check out test");
	}

	// 6 //9 //12
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}

	// 13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- close browser");
	}

	// 14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- delete user");
	}

	// 15
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS -- disconnect with DB");
	}

}
