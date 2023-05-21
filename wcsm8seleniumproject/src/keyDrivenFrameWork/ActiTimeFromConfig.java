package keyDrivenFrameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import dataDrivenPackage.Flib;

public class ActiTimeFromConfig extends Flib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
		Flib flib = new Flib();
	
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");

		EdgeOptions co = new EdgeOptions();

		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new EdgeDriver(co);

		driver.manage().window().maximize();

		driver.navigate().to("http://127.0.0.1/login.do");

		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/TestData.xlsx","InvalidCreds", 1, 1));
		
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/TestData.xlsx","InvalidCreds", 1, 2));

		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
