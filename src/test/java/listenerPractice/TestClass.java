package listenerPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

//@Listeners(listenerPractice.ListenerImplementation.class)
public class TestClass extends BaseClass {

	@Test
	public void testScript() {
		Reporter.log("@Test 0", true);
	}
}
