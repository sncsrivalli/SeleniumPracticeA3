package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestUsingProperties {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(readData("url"));
		
		long time = Long.parseLong(readData("timeouts"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.findElement(By.id("email")).sendKeys(readData("username"));
		driver.findElement(By.id("password")).sendKeys(readData("password"));
		driver.findElement(By.name("login")).click();
		
		WebElement home = driver.findElement(By.xpath("//a[text()=' Home']"));
		if(home.isDisplayed())
			System.out.println("Test pass");
		else
			System.out.println("Test fail");
		
		driver.quit();
	}
	
	public static String readData(String key) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src/test/resources/data.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String data = property.getProperty(key);
		return data;
	}

}
