package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NaukariCssSelecTers {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
              ChromeOptions co = new ChromeOptions();
              
             co.addArguments("--remote-allow-origins=*");
             
             driver = new ChromeDriver(co);
             
             driver.manage().window().maximize();
             
             driver.get("https://www.naukri.com/nlogin/login?msg=0&URL=https%3A%2F%2Fmy.naukri.com%3A80");

             driver.findElement(By.id("usernameField")).sendKeys("abc@gmail.com");
             Thread.sleep(3000);
             driver.findElement(By.id("passwordField")).sendKeys("123456789");
             
             driver.findElement(By.cssSelector("button[class='waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform']")).click();
             
}
}
