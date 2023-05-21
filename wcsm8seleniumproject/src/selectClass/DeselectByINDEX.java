package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DeselectByINDEX {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications=*");

		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().to("file:///C:/Users/saraa/OneDrive/Desktop/Selenium/HTML/MultiSelectButton.html");

		WebElement mdd = driver.findElement(By.name("menu"));

		Select sel = new Select(mdd);

		for (int j = 0; j <= 6; j++) 
		{
			sel.selectByIndex(j);	
		}

		Thread.sleep(1000);

		for (int j = 0; j <= 4; j++)
		{
			if (j%2==0)
			{
				sel.deselectByIndex(j);	
			}
			else {
				System.out.println("nada");
			}

		}

	}

}
