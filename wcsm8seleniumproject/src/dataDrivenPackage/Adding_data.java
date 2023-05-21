package dataDrivenPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Adding_data {

	public static void main(String[] args) throws  IOException, InterruptedException {

		Flib flib = new Flib();
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("IPL");
		
		//at what cell and row number we have to put data
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(2);
		
		//data to put in perticulas=r cell
		cell.setCellValue("BCCI");
		
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		
		wb.write(fos);
	}

}
