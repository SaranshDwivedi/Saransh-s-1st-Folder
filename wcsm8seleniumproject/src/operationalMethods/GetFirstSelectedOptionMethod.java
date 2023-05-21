package operationalMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {

	public static void main(String[] args) throws InterruptedException {

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
			if(i%2==0) 
			{
                Thread.sleep(200);
				sel.selectByIndex(i);
			}	
			else {
				System.out.println("odd");
			}
			
		}
		sel.deselectByVisibleText("POHA");
	
		WebElement gfso = sel.getFirstSelectedOption();
		String text = gfso.getText();	
		System.out.println(text);
	}

}
