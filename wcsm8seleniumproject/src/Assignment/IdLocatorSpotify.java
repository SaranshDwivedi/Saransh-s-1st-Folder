package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdLocatorSpotify {
	
	static WebDriver driver;
  
	public static void main(String[] args) throws InterruptedException {
		
	    ChromeOptions co = new ChromeOptions();
	    
	    co.addArguments("--remote-allow-origins=*");
	    
	    driver = new ChromeDriver(co);
	    
	    driver.manage().window().maximize();
	    
	    driver.get("file:///C:/Users/saraa/OneDrive/Desktop/Selenium/HTML/TextField.html");
	    
	    driver.findElement(By.tagName("input")).sendKeys("Authorization Complete");
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().to("https://accounts.spotify.com/en/login");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("login-username")).sendKeys("Saransh");
	    Thread.sleep(2000);
	    driver.findElement(By.id("login-password")).sendKeys("9039505369");
	    
	    driver.findElement(By.className("Type__TypeElement-sc-goli3j-0 kwLSIj sc-eDvSVe itlAHd")).click();	    
	    
	    
	}

}
