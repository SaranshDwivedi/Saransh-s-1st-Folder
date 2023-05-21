package methodsOfWebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");

		Thread.sleep(2000);

		driver.close();
	}

}
