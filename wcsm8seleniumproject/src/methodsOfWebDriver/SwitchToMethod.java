package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");

		EdgeOptions co = new EdgeOptions();

		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new EdgeDriver(co);

		driver.manage().window().maximize();

		driver.navigate().to("http://127.0.0.1/login.do");
		
		driver.switchTo().activeElement().sendKeys("admin",Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
