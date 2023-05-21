package selectClass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class IndexMultiSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");

		co.addArguments("--disable-notifications=*");

		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().to("file:///C:/Users/saraa/OneDrive/Desktop/Selenium/HTML/MultiSelectButton.html");

		WebElement muld = driver.findElement(By.name("menu"));

		Select sel = new Select(muld);

		//for selecting 1 option
		//sel.selectByIndex(3);

		//		for selecting mutiple countinous element
		//		for (int i = 0; i <= 3; i++) {
		//			sel.selectByIndex(i);
		//			}


		for (int i = 0; i <= 6; i++) 
		{
			if (i%2==0)
			{
				sel.selectByIndex(i);
			}

			else 
			{
				System.out.println("its an odd element");
			}
		}
	}

}
