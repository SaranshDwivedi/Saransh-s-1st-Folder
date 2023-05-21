package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HubSpotCssSeLEctor {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
              ChromeOptions co = new ChromeOptions();
              
             co.addArguments("--remote-allow-origins=*");
             
             driver = new ChromeDriver(co);
             
             driver.manage().window().maximize();
             
             driver.get("https://app.hubspot.com/login/");
             
             
             driver.findElement(By.cssSelector("input[class$='l']")).sendKeys("abc@gmail.com");
             Thread.sleep(1000);
             
             driver.findElement(By.cssSelector("input[class^='form-control private-form__control login-p']")).sendKeys("123456789");
             
             driver.findElement(By.cssSelector("button[class$='t private-button--non-link']")).click();
	}
}
