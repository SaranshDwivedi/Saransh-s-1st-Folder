package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.asm.Advice.Enter;

public class RedBusXpath {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		co.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.redbus.in/");
	
		driver.findElement(By.xpath("//input[@id='src' and (@class='db')]")).click();
		
		driver.findElement(By.xpath("//input[@id='src' and (@class='db')]")).sendKeys("Wakad, Pune",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='dest' and (@class='db')]")).click();
		//input[@id='dest' and (@class='db')]
		driver.findElement(By.xpath("//input[@id='dest' and (@class='db')]")).sendKeys("Mumbai Central, Mumbai",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='src']")).click();
		
		//input[@id='src']
		//driver.findElement(By.xpath("//label[@class='db text-trans-uc move-up']")).click();
		//li[@class='selected']
        Thread.sleep(2000);

		driver.findElement(By.xpath("//td[@class='current day']")).click();
		//td[@class='current day']
		//driver.findElement(By.xpath("//li[@data-id='66571' and (@class='selected')]")).click();
		//li[@data-id='66571' and (@class='selected')]
		
		driver.findElement(By.xpath("//input[@id='onward_cal' and (@class='db')]")).click();
		//input[@id='onward_cal' and (@class='db')]
		//search
		Thread.sleep(2000);
		
        Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='search_btn' and (@class='fl button')]")).click();
		//button[@id='search_btn' and (@class='fl button')]
	}
}
