package listenerPractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 extends BaseClass {

	@Test
	public void testScript() {
		Reporter.log("@Test 1", true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "testScript")
	public void testScript2() {
		Reporter.log("@Test 1 - testScript2", true);
	}
}
