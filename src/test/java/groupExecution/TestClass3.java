package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass3 {

	@Test(groups = "Sanity")
	public void test1() {
		Reporter.log("TestClass3 - test1 - Sanity", true);
	}
	
	@Test(groups = "Regression")
	public void test2() {
		Reporter.log("TestClass3 - test2 - Regression", true);
	}
	
	@Test(groups = {"Regression", "Sanity"})
	public void test3() {
		Reporter.log("TestClass3 - test3 - Regression and Sanity", true);
	}
}
