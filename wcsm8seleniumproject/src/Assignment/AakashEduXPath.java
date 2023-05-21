package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AakashEduXPath {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.aakash.ac.in/lms/login/");
		
		driver.findElement(By.name("psid_or_mobile")).sendKeys("1234567890");
		
		driver.findElement(By.id("password")).sendKeys("123456");
		
		driver.findElement(By.xpath("//button[@class='bg-primary text-white text-[14px] rounded font-bold hover:opacity-90 text-center w-full h-[45px] mb-6']")).click();
		
	}
}
