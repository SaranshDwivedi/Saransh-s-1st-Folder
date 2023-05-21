package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		
		//to avoid Illegal state exception
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedrivers.exe" );
		
		//to avoid Path not found exception
		ChromeOptions co = new ChromeOptions(); 

		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications=*");
		
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/saraa/OneDrive/Desktop/Selenium/HTML/RadioButton.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("n4")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
//java.net.SocketException
//handleException