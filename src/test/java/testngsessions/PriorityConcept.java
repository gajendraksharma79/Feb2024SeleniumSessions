package testngsessions;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	@Test(priority = 1,description = "Search Test")
	public void searchTest() {
		System.out.println("search Test");
	}

	// 5
	@Test(priority = -3, description = "add to cart test")
	public void addToCartTest() {
		System.out.println("add to cart test");
	}

	// 8
	@Test(priority = -3)
	public void checkOutTest() {
		System.out.println("check out test");
	}

	@Test()
	public void paymentTest() {
		System.out.println("payment test");
	}

	// 8
	@Test(priority = -1)
	public void orderTest() {
		System.out.println("order test");
	}

}
