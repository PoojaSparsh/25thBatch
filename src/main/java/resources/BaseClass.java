package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	 public static WebDriver driver;
	public void driverInitialize() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\win10pro\\eclipse-workspace\\demoProject\\src\\main\\java\\resources\\data.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
}
}
