package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShoppersStack {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//to handle Illegle State Exception
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");)

		//to hamdle file not found exception
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
		//upcasting from chromedriver interface to webdriver interface to access all 13 non static mathods  
		WebDriver driver = new ChromeDriver(co);

		//to maximize the window of chrome
		driver.manage().window().maximize();
		
		//
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//to launch ShoppersStack site
		driver.navigate().to("https://www.shoppersstack.com/products_page/43");

		//for delivery element box
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("485001");
		
		Thread.sleep(5000);
		//for check button
		driver.findElement(By.xpath("//button[@id='Check']")).click();
	}

}
