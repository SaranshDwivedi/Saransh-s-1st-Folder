package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UimsCssSelecTor {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
              ChromeOptions co = new ChromeOptions();
              
             co.addArguments("--remote-allow-origins=*");
             
             driver = new ChromeDriver(co);
             
             driver.manage().window().maximize();
             
             driver.get("https://uims.cuchd.in/uims/");
             
             driver.findElement(By.id("txtUserId")).sendKeys("asd@gmail.com");
             

             driver.findElement(By.cssSelector("input[class^='b']")).click();

	}
}
//txtUserId