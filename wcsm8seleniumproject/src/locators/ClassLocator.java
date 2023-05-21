package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassLocator {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		   ChromeOptions co = new ChromeOptions();
		
		   co.addArguments("--remote-allow-origins=*");
		   
		   driver = new ChromeDriver(co);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.google.com/");
		   
		   Thread.sleep(2000);
		   
		   driver.switchTo().activeElement().sendKeys("Joey Tribbiani",Keys.ENTER);
		   
		   
		   driver.findElement(By.className("lNPNe")).click();

	}

}
