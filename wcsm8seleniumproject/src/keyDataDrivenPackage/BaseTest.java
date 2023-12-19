package keyDataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest extends Flib implements IAutoConstant
{
	static WebDriver driver;
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		 Flib fb = new Flib();
		 
		String browserValue = fb.readPropData(PROP_PATH, "browser");
		
		String url = fb.readPropData(PROP_PATH, "url");
		
		if(browserValue.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			
			ChromeOptions co = new ChromeOptions();
			
			co.addArguments("--remote-allow-origins=*");
			
			driver = new ChromeDriver(co);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get(url);
		}
		
		else if(browserValue.equals("firefox"))
		{
			System.setProperty(FIREFOX_KEY, FIREFOX_PATH);
			
			FirefoxOptions co = new FirefoxOptions();
			
			co.addArguments("--remote-allow-origins=*");
			
			driver = new FirefoxDriver(co);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get(url);
		}
		
		else if(browserValue.equals("edge"))
		{
			System.setProperty(EDGE_KEY, EDGE_PATH);
			
			EdgeOptions co = new EdgeOptions();
			
			co.addArguments("--remote-allow-origins=*");
			
			driver = new EdgeDriver(co);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get(url);
		}
		
		else
		{
			System.out.println("Please!!! Enter a Valid Browser Name");
		}
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
}
