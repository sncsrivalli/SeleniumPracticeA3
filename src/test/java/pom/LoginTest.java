package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPage login = new LoginPage(driver);
		
		if(login.getPageHeader().equals("Login"))
			System.out.println("Login page displayed");
		else
			System.out.println("Login page not found");
		
		login.setUsername("admin");
		login.setPassword("admin");
		login.clickKeepMeLoggedInCB();
		login.clickLoginButton();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
