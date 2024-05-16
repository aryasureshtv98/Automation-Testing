package gentleman;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gentlemanROP {

	ChromeDriver driver;
	public gentlemanROP (ChromeDriver maindriver)
	{
		this.driver=maindriver;
		
	}
	@Test
	public void rop() throws IOException, InterruptedException
	{

		FileInputStream ropfile = new  FileInputStream("D:\\selenium 2\\ROP.xlsx");
		XSSFWorkbook ROPwb = new XSSFWorkbook(ropfile);
		XSSFSheet ROPsh  =ROPwb.getSheet("Sheet1");
		for(int i = 1 ;i<=ROPsh.getLastRowNum();i++)
		{
			driver.findElement(By.xpath("//*[@id=\"navi\"]/li[6]/a")).click();
			driver.findElement(By.id("ropBtn")).click();
			Thread.sleep(2000);
			
			//
			WebElement branchh= driver.findElement(By.name("branch"));
			Select dropdown = new Select(branchh);
			dropdown.selectByVisibleText(ROPsh.getRow(i).getCell(0).getStringCellValue());
			
			Thread.sleep(2000);
			
			WebElement item = driver.findElement(By.name("item"));
			Select dropdown2 = new Select(item);
			dropdown2.selectByVisibleText(ROPsh.getRow(i).getCell(1).getStringCellValue());
			
			Thread.sleep(2000);
			
			/*Row daterow = pursh.getRow(i);
			Cell datecell= daterow.getCell(2);
		    int numdate = (int) datecell.getNumericCellValue();
			WebElement inputfield = driver.findElement(By.xpath("//body/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/input[1]"));
			inputfield.sendKeys(Double.toString(numdate));
			Thread.sleep(2000);*/
			
			//driver.findElement(By.xpath("//*[@id=\"ropValue\"]")).sendKeys(ROPsh.getRow(i).getCell(2).getStringCellValue())
			
			Row roprow = ROPsh.getRow(i);
			Cell ropcell =roprow.getCell(2);
			int rop =  (int) ropcell.getNumericCellValue();
			WebElement numrop = driver.findElement(By.xpath("//*[@id=\"ropValue\"]"));
			numrop.sendKeys(Double.toString(rop));
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"addROPModal\"]/form/div/div/div[2]/div[4]/button[2]")).click();
			
			Thread.sleep(2000);
			
			if (driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed())
			{
				driver.findElement(By.xpath("/html/body/div[2]/div/div[10]/button[1]")).click();
				System.out.println("succes text is displayed");
			}else {
					System.out.println("failed");
				}
			}

		JavascriptExecutor scrolld = (JavascriptExecutor) driver;
		scrolld.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
      
		Actions act = new Actions(driver);
       WebElement next = driver.findElement(By.xpath("//*[@id=\"rop_table_next\"]/a"));
       act.doubleClick(next).perform();
       Thread.sleep(2000);
       WebElement back = driver.findElement(By.xpath("//*[@id=\"rop_table_previous\"]/a"));
       act.doubleClick(back).perform();
       
       scrolld.executeScript("window.scrollTo(document.body.scrollHeight,0)");
        

	
	
	}
	@AfterMethod
	public void aftrop()
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after the test of rop");
		 }else
		 {
			 System.out.println("not retured");
		 }	
	}

	
	
	}	

