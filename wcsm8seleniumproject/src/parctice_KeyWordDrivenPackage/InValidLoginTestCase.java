package parctice_KeyWordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class InValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();		//to open and close browser

		Flib fb = new Flib();		//to get the properties from Property file

		bt.openBrowser();

		int rc = fb.rowCount(EXCEL_PATH, "invalidcreds");

		for(int i = 0; i < rc ; i++)
		{
			String usn = fb.readexcelData(EXCEL_PATH, "invliadCreds", i, 0);

			String psd = fb.readexcelData(EXCEL_PATH, "invalidCreds", i, 1);

			driver.findElement(By.name("username")).sendKeys(usn);

			driver.findElement(By.name("pwd")).sendKeys(psd);

			Thread.sleep(1200);

			driver.findElement(By.name("username")).clear();
		}

		Thread.sleep(2000);

		bt.closeBrowser();
	}
}
