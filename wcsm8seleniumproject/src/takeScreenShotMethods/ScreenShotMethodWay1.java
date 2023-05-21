package takeScreenShotMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;



public class ScreenShotMethodWay1 {

	public static void main(String[] args) throws IOException{
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications=*");

		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.youtube.com/watch?v=r0c1f6XxRQg");
		
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    
	    File dest = new File("./ScreenShots/ss1.png");
	    
	    Files.copy(src, dest);
	    

	}

}
