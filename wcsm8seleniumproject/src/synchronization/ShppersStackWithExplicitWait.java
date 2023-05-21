package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShppersStackWithExplicitWait {

	public static void main(String[] args) {

		//to handle Illegle State Exception
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//to handle file not found exception
		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");

		//giving IO Exception
		co.addArguments("--disable-notifications=*");

		//to get all 13 non static mathods from web driver , upcating with chrome driver
		WebDriver driver	=new ChromeDriver(co);

		//to maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.shoppersstack.com/products_page/43");

		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("485001");

		//driver.findElement(By.xpath("//button[@id='Check']"));

		//by using ExPlicit Wait to Click on check button
		waitMethod(driver,30,"Check").click();	

	}
	public static WebElement waitMethod(WebDriver driver, int sec ,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(sec));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(value)));
		return element;
	}

}
