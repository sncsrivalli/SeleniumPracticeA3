package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestUsingExcel {

	public static void main(String[] args) {
		Map<String, String> map = read();
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(map.get("url"));
		
		long time = Long.parseLong(map.get("timeouts"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

		driver.findElement(By.id("email")).sendKeys(map.get("username"));
		driver.findElement(By.id("password")).sendKeys(map.get("password"));
		driver.findElement(By.name("login")).click();

		WebElement home = driver.findElement(By.xpath("//a[text()=' Home']"));
		if (home.isDisplayed())
			System.out.println("test pass");
		else
			System.out.println("test fail");

		driver.quit();
	}

	public static Map<String, String> read() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}

		DataFormatter df = new DataFormatter();
		Sheet sh = wb.getSheet("Sheet1");
		Map<String, String> map = new HashMap<String, String>();

		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			String key = df.formatCellValue(sh.getRow(i).getCell(0));
			String value = df.formatCellValue(sh.getRow(i).getCell(1));
			map.put(key, value);
		}
		
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return map;
	}

}
