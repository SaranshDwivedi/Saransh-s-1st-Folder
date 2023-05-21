package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTextFacebook {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(co); 

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		String usd = driver.findElement(By.xpath("//input[@id='pass']")).getAttribute("type");
		System.out.println(usd);
		
		Thread.sleep(3000);

		String pwd = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("id");
		System.out.println(pwd);
		
		String log = driver.findElement(By.xpath("//button[@id='u_0_5_D+']")).getAttribute("type");
		System.out.println(log);
		
		String text = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getAttribute("class");
		System.out.println(text);
	}

}
