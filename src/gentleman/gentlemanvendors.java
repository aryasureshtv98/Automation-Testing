package gentleman;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gentlemanvendors {

	
	
	ChromeDriver driver;
	public gentlemanvendors (ChromeDriver mainDriver)
	{
		this.driver=mainDriver;
	}

@BeforeMethod
public void venbfm()
{
	driver.findElement(By.xpath("//*[@id=\"navi\"]/li[3]/a")).click();
	
	//vendorsdetails click
	driver.findElement(By.xpath("//*[@id=\"navi\"]/li[3]/a")).click();
	
	//vendordetails is displayed or not
	WebElement ven = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
	if(ven.isDisplayed())
	{
		System.out.println("text is " + ven.getText());
	}else {
		System.out.println("failed page is not deviated ");
	}
		
}
@Test
public void ventest() throws InterruptedException, IOException
{
	FileInputStream vendor = new FileInputStream("D:\\selenium 2\\vendors list.xlsx");
	XSSFWorkbook venwb = new XSSFWorkbook(vendor);
	XSSFSheet vensh = venwb.getSheet("Sheet1");
	
	for(int i =1 ;i<=vensh.getLastRowNum();i++)
	{
		
	driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div[1]/div[2]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("designation")).sendKeys(vensh.getRow(i).getCell(0).getStringCellValue());
	Thread.sleep(2000);
	driver.findElement(By.name("v_address")).sendKeys(vensh.getRow(i).getCell(1).getStringCellValue());
	Thread.sleep(2000);
	driver.findElement(By.name("v_email")).sendKeys(vensh.getRow(i).getCell(2).getStringCellValue());
	Thread.sleep(2000);
	
	Row row =vensh.getRow(i);
	Cell cell = row.getCell(3);
	double numericData = cell.getNumericCellValue();
	WebElement inputField = driver.findElement(By.name("v_phone"));
	inputField.sendKeys(Double.toString(numericData));
	Thread.sleep(2000);
	//int numericData = vensh.getRow(i).getCell(3).getNumericCellValue();
	//driver.findElement(By.name("v_phone")).sendKeys(Integer.toString(numericData));
	driver.findElement(By.name("ve_gst")).sendKeys(vensh.getRow(i).getCell(4).getStringCellValue());
	Thread.sleep(2000);
	driver.findElement(By.name("v_pan")).sendKeys(vensh.getRow(i).getCell(5).getStringCellValue());
	Thread.sleep(2000);
	driver.findElement(By.name("submit")).click();
	
	
	}
	
	driver.manage().window().maximize();
	Actions act = new Actions(driver);
	//delete
	WebElement delete=  driver.findElement(By.xpath("//*[@id=\"designation_table\"]/tbody/tr[1]/td[8]/center/a[2]"));
	act.moveToElement(delete).click().perform();
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
    
}
@AfterMethod
public void aftvenpay()
{
	 driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
	 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
	 {
		 System.out.println("retured to dash board");
	 }else
	 {
		 System.out.println("not retured");
	 }
}
}