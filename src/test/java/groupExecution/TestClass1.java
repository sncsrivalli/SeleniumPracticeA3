package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {

	@Test(groups = "Smoke")
	public void test1() {
		Reporter.log("TestClass1 - test1 - Smoke", true);
	}
	
	@Test(groups = "Sanity")
	public void test2() {
		Reporter.log("TestClass1 - test2 - Sanity", true);
	}
	
	@Test(groups = {"Sanity", "Smoke"})
	public void test3() {
		Reporter.log("TestClass1 - test3 - Sanity and Smoke", true);
	}
}
