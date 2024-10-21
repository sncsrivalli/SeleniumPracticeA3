package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {

	@Test(groups = "Smoke")
	public void test1() {
		Reporter.log("TestClass2 - test1 - Smoke", true);
	}
	
	@Test(groups = "Regression")
	public void test2() {
		Reporter.log("TestClass2 - test2 - Regression", true);
	}
	
	@Test(groups = {"Regression", "Smoke"})
	public void test3() {
		Reporter.log("TestClass2 - test3 - Regression and Smoke", true);
	}
}
