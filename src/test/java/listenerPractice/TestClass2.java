package listenerPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 extends BaseClass {

	@Test
	public void testScript() {
		Reporter.log("@Test 2", true);
	}
}
