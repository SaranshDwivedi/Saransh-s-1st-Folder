package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HubSpotXPath {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
              ChromeOptions co = new ChromeOptions();
              
             co.addArguments("--remote-allow-origins=*");
             
             driver = new ChromeDriver(co);
             
             driver.manage().window().maximize();
             
             driver.get("https://app.hubspot.com/login/");

             driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
             
             driver.findElement(By.id("password")).sendKeys("123456789");
             
             driver.findElement(By.xpath("//button[@class='uiButton private-button private-button--primary private-button--default m-bottom-4 login-submit private-button--non-link']")).click();
	}
}
