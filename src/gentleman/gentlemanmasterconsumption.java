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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class gentlemanmasterconsumption {

	ChromeDriver driver;
	public gentlemanmasterconsumption (ChromeDriver maindriver)
	{
		this.driver =maindriver;
	}
	
	@Test
	public void tstmc() throws IOException, InterruptedException
	{
		driver.manage().window().maximize();

		FileInputStream mc = new FileInputStream("D:\\selenium 2\\mastercunsumpption.xlsx");
		XSSFWorkbook mcwb = new XSSFWorkbook(mc);
		XSSFSheet mcsh = mcwb.getSheet("Sheet1");
		for(int i = 1 ;i<=mcsh.getLastRowNum();i++)
		{
			driver.findElement(By.xpath("//*[@id=\"navi\"]/li[17]/a/span")).click();
			
			
			WebElement itemslist = driver.findElement(By.xpath("//*[@id=\"selectItem\"]"));
			Select drp1 = new Select(itemslist);
			drp1.selectByVisibleText(mcsh.getRow(i).getCell(0).getStringCellValue());
			Thread.sleep(2000);
			//fromdate
			Row daterow= mcsh.getRow(i);
			Cell datecell = daterow.getCell(1);
			int datefield = (int) datecell.getNumericCellValue();
			WebElement datef = driver.findElement(By.name("start_date"));
			datef.sendKeys(Long.toString(datefield));
			Thread.sleep(2000);
			
			//todate
			Row daterow2= mcsh.getRow(i);
			Cell datecell2 = daterow2.getCell(2);
			int datefield2 = (int) datecell2.getNumericCellValue();
			WebElement datef2 = driver.findElement(By.name("end_date"));
			datef2.sendKeys(Long.toString(datefield2));
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"search_data\"]")).click();
			
			driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div[3]/button[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"json\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"csv\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"pdf\"]")).click();
		}
	}
	@AfterMethod
	public void aftmc()
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after the test of master consumption");
		 }else
		 {
			 System.out.println("not retured");
		 }	
	}
}
