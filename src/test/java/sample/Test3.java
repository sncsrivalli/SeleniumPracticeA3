package sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		//System.setProperty("webdriver.chrome.driver",
		//						"./src/main/resources/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/google_chrome.png");
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
