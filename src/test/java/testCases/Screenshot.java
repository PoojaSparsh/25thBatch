package testCases;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	@Test
	public void capturescreenshot() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		TakesScreenshot srcshot=(TakesScreenshot)driver;
		
		File source=srcshot.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\Users\\win10pro\\OneDrive\\Desktop\\ss\\poo.png");
		 
		FileUtils.copyFile(source, destination);
		
		
		System.out.println("ss1 captured");
		
		 WebElement login=driver.findElement(By.xpath("//form[@name='login']"));
		
		File src2=login.getScreenshotAs(OutputType.FILE);
		
		File d2=new File("C:\\Users\\win10pro\\OneDrive\\Desktop\\ss\\sparsh.jpeg");
		
		FileUtils.copyFile(src2, d2);
		
		System.out.println("ss2 captured");

				
}
}