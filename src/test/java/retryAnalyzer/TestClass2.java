package retryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {

	@Test(retryAnalyzer = retryAnalyzer.RetryImplementation.class)
	public void demo() {
		System.out.println("TestClass2 - demo");
		Assert.fail();
	}
}
