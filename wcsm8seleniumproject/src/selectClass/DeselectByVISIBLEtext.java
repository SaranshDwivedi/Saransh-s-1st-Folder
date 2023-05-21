package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVISIBLEtext {

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

		for (int i = 0; i <= 6; i++) 
		{
			sel.selectByIndex(i);
			Thread.sleep(100);
		}

		sel.deselectByVisibleText("CHINEES");

		Thread.sleep(200);

		sel.deselectByVisibleText("POHA");


	}

}
