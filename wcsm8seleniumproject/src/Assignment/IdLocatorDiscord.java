package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdLocatorDiscord {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/saraa/OneDrive/Desktop/Selenium/HTML/TextField.html");
		
		driver.findElement(By.tagName("input")).sendKeys("Authorization Complete");
		Thread.sleep(2000);
		driver.navigate().to("https://discord.com/login");
		
		driver.findElement(By.id("uid_5")).sendKeys("sarannshdwivedi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("uid_7")).sendKeys("9039505369");
		
	}

}
