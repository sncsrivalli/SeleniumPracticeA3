package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderPracticeTest {

	@Test(dataProvider = "credentials")
	public void loginTest(String user, String pwd) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	@DataProvider
	public Object[][] credentials(){
		Object[][] obj = new Object[3][2];
		
		obj[0][0] = "9876543210";
		obj[0][1] = "0123456789";
		
		obj[1][0] = "8765432109";
		obj[1][1] = "1234567890";
		
		obj[2][0] = "7654321098";
		obj[2][1] = "2345678901";
		
		return obj;
	}
}
