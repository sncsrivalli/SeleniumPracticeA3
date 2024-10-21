package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MinimizePractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.uber.com/in/en/");
		Thread.sleep(4000);
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		driver.quit();
	}

}
