package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		Properties p = new Properties();
		p.load(fis);
		
		p.put("user2", "user");
		p.put("pwd2", "user");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/data.properties");
		p.store(fos, "Updated successfully");

	}

}
