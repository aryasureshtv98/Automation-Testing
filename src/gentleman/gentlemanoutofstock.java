package gentleman;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class gentlemanoutofstock {

	ChromeDriver driver;
	
	public gentlemanoutofstock (ChromeDriver maindriver)
	{
		this.driver=maindriver;
	}
	@Test
	public void tstoos() throws IOException, InterruptedException
	{
		driver.manage().window().maximize();
		
		FileInputStream outofstock = new FileInputStream("D:\\selenium 2\\out of stock.xlsx");
		XSSFWorkbook ooswb = new XSSFWorkbook(outofstock);
		XSSFSheet oossh = ooswb.getSheet("Sheet1");
		for(int i =1 ;i<=oossh.getLastRowNum();i++)
		{
			driver.findElement(By.xpath("//*[@id=\"navi\"]/li[19]/a/span")).click();
			Thread.sleep(1500);
			//dropdown of branches
			WebElement dropdown = driver.findElement(By.id("selectBranch"));
			Select dd = new Select(dropdown);
			dd.selectByVisibleText(oossh.getRow(i).getCell(0).getStringCellValue());
			Thread.sleep(1500);
			
			driver.findElement(By.xpath("//*[@id=\"Branch_Opening_Stock_wrapper\"]/div[2]/a[1]")).click();//copy
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"Branch_Opening_Stock_wrapper\"]/div[2]/a[2]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"Branch_Opening_Stock_wrapper\"]/div[2]/a[3]")).click();//pdf
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"Branch_Opening_Stock_wrapper\"]/div[2]/a[5]")).click();//csv
			Thread.sleep(1500);
			//print
			String parentwin = driver.getWindowHandle();
			driver.findElement(By.xpath("//*[@id=\"Branch_Opening_Stock_wrapper\"]/div[2]/a[4]")).click();
			Set<String>secondwindow = driver.getWindowHandles();
			for(String seconddetails : secondwindow)
			{
				if (!seconddetails.equalsIgnoreCase(parentwin))
				{
				System.out.println("new window");
				driver.switchTo().window(seconddetails);
				driver.close();
				
				}
					
			}
			driver.switchTo().window(parentwin);
			Thread.sleep(1500);
			
			driver.findElement(By.xpath("//*[@id=\"Branch_Opening_Stock_filter\"]/label/input")).sendKeys(oossh.getRow(i).getCell(1).getStringCellValue());
		}
		
	}
	@AfterMethod
	public void aftoos()
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after out of stock items");
		 }else
		 {
			 System.out.println("not retured");
		 }	
	}
	
	
}
