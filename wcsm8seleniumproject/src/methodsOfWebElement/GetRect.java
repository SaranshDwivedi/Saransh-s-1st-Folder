package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetRect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications=*");

		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);

		WebElement log = driver.findElement(By.xpath("//button[contains(@class,'')]"));

		Rectangle val = log.getRect();

		 int x = val.getX();
		 
		int y = val.getY();
		
		int h = val.getHeight();
		
		int w = val.getWidth();
		
		System.out.println("X axis : "+x+", Y axis : "+y);
		
		Thread.sleep(2000);
		
		System.out.println("Height : "+h+", Width : "+w);
	}

}
