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

public class ContextClickMethod {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");

		co.addArguments("--disable-notifications=*");

		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.selenium.dev/downloads/");

		Thread.sleep(2000);

		WebElement link = driver.findElement(By.xpath("//a[text()='other languages exist']"));

		Point point = link.getLocation();

		int x = point.getX();

		int y = point.getY();

		JavascriptExecutor jse = (JavascriptExecutor)driver;

		jse.executeScript("window.scrollBy("+x+","+(y-300)+")");

		Thread.sleep(2000);

		Actions act = new Actions(driver);

		act.moveToElement(link).build().perform();

		Thread.sleep(2000);

		act.contextClick(link).build().perform();

	}

}
