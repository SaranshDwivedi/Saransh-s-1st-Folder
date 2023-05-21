package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.asm.Advice.Enter;

public class XPath1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		co.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(co);
		
		
		
		driver.navigate().to("https://in.puma.com/in/en?msclkid=6803594dcd2917c2ebbf3d7bc6d8030b&utm_aud=OTH&utm_campaign=BS_BNG_SEA-TXT_Brand-Exact&utm_medium=BS&utm_obj=CONV&utm_source=BNG-SEA-TXT");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='flex items-center space-x-2 mt-1 ml-5']")).click();    //for menu bar
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//body[@class='en']")).click();    //for menu cursor
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='text-xl md:text-2xl font-bold' and (text()='New Arrivals')]")).click();
		
		//driver.findElement(By.xpath("//h3[text()='Puma Punch Comfort Unisex Sneakers']/descendant::span[text()='Puma White-Puma White'] ")).click();
	}
}