package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MinimizeWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		driver.close();
	}

}
