package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DiscordCssSelector {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
              ChromeOptions co = new ChromeOptions();
              
             co.addArguments("--remote-allow-origins=*");
             
             driver = new ChromeDriver(co);
             
             driver.manage().window().maximize();
             
             driver.get("https://discord.com/login");
             
             driver.findElement(By.id("uid_5")).sendKeys("saransh@gmail.com");
             
             Thread.sleep(2000);
             
             driver.findElement(By.id("uid_7")).sendKeys("123456489");
             
             driver.findElement(By.cssSelector("button[class$='R grow-2T4nbg']")).click();
             
	}

}
