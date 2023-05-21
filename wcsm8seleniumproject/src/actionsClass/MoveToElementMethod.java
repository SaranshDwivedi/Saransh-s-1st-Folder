package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");

		co.addArguments("--disable-notifications=*");

		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.selenium.dev/downloads/");

		Thread.sleep(4000);

		WebElement link = driver.findElement(By.xpath("//a[text()='other languages exist']"));

		Point point = link.getLocation();

		int x = point.getX();

		int y = point.getY();

		JavascriptExecutor jse = (JavascriptExecutor)driver;

		Thread.sleep(2000);
		
		//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//		
		//		wait.until(ExpectedConditions.elementToBeClickable(link)).click();
		//		
		jse.executeScript("window.scrollBy("+x+","+(y-300)+")");

        Actions act = new Actions(driver);
        
        act.moveToElement(link).perform();

	}

}
