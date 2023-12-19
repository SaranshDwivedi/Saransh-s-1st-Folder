package pageObjectModelPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{

	//to read excel data

	public String readExcelData(String excelPath , String sheetName , int rowCount , int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet(sheetName);

		Row row = sheet.getRow(rowCount);

		Cell cell = row.getCell(cellCount);

		String data = cell.getStringCellValue();

		return data;
	}


	//to write Excel data
	public void writeExcelData(String excelPath , String sheetName , int rowCount , int cellCount , String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);

		Workbook wb = WorkbookFactory.create(fis); //Encrypted Document Exception & IO Exception

		Sheet sheet = wb.getSheet(sheetName);

		Row row = sheet.getRow(rowCount);

		Cell cell = row.getCell(cellCount);

		cell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(excelPath);

		wb.write(fos);
	}


	//to generalize rowCount

	public int rowCount(String excelPath , String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet(sheetName);

		int rc = sheet.getLastRowNum();

		return rc;
	}


	//write excel data

	public void readExcelData(String excelPath , String sheetName , int rowCount , int cellCount , String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet(sheetName);

		Row row = sheet.getRow(rowCount);

		Cell cell = row.getCell(cellCount);

		cell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(excelPath);

		wb.write(fos);
	}


	//to generalize cellCount

	public int cellCount(String excelPath , String sheetName , int rowCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet(sheetName);

		Row row = sheet.getRow(rowCount);

		short cc = row.getLastCellNum();

		return cc;
	}

	public String readPropertyData(String propPath , String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);

		Properties prop = new Properties();

		prop.load(fis);		//IO Exception

		String data = prop.getProperty(key);

		return data;
	}
}

