package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");

		EdgeOptions co = new EdgeOptions();

		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new EdgeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do");

		String gps = driver.getPageSource();
		
		System.out.println(gps);
		
		Thread.sleep(2000);
		
		String gpu = driver.getCurrentUrl();
		
		System.out.println(gpu);
//		
//		Thread.sleep(2000);
//		
//		driver.close();
//		


	}

}
