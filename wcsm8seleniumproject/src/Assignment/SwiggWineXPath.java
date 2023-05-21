package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwiggWineXPath {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        ChromeOptions co = new ChromeOptions();		
        
        co.addArguments("--remote-allow-origins=*");
        
        driver = new ChromeDriver(co);
        
        driver.manage().window().maximize();
        
        driver.navigate().to("https://accounts.spotify.com/en/login?continue=https%3A%2F%2Fopen.spotify.com%2F%3F");
               
        driver.findElement(By.id("login-username")).sendKeys("saransh11");
        
        Thread.sleep(2000);
        
        driver.findElement(By.id("login-password")).sendKeys("123456789");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@class='Button-sc-qlcn5g-0 otMlU']")).click();
	}

}
