package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwiggyCssSelector {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.swiggy.com/");
		
		driver.findElement(By.cssSelector("a[class='x4bK8']")).click();
		
		driver.findElement(By.cssSelector("input[class='_381fS']")).sendKeys("1234567890");
		
		Thread.sleep(10000);
		
		driver.findElement(By.cssSelector("body[class='overlay-enabled']")).sendKeys("123456");
		
		driver.findElement(By.cssSelector("a[class='a-ayg']")).click();
	}
}
