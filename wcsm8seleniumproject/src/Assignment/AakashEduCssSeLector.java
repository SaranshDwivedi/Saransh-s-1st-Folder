package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AakashEduCssSeLector {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.aakash.ac.in/lms/login/");
		
		driver.findElement(By.id("psid_or_mobile")).sendKeys("1234567890");
		
		driver.findElement(By.id("password")).sendKeys("asd123");
		
		driver.findElement(By.cssSelector("button[class*=']']")).click();
	}
}
