package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B {
	
	@Test
	public void driver() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.youtube.com/watch?v=Vvvg-pfZt6E");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		

	}

}
