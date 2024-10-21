package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		// Step 1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		
		// Step 2: Create an instance for Properties class
		Properties property = new Properties();
		
		// Step 3: Load all key-value pairs from fis to property
		property.load(fis);// throws IOException
		
		// Step 4: Fetch data using key
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("timeouts"));

	}

}
