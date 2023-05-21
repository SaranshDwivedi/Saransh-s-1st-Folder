package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagNameLocator {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	    ChromeOptions co = new ChromeOptions();
		
	    co.addArguments("--remote-allow-origins=*");
	    
	    driver = new ChromeDriver(co);
	    
	    driver.manage().window().maximize();
	    
	    driver.get("file:///C:/Users/saraa/OneDrive/Desktop/Selenium/HTML/TextField.html");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.tagName("input")).sendKeys("admin");
	    
	    //-----------------------------------------
	    
	    driver.navigate().to("https://www.instagram.com/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.tagName("input")).sendKeys("admin");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.tagName("input")).sendKeys("manager");
	}

}
