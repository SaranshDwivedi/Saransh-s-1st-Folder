package parctice_KeyWordDrivenPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	//to read excel data
	public String readexcelData(String excelData , String sheetName , int rowCount , int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelData);	//IO Exception

		Workbook wb = WorkbookFactory.create(fis);  //Encrypted Document Exception

		Sheet sheet = wb.getSheet(sheetName);

		Row row = sheet.getRow(rowCount);

		Cell cell = row.getCell(cellCount);

		String data = cell.getStringCellValue();

		return data;
	}

	//to generalize rowcount
	public int rowCount(String excelData , String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelData); // File Not Found Exception

		Workbook wb = WorkbookFactory.create(fis); 	//Encrypted Document Exception & IO Exception

		Sheet sheet = wb.getSheet(sheetName);

		int rc = sheet.getLastRowNum();

		return rc;
	}

	//to generalize cellCount
	public int cellCount(String excelData , String sheetName , int rowCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelData); 	//File Not Found Exception

		Workbook wb = WorkbookFactory.create(fis); 	//Encription Document & IO Exception

		Sheet sheet = wb.getSheet(sheetName);

		Row row = sheet.getRow(rowCount);

		short cc = row.getLastCellNum();

		return cc;
	}
	
	public static String readPropertyData(String propPath , String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String data = prop.getProperty(key);
		
		return data;
	}
}
