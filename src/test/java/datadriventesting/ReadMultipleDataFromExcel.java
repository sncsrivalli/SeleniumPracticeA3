package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		Map<String,String> map = new HashMap<String,String>();
		DataFormatter df = new DataFormatter();
		
		for(int i = 0; i <= sh.getLastRowNum();i++) {
			String key = df.formatCellValue(sh.getRow(i).getCell(0));
			String value = df.formatCellValue(sh.getRow(i).getCell(1));
			map.put(key, value);
		}
		
		System.out.println(map);
		
		wb.close();
	}

}
