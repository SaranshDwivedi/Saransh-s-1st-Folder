package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XPath2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		co.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(co);
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("hp laptops",Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i7']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/descendant::div[text()='Operating System']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 11']")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/descendant::div[text()='Brand']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='4★ & above']")).click();
		
		//driver.findElement(By.xpath("")).click();    //for menu bar
		
		
	}
}