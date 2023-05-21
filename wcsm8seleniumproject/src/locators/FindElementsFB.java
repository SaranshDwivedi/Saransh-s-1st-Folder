package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsFB {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		 ChromeOptions co = new ChromeOptions();
		  
		 co.addArguments("--remote-allow-origins=*");
		 
		 driver = new ChromeDriver(co);
		 
		 driver.manage().window().maximize();
		 
		 driver.get("file:///C:/Users/saraa/OneDrive/Desktop/Selenium/HTML/TextField.html");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.tagName("input")).sendKeys("admin");
		 
		 //----------------------------------------------------
		 
		 driver.navigate().to("https://www.facebook.com/login.php");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("email")).sendKeys("username");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("pass")).sendKeys("password");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("loginbutton")).click();
		 
		 
		 
	}

}
