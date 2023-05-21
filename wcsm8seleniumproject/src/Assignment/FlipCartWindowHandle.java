package Assignment;

import java.awt.Window;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class FlipCartWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");

		EdgeOptions eo = new EdgeOptions();

		eo.addArguments("--remote-allow-origins=*");
		eo.addArguments("--disable-notifications");

		WebDriver driver = new EdgeDriver(eo);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("samsung s23 ultra");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu' and @type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']")).click();
		
		String parentHandle = driver.getWindowHandle();
		
		Thread.sleep(2000);
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for ( String wh : allHandles)
		{
			if (!parentHandle.equals(allHandles))
			{
				Thread.sleep(2000);
				driver.switchTo().window(wh);
			}
		}
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//img[@class='_30PAEw']/ancestor::a[@class='kmlXmn']/ancestor::ul[@class='_1q8vHb']"));
		
		Point point = element.getLocation();
		
		int xaxis = point.getX();
		
		int yaxis = point.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-300)+")");
		
		driver.findElement(By.xpath("//a[@class='_1fGeJ5' and text()='512 GB']")).click();
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-300)+")");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li[@id='swatch-0-color']")).click();
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-300)+")");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("411033");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		Thread.sleep(2000);
		
		WebElement knowMore = driver.findElement(By.xpath("//button[@class='_23FHuj']/ancestor::div[@class='_1uc2IE']"));
		
		Point p1 = knowMore.getLocation();
		
		int x = p1.getX();
		
		int y = p1.getY();
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scroll("+x+","+y+")");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_3dsJAO' and text()='Remove']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
		
	}

}
