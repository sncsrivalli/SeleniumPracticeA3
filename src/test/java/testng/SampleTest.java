package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void demo() {
		Reporter.log("Hello World!", true);
		//Assert.fail();
	}
}
