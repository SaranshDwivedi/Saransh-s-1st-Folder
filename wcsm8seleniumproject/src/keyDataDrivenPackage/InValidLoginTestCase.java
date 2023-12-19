package keyDataDrivenPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InValidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		BaseTest bt = new BaseTest();		//to launch and close browser
		
		bt.openBrowser();
		
		Flib fb = new Flib();
		
		int rc = fb.rowCount(EXCEL_PATH, "invalidCreds");
		

	}

}
