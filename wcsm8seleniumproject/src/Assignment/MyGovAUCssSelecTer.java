package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyGovAUCssSelecTer {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
              ChromeOptions co = new ChromeOptions();
              
             co.addArguments("--remote-allow-origins=*");
             
             driver = new ChromeDriver(co);
             
             driver.manage().window().maximize();
             
             driver.get("https://login.my.gov.au/las/mygov-login?execution=e1s1");
             
            // driver.findElement(By.id("userId")).sendKeys("asd@gmail.com");
           
             //river.findElement(By.id("password")).sendKeys("asd@gmail.com");
             
             //driver.findElement(By.cssSelector("button[class='button-main']")).click();
	
}
}
//userId