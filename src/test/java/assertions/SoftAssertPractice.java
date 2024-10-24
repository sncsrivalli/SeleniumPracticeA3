package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {

	@Test
	public void demo() {
		String s1 = "Hello";
		String s2 = "Hai";

		SoftAssert soft = new SoftAssert();
		soft.assertEquals(s1, s2);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 + " " + s2);
		
		soft.assertAll();
	}
}
