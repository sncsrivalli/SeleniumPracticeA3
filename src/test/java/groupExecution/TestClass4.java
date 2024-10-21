package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass4 {

	@Test
	public void test1() {
		Reporter.log("TestClass4 - test1", true);
	}
	
	@Test(groups = {"Regression", "Sanity", "Smoke"})
	public void test2() {
		Reporter.log("TestClass4 - test2 - Smoke, Regression and Sanity", true);
	}
}
