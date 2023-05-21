package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssLocatorSwiggWine {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.swiggwine.com/login.html");
		
		driver.findElement(By.name("email_new")).sendKeys("abc123@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("pass_new")).sendKeys("123456789");
		
		Thread.sleep(2000);
		
		//{COMPLETE cssSelecter path}
		//driver.findElement(By.cssSelector("input[class='login_btn']")).click();
		
		//first character css path by ^
		//driver.findElement(By.cssSelector("input[class^='l']")).click();
		
		//in between/middle charater by *
		//driver.findElement(By.cssSelector("input[class*='lo']")).click();
		
		//last charters by $
		driver.findElement(By.cssSelector("input[class$='n']")).click();
	}

}
