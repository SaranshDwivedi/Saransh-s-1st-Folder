package methodsOfWebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class GetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");


	}


}
