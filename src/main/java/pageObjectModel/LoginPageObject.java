package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public static WebDriver driver;
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='Login']");
	private By tryForFree=By.xpath("//a[@id='signup_link']");
	
	public LoginPageObject(WebDriver driver2) {
	this.driver=driver2;
	}
	public WebElement enterusername() {
		return driver.findElement(username);
		
	}
	public WebElement enterpassword() {
		return driver.findElement(password);
	}
	public WebElement clicklogin() {
		return driver.findElement(login);
	}
	
	public WebElement clickTryForFree() {
		return driver.findElement(tryForFree);
	
	}	
}
