package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EbizCssSeLector {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
              ChromeOptions co = new ChromeOptions();
              
             co.addArguments("--remote-allow-origins=*");
             
             driver = new ChromeDriver(co);
             
             driver.manage().window().maximize();
             
             driver.get("https://ebiz.ril.com/irj/portal");
             
             driver.findElement(By.name("j_username")).sendKeys("abc@gmail.com");
             
             driver.findElement(By.name("j_password")).sendKeys("12345678");
             
             driver.findElement(By.cssSelector("input[class='logonbutton']")).click();
             
	}

}
