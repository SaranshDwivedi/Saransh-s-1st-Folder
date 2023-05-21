package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowser {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Desired Browser");

		String browserValue = sc.next();

		if (browserValue.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");  
			
			//commented out because it was giving IllegleStateException

			ChromeOptions co = new ChromeOptions();

			co.addArguments("--remote-allow-origins=*");

			driver = new ChromeDriver(co);

			driver.manage().window().maximize();

			Thread.sleep(2000);

			driver.close();

		}

		else if (browserValue.equalsIgnoreCase("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			
			//commented out because it was giving IllegleStateException

			driver = new FirefoxDriver();

			driver.manage().window().maximize();

			Thread.sleep(3000);

			driver.close();

		}

		else if (browserValue.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");

			driver = new EdgeDriver();

			driver.manage().window().maximize();

			Thread.sleep(2000);

			driver.close();
		}

		else {
			System.out.println("Enter A Existing Browser! You IDIOT!!!");
		}
	}
}
