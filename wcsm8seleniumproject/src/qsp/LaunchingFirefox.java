package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefox {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.close();

	}

}
