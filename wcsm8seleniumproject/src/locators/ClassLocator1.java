package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassLocator1 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.switchTo().activeElement().sendKeys("chander bing", Keys.ENTER);
		
		driver.findElement(By.className("1NPNe")).click();
		
	}

}
