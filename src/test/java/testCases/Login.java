package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjectModel.LoginPageObject;
import resources.BaseClass;

public class Login extends BaseClass {
	
	
	@Test
	public void verifyLogin() throws IOException, InterruptedException {
		
		driverInitialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		LoginPageObject obj=new LoginPageObject(driver);
		
		
		
		obj.enterusername().sendKeys("poojagudadinni@gmail.com");
		Thread.sleep(2000);

		obj.enterpassword().sendKeys("pooja123");
		Thread.sleep(2000);
		
		obj.clicklogin().click();
		Thread.sleep(2000);
		
		obj.clickTryForFree().click();
		Thread.sleep(2000);


		
	}

}
