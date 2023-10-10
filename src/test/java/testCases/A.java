package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A {
	
@Test
public void M1() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	Thread.sleep(2000);

	driver.manage().window().maximize();
	
	Thread.sleep(2000);


}

}
