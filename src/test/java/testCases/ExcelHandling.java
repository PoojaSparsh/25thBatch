package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelHandling {

	
	@Test
	public void excelsheet() throws IOException, InterruptedException
	{
	FileInputStream fs=new FileInputStream("C:\\Users\\win10pro\\OneDrive\\Desktop\\pooja.xlsx");

	
	XSSFWorkbook workbook=new XSSFWorkbook(fs);
	
	XSSFSheet sheet=workbook.getSheetAt(0);
	
	XSSFRow row=sheet.getRow(0);
	
	XSSFCell cell=row.getCell(0);
	

	
	System.out.println(sheet.getRow(0).getCell(0)); 		//cell=column
	System.out.println(sheet.getRow(0).getCell(1));
	
	String cellvalue=cell.getStringCellValue();
	
	String cellvalue2=cell.getStringCellValue();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://login.salesforce.com/?locale=in");
	
	Thread.sleep(1000);
	
	driver.manage().window().maximize();
	
	Thread.sleep(1000);

	WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
	
	username.sendKeys(cellvalue);
	
	Thread.sleep(1000);

	username.sendKeys(Keys.TAB);
	
	Thread.sleep(1000);

	
	WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
	
	pwd.sendKeys(cellvalue2);
	
	Thread.sleep(1000);

	pwd.sendKeys(Keys.ENTER);
	
	Thread.sleep(3000);

	driver.close();
	
	}
	}
