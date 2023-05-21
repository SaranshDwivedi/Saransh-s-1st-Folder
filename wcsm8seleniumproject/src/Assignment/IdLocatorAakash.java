package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdLocatorAakash {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 ChromeOptions co = new ChromeOptions();
		 
		 co.addArguments("--remote-allow-origins=*");
		 
		 driver = new ChromeDriver(co);
		 
		 driver.manage().window().maximize();
		 
		 driver.get("file:///C:/Users/saraa/OneDrive/Desktop/Selenium/HTML/TextField.html");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.tagName("input")).sendKeys("Authorization Complete");
		 
		 Thread.sleep(2000);
	
		 driver.navigate().to("https://www.aakash.ac.in/lms/login/");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("psid_or_mobile")).sendKeys("9039505369");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("password")).sendKeys("Saransh Dwivedi");
		 
		 driver.findElement(By.className("bg-primary text-white text-[14px] rounded font-bold hover:opacity-90 text-center w-full h-[45px] mb-6")).click();
		 
	}

}
