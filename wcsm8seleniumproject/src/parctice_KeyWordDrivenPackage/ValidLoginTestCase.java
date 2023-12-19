package parctice_KeyWordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();		//to open the Browser and Close Browser

		Flib fb = new Flib();				//to read Valid Data from the Property file

		bt.openBrowser();

		driver.findElement(By.name("username")).sendKeys(Flib.readPropertyData(PROP_PATH,"username"));

		driver.findElement(By.name("pwd")).sendKeys(Flib.readPropertyData(PROP_PATH,"password"));

		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(1200);

		bt.closeBrowser();
	}
}