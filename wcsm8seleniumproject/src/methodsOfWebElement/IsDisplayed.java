package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications=*");

		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement usd = driver.findElement(By.xpath("//input[contains(@placeholder,'U')]"));

		WebElement pwd = driver.findElement(By.xpath("//input[contains(@placeholder,'P')]"));

		WebElement log = driver.findElement(By.xpath("//button[contains(@class,'')]"));

		Thread.sleep(2000);
		
		if (usd.isDisplayed())
		{
		 usd.sendKeys("Admin");	
		}
		else {
			System.out.println("not a valid username xpath");
		}
		
		Thread.sleep(2000);

		if (pwd.isDisplayed())
		{
		 pwd.sendKeys("admin123");	
		}
		else {
			System.out.println("not a valid password xpath");
		}

		Thread.sleep(2000);

		if (log.isDisplayed())
		{
		 log.click();	
		}
		else {
			System.out.println("login button is not visible");
		}
	}

}
