package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");

		EdgeOptions co = new EdgeOptions();

		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new EdgeDriver(co);

		driver.manage().window().maximize();

		driver.navigate().to("http://127.0.0.1/login.do");

		Thread.sleep(2000);

		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
