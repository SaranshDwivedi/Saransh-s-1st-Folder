package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwiggWineFindElement {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
	    ChromeOptions co = new ChromeOptions();
	    
	    co.addArguments("--remote-allow-origins=*");
	    
	    driver = new ChromeDriver(co);
	    
	    driver.manage().window().maximize();
	    
	    driver.get("file:///C:/Users/saraa/OneDrive/Desktop/Selenium/HTML/TextField.html");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.tagName("input")).sendKeys("allowed");
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().to("https://www.swiggwine.com/login.html");
	    
	    driver.findElement(By.id("lemail")).sendKeys("Saransh");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("ipaw")).sendKeys("9039505369");
	    
	    driver.findElement(By.className("login_btn")).click();
	}
	    
	}
	