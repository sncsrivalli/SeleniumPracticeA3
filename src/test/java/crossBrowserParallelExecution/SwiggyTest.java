package crossBrowserParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SwiggyTest extends BaseClass {

	@Test
	public void swiggyTest() {
		driver.get("https://www.swiggy.com/");
		WebElement swiggyImage = driver.findElement(By.xpath("//*[name()='svg'][@class='_8pSp-']"));
		if(swiggyImage.isDisplayed())
			System.out.println("Test pass");
		else
			System.out.println("Test failed");
	}
}
