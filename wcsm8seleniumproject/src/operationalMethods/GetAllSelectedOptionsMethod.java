package operationalMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");

		co.addArguments("--disable-notifications=*");

		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/saraa/OneDrive/Desktop/Selenium/HTML/MultiSelectButton.html");
		
		WebElement dd = driver.findElement(By.xpath("//select[@name='menu']"));
		
		Select sel = new Select(dd);
		
		for(int i = 0; i<=5; i++)
		{
			Thread.sleep(200);
			sel.selectByIndex(i);
		}
		
		List<WebElement> alloptions = sel.getAllSelectedOptions();
		
		for(WebElement ao:alloptions)
		{
			String gt = ao.getText();
			Thread.sleep(200);
			System.out.println(gt);
		}
				
	}

}
