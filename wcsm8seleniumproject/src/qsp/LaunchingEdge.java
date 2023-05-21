package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingEdge {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
