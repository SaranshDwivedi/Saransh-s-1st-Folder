package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteXPath {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
              ChromeOptions co = new ChromeOptions();
              
             co.addArguments("--remote-allow-origins=*");
             
             driver = new ChromeDriver(co);
             
             driver.manage().window().maximize();
             
             driver.get("https://kite.zerodha.com/");
             
             driver.findElement(By.id("userid")).sendKeys("saransh11");
             
             driver.findElement(By.id("password")).sendKeys("123456789");
             
             driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	}
}
