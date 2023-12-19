package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//read data from IPL sheet . . .
		//to read all data from team row 
		//implementation of read the data from excel
		for(int i = 1; i<=10 ; i++)
		{
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");	//
		
		Workbook wb = WorkbookFactory.create(fis);						//create method of input stream
																		//we are making file for ready to read
																		//create = static method
		
		Sheet sheet = wb.getSheet("IPL");		//get into the sheet		//Row = Interface
		
		Row row = sheet.getRow(i);			//get into the desired row
		
		Cell cell = row.getCell(0);			//get into desired cell
		
		String data = cell.getStringCellValue();
		
		Thread.sleep(300);
		
		System.out.println(data);
		}
	}

}
