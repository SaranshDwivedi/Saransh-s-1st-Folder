package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {

		//to avoid Illegal state exception
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//to avoid path not found exception 
		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications=*");

		//to access all 13 non static methods , upcast chromedriver class into webdriver interface
		WebDriver driver = new ChromeDriver(co); 

		//to maximize chrome window
		driver.manage().window().maximize();

		//to access webpage
		driver.navigate().to("file:///C:/Users/saraa/OneDrive/Desktop/Selenium/HTML/TextField.html");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input")).sendKeys("Saransh Dwivedi");

		Thread.sleep(3000);
		
		driver.close();

	}

}
