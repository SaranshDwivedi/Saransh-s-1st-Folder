package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications=*");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().to("file:///C:/Users/saraa/OneDrive/Desktop/Selenium/HTML/RadioButton.html");

		Thread.sleep(2000);
		
	    WebElement rb = driver.findElement(By.xpath("//input[@name='n4']"));
	    
	    rb.click();
		
		Thread.sleep(2000);
		
		 boolean val = rb.isSelected();
		 
		 System.out.println(val);
		 
		 Thread.sleep(3000);
		 driver.close();
	}

}
