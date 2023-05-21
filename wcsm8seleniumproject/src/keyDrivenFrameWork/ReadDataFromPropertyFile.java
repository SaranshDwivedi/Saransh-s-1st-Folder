package keyDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String un = prop.getProperty("USERNAME");
		
		System.out.println(un);
	}

}
