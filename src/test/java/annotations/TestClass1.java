package annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 extends BaseClass {

	@Test
	public void test1() {
		Reporter.log("Test1", true);
	}
}
