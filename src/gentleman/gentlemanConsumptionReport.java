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

public class gentlemanConsumptionReport {

	ChromeDriver driver;
	public gentlemanConsumptionReport (ChromeDriver maindriver)
	{
		this.driver = maindriver;
		
	}
	@Test
	public void tstcr() throws IOException, InterruptedException
	{
driver.manage().window().maximize();

		FileInputStream dt = new FileInputStream("D:\\selenium 2\\Consumption Report.xlsx");
		XSSFWorkbook dtwb = new XSSFWorkbook(dt);
		XSSFSheet dtsh = dtwb.getSheet("Sheet1");
		for(int i = 1 ;i<=dtsh.getLastRowNum();i++)
		{
			driver.findElement(By.xpath("//*[@id=\"navi\"]/li[16]/a/span")).click();
			
		WebElement branchlist = driver.findElement(By.xpath("//*[@id=\"selectBranch\"]"));
		Select drp1 = new Select(branchlist);
		drp1.selectByVisibleText(dtsh.getRow(i).getCell(0).getStringCellValue());
		
		Thread.sleep(2000);
		
		WebElement items = driver.findElement(By.name("item_id"));
		Select drp2 = new Select(items);
		drp2.selectByVisibleText(dtsh.getRow(i).getCell(1).getStringCellValue());
		
		//fromdate
		Row daterow= dtsh.getRow(i);
		Cell datecell = daterow.getCell(2);
		int datefield = (int) datecell.getNumericCellValue();
		WebElement datef = driver.findElement(By.name("start_date"));
		datef.sendKeys(Long.toString(datefield));
		Thread.sleep(2000);
		//todate
		Row todaterow= dtsh.getRow(i);
		Cell todatecell = todaterow.getCell(3);
		int todatefield = (int) todatecell.getNumericCellValue();
		WebElement todatef = driver.findElement(By.name("end_date"));
		todatef.sendKeys(Long.toString(todatefield));
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("search_data")).click();
		
		Thread.sleep(2000);
		}
		driver.navigate().back();
	}
	@AfterMethod
	public void aftcr()
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after the test of consumption report");
		 }else
		 {
			 System.out.println("not retured");
		 }	
	}
	
	
}
