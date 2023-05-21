package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwiggWineXPath1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.swiggwine.com/login.html");
		
		driver.findElement(By.name("email_new")).sendKeys("abc123@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("pass_new")).sendKeys("123456789");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='login_btn']")).click();
	}

}
