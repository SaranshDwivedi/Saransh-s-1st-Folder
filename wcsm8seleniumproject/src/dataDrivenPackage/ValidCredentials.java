package dataDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ValidCredentials {

	public static void main(String[] args) throws  IOException, InterruptedException {

		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");

		EdgeOptions co = new EdgeOptions();

		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new EdgeDriver(co);

		driver.manage().window().maximize();

		driver.navigate().to("http://127.0.0.1/login.do");
		
		Flib flib = new Flib();
		
		int rc = flib.rowCount(null, null);
		
		for(int i = 1; i<=rc ; i++)
		{
			String un = flib.readExcelData(null, null, i, 0);
			String ps = flib.readExcelData(null, null, i, 1);
			
			driver.findElement(By.name("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(ps);
			driver.findElement(By.id("loginButton")).click();
			
			Thread.sleep(3000);
			
			driver.quit();
		}
			
}
}