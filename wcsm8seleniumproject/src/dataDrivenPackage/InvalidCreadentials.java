package dataDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class InvalidCreadentials {

	public static void main(String[] args) throws  IOException {

		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");

		EdgeOptions co = new EdgeOptions();

		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new EdgeDriver(co);

		driver.manage().window().maximize();

		driver.navigate().to("http://127.0.0.1/login.do");
		
		//to get data from sheet . . . create object of Flib
		
		Flib flib = new Flib();
		
		int rc = flib.rowCount(null, null);
		
		for(int i = 1; i >= rc; i++)
		{
			String username = flib.readExcelData(null, null, i, 0);
			
			String password = flib.readExcelData(null, null, i, 1);
			
			driver.findElement(By.name("username")).sendKeys(username);
			
			driver.findElement(By.name("pwd")).sendKeys(password);
			
			driver.findElement(By.id("loginButton")).click();
			
			driver.findElement(By.name("pwd")).clear();
			
		}
	}
}

