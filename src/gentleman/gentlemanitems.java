package gentleman;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class gentlemanitems {

	ChromeDriver driver;
	public gentlemanitems (ChromeDriver maindriver)
	{
		this.driver=maindriver;
	}
	
	@Test
	public void gitst() throws IOException, InterruptedException
	{
		FileInputStream gi = new FileInputStream("D:\\selenium 2\\Items.xlsx");
		XSSFWorkbook giwb = new XSSFWorkbook(gi);
		XSSFSheet gish = giwb.getSheet("Sheet1");
		for(int i=1;i<=gish.getLastRowNum();i++)
		{
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id=\"navi\"]/li[8]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("addItemBtn")).click();
			Thread.sleep(2000);
			//dropdown
			WebElement category = driver.findElement(By.name("category"));
			Select drp = new Select(category);
			drp.selectByVisibleText(gish.getRow(i).getCell(0).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.name("item_name")).sendKeys(gish.getRow(i).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			//opening stock
			
			Row girow = gish.getRow(i);
			Cell gicell = girow.getCell(2);
			int stock = (int) gicell.getNumericCellValue();
			WebElement openingstock = driver.findElement(By.name("opening_stock"));
			openingstock.sendKeys(Integer.toString(stock));
			Thread.sleep(2000);
			
			driver.findElement(By.name("submit")).click();
			
			if (driver.findElement(By.id("swal2-title")).isDisplayed())
			{
				driver.findElement(By.xpath("/html/body/div[2]/div/div[10]/button[1]")).click();
				System.out.println("succusfully stock updated ");
				}else 
				{
					System.out.println("failed to update ");
				}	
			Thread.sleep(2000);
			
			//edit category
			driver.findElement(By.name("editCategory")).click();
			Thread.sleep(2000);
			WebElement itemcategory = driver.findElement(By.name("item_id"));
			Select itemdrp = new Select(itemcategory);
			itemdrp.selectByVisibleText(gish.getRow(i).getCell(3).getStringCellValue());
			Thread.sleep(2000);
			
			WebElement categorystock = driver.findElement(By.xpath("//*[@id=\"editCategory\"]/form/div/div/div[2]/div[2]/select"));
			Select catedrop = new Select(categorystock);
			catedrop.selectByVisibleText(gish.getRow(i).getCell(4).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"editCategory\"]/form/div/div/div[3]/button[1]")).click();
			if (driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed())
			{
				driver.findElement(By.xpath("/html/body/div[2]/div/div[10]/button[1]")).click();
				System.out.println("category updated succes ");
			}else {
				System.out.println("failed ");
			}
		}
	}
	@AfterMethod
	public void aftgi()
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a/span")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after the items");
		 }else
		 {
			 System.out.println("not retured");
		 }
	}
}
