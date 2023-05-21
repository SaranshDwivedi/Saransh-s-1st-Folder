package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications=*");

		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.instagram.com/");

		WebElement usd = driver.findElement(By.xpath("//input[contains(@class,'') and @type='text']"));

		WebElement pwd = driver.findElement(By.xpath("//input[contains(@class,'') and @type='password']"));

		WebElement log = driver.findElement(By.xpath("//div[contains(@class,'x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1x')]//ancestor::form[@id='loginForm']"));

		if (usd.isDisplayed())
		{
			usd.sendKeys("saransh11");
		}
		else {
			System.out.println("invalid usd");
		}
		if (pwd.isDisplayed()) 
		{
			pwd.sendKeys("    ");	
		}
		else {
			System.out.println("invalid pwd");
		}

		Thread.sleep(4000);


		boolean var = log.isEnabled();
		System.out.println(var);




	}
}
