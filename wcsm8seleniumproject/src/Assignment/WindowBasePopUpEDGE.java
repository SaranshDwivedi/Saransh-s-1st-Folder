package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class WindowBasePopUpEDGE {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");

		EdgeOptions eo = new EdgeOptions();

		eo.addArguments("--remote-allow-origins=*");
		eo.addArguments("--disable-notifications");

		WebDriver driver = new EdgeDriver(eo);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://127.0.0.1/login.do");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		WebElement set = driver.findElement(By.xpath("//div[@class='label' and text()='Settings']"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(1000);
		
		act.doubleClick(set).perform();
		
		WebElement logo = driver.findElement(By.xpath("//a[@class='item' and text()='Logo & Color Scheme']"));
		
		Thread.sleep(1000);
		
		act.click(logo).perform();

		WebElement rb = driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']"));
		
		Thread.sleep(1000);
		
		act.click(rb).perform();

		WebElement cf = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		
		Thread.sleep(1000);
		
		act.click(cf).perform();

		File file = new File("C:\\Users\\saraa\\eclipse-workspace\\wcsm8\\wcsm8seleniumproject\\autoIT\\ScriptEdgeActi.exe");
		
		String absolutepath = file.getAbsolutePath();
		
		Runtime.getRuntime().exec(absolutepath);
	}

}
