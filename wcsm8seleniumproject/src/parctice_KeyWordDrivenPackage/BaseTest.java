package parctice_KeyWordDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest extends Flib implements IAutoConstant{

	static WebDriver driver;
	
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		
		String browservalue = flib.readPropertyData(EDGE_KEY,"edge");
		
		String url = flib.readPropertyData(EDGE_KEY, "url");
		
		if(browservalue.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			
			ChromeOptions co = new ChromeOptions();
			
			driver = new ChromeDriver(co);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get(url);
		}
		
		else if(browservalue.equals("firefox")) 
		{
			System.setProperty(FIREFOX_KEY, FIREFOX_PATH);
			
			FirefoxOptions fo = new FirefoxOptions();
			
			driver = new FirefoxDriver(fo);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get(url);
		}
		
		else if(browservalue.equals("edge"))
		{
			System.setProperty(EDGE_KEY, EDGE_PATH);
			
			EdgeOptions eo = new EdgeOptions();
			
			driver = new EdgeDriver(eo);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get(url);
		}
		
		else
		{
			System.out.println("Enter a Valid Browser Name");
		}
		
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
}
