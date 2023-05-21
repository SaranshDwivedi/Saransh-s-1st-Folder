package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdLocatorCoursera {
	
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
		 
		driver.navigate().to("https://www.coursera.org/login");
		
		driver.findElement(By.id("email")).sendKeys("sarannshdwivedi@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("9039505369");
		Thread.sleep(2000);
		
		driver.findElement(By.className("6dgzsvq css-1af0gyj")).click();
	}

}
