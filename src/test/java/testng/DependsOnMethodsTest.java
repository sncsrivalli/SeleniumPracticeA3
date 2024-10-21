package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOnMethodsTest {

	@Test
	public void navigateToLoginPage() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		WebElement pageHeader = driver.findElement(By.xpath("//h3[text()='Login']"));
		if(pageHeader.getText().equals("Login"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		//Assert.fail();
		driver.quit();
	}
	
	@Test(dependsOnMethods = "navigateToLoginPage")
	public void loginToApp() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("email")).sendKeys("admin"+Keys.TAB
														+"admin"+Keys.ENTER);
		driver.quit();
	}
}
