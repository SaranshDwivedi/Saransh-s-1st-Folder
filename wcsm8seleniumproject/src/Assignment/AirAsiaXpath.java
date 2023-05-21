package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirAsiaXpath {
static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
	
	//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	ChromeOptions co = new ChromeOptions();
	
	co.addArguments("--remote-allow-origins=*");
	
	co.addArguments("--disable-notifications");
	
	driver = new ChromeDriver(co);
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.airasia.co.in/home");
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//div[text()='BLR']")).sendKeys("PQR");
	
	//Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//input[contains(@class,'form-control')]"));
	//.click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[contains(text(),'Fly to')]")).sendKeys("IDR");
}
}
