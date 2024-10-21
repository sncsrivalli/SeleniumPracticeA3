package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		AmazonPage amazon = new AmazonPage(driver);
		
		if(amazon.getLogo().isDisplayed())
			System.out.println("Amazon Page Displayed");
		else
			System.out.println("Amazon Page Not Found");
		
		amazon.setSearchTF("teddy bear");
		amazon.clickSearchButton();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
