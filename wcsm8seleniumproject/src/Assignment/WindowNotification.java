package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WindowNotification {

	public static void main(String[] args) throws InterruptedException, IOException {

		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://127.0.0.1/login.do;jsessionid=qjf6ersorwnf");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();

		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//div[@class='label' and text()='Settings']"));

		Actions act = new Actions(driver);

		act.doubleClick(target).perform();
		
		Thread.sleep(2000);
		
		WebElement logo = driver.findElement(By.xpath("//a[@class='item' and text()='Logo & Color Scheme']"));
		act.click(logo).perform();
		
		WebElement rb = driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']"));
		act.click(rb).perform();
		
		WebElement cf = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		act.click(cf).perform();
		File file = new File("C:\\Users\\saraa\\eclipse-workspace\\wcsm8\\wcsm8seleniumproject\\autoIT\\ChooseFileAT.exe");
		
		String absolutepath = file.getAbsolutePath();
		
		Runtime.getRuntime().exec(absolutepath); 
		
	}

}
