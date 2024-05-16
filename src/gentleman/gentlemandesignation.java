package gentleman;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class gentlemandesignation {

	ChromeDriver driver;
	public gentlemandesignation (ChromeDriver mainDriver)
	{
		this.driver=mainDriver;
		
	}
	@Test
	public void tstdsg() throws IOException, InterruptedException
	{
		driver.manage().window().maximize();
		FileInputStream dsg = new FileInputStream("D:\\selenium 2\\Designation.xlsx");
	    XSSFWorkbook dsgwb = new XSSFWorkbook(dsg);
	    XSSFSheet dsgsh = dsgwb.getSheet("Sheet1");
	    for(int i =1;i<=dsgsh.getLastRowNum();i++)
	    {

	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@id=\"navi\"]/li[9]/a/span")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div[1]/div[2]/a/button")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@id=\"emp_name\"]")).sendKeys(dsgsh.getRow(i).getCell(0).getStringCellValue());
	    	driver.findElement(By.name("submit")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@id=\"designation_table\"]/tbody/tr[1]/td[3]/center/a[2]")).click();
	    	driver.switchTo().alert().dismiss();
	    }
	}
	@AfterMethod
	public void aftdsg()
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after the test of designation");
		 }else
		 {
			 System.out.println("not retured");
		 }	
	}
}
