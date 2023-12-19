package Wcsa5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String excelData , String sheetName , int rowCount , int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelData);

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet(sheetName);

		Row row = sheet.getRow(rowCount);

		Cell cell = row.getCell(cellCount);

		String data = cell.getStringCellValue();

		return data;
	}

	public int rowCount(String excelData , String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelData);

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet(sheetName);

		int rc = sheet.getLastRowNum();

		return rc;
	}

	public short cellCount(String excelData , String sheetName , int countRow) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelData);

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet(sheetName);

		Row row = sheet.getRow(countRow);

		short cc = row.getLastCellNum();

		return cc;
	}

	public void readExcelProperties(String readExcelData) throws IOException
	{
		FileInputStream fis = new FileInputStream(readExcelData);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		prop.Property(key);
	}
}
