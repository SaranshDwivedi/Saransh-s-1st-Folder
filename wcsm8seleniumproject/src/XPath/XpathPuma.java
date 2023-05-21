package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathPuma {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
              ChromeOptions co = new ChromeOptions();
              
             co.addArguments("--remote-allow-origins=*");
             
             driver = new ChromeDriver(co);
             
             driver.manage().window().maximize();
             
             driver.get("https://in.puma.com/in/en/mens");
             driver.findElement(By.xpath("//span[.='Men']']")).click();
             Thread.sleep(2000);
             driver.findElement(By.xpath("//span[text()='PUMA White-Team Regal Red-Clyde Royal-PUMA Gold']")).click();
             //Thread.sleep(3000);
           
             
           //  driver.findElement(By.cssSelector("button[class='waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform']")).click();
             
             
	}
	
}
	//https://in.puma.com/in/en/mens

