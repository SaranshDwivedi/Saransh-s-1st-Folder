package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DiscordXPath {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
              ChromeOptions co = new ChromeOptions();
              
             co.addArguments("--remote-allow-origins=*");
             
             driver = new ChromeDriver(co);
             
             driver.manage().window().maximize();
             
             driver.get("https://discord.com/login");
             
             driver.findElement(By.id("uid_5")).sendKeys("saranshd@gmail.com");
             
             Thread.sleep(2000);
             
             driver.findElement(By.id("uid_7")).sendKeys("qwerty");
             
             driver.findElement(By.xpath("//button[@class='marginBottom8-emkd0_ button-1cRKG6 button-ejjZWC lookFilled-1H2Jvj colorBrand-2M3O3N sizeLarge-2xP3-w fullWidth-3M-YBR grow-2T4nbg']")).click();
             
	}

}
