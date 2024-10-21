package crossBrowserParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends BaseClass {

	@Test
	public void googleTest() {
		driver.get("https://www.google.com/");
		WebElement googleImage = driver.findElement(By.xpath("//img[@alt='Google']"));
		if(googleImage.isDisplayed())
			System.out.println("Test pass");
		else
			System.out.println("Test failed");
	}
}
