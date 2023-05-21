package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		
		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.navigate().to("https://www.selenium.dev/downloads/");
		
		Thread.sleep(3000);
		
		WebElement value = driver.findElement(By.xpath("//h1[.='Downloads']"));
		
		String  val = value.getAttribute("class");
		System.out.println( val);
		String val1 = value.getText();
	    System.out.println(val1);
	}

}
