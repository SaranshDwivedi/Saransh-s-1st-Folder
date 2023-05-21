package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JobViteCssSelecTer {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
              ChromeOptions co = new ChromeOptions();
              
             co.addArguments("--remote-allow-origins=*");
             
             driver = new ChromeDriver(co);
             
             driver.manage().window().maximize();
             
             driver.get("https://id.jobvite.com/");
             Thread.sleep(1000);
             driver.findElement(By.cssSelector("input[class*='p']")).sendKeys("abc@gmail.com");
             
             driver.findElement(By.xpath("//span[@class='jvc-MuiButton-label']")).click();
}
}
//https://id.jobvite.com/