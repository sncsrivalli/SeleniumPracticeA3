package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriScript {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("");
		driver.findElement(By.xpath("//input[contains(@placeholder,'password')]")).sendKeys("");
		driver.findElement(By.cssSelector("button.loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'profile')]")).click();
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//div[contains(@class,'crossIcon')]")).click();
		WebElement update = driver.findElement(By.xpath("//input[contains(@class,'fileUpload') and @id='attachCV']"));
		
		Actions a = new Actions(driver);
		a.click(update).perform();
		
		StringSelection str = new StringSelection("C:\\Users\\TRACK QJSPIDERS\\Downloads\\Framework User Guide.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		Thread.sleep(4000);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(6000);
		driver.close();
	}

}
