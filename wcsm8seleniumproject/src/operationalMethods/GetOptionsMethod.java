package operationalMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetOptionsMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");

		co.addArguments("--disable-notifications=*");

		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/saraa/OneDrive/Desktop/Selenium/HTML/DropDownButton.html");

		WebElement dd = driver.findElement(By.xpath("//select[@name='menu']"));

		Select sel = new Select(dd);

		List<WebElement> options = sel.getOptions();

		for(int i = 0; i<=9 ; i++)
		{
			sel.selectByIndex(i);
			//			String allop = op.getText();
			//
			//			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			//			
			//			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.name("menu")));
			//					
			//			System.out.println(options);
		}




	}

}
