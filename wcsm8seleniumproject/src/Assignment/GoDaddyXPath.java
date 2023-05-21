package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoDaddyXPath {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
              ChromeOptions co = new ChromeOptions();
              
             co.addArguments("--remote-allow-origins=*");
             
             driver = new ChromeDriver(co);
             
             driver.manage().window().maximize();
             
             driver.get("https://sso.godaddy.com/?realm=idp&path=%2Fproducts%3Fgo_redirect%3Ddisabled&app=account&auth_reason=1");
             
             driver.findElement(By.id("username")).sendKeys("asd@gmail.com");
             
             driver.findElement(By.id("password")).sendKeys("123456789");
             
             driver.findElement(By.xpath("//button[@class='ux-button btn btn-purchase btn-block ux-button-primary']")).click();
	}
}
