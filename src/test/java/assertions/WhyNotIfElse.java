package assertions;

import org.testng.annotations.Test;

public class WhyNotIfElse {

	@Test
	public void demo() {
		String s1 = "Hello";
		String s2 = "Hai";
		
		if(s1.equals(s2))
			System.out.println("Test pass");
		else
			System.out.println("test fail");
	}
}
