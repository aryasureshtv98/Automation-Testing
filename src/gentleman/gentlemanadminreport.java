package gentleman;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class gentlemanadminreport {

	
	ChromeDriver driver;
	public gentlemanadminreport (ChromeDriver maindriver)
	{
		this.driver=maindriver;
		
	}
	@Test
	public void tstadminrep() throws IOException, InterruptedException
	{
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		FileInputStream adminrep = new FileInputStream("D:\\selenium 2\\modify branch stock.xlsx");
		XSSFWorkbook admwb =new XSSFWorkbook(adminrep);
		XSSFSheet admsh = admwb.getSheet("Sheet1");
		for (int i =1 ; i<=admsh.getLastRowNum();i++)
		{
			//Actions act = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"navi\"]/li[24]/a")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("/html/body/div/div[1]/div/section[2]/div/div/div[2]/div[1]/button")).click();
			Thread.sleep(1500);
			//branch
				WebElement branch =  driver.findElement(By.xpath("//*[@id=\"branch\"]"));
				Select dropbranch = new Select(branch);
				dropbranch.selectByVisibleText(admsh.getRow(i).getCell(0).getStringCellValue());
				Thread.sleep(1500);
				//item
				WebElement item =  driver.findElement(By.xpath("//*[@id=\"item\"]"));
				Select dropitem = new Select(item);
				dropitem.selectByVisibleText(admsh.getRow(i).getCell(1).getStringCellValue());
				Thread.sleep(1500);
				
				//opening stock 
				long stock  = (long) admsh.getRow(i).getCell(2).getNumericCellValue();
		    	String openstock= String.valueOf(stock);
		    	WebElement inputField = driver.findElement(By.xpath("//*[@id=\"os\"]"));
		    	act.moveToElement(inputField).click().sendKeys(openstock).perform();
		    	Thread.sleep(1500);
		    	
		    	//available stock
		    	long avilablestock  = (long) admsh.getRow(i).getCell(3).getNumericCellValue();
		    	String availablestock= String.valueOf(avilablestock);
		    	WebElement stockfield = driver.findElement(By.xpath("//*[@id=\"avl_stock\"]"));
		    	act.moveToElement(stockfield).click().sendKeys(availablestock).perform();
		    	Thread.sleep(1500);
		    	
		    	driver.findElement(By.xpath("//button[@id='submitBtn']")).click();
		    	if (driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed())
		    	{
		    		driver.findElement(By.xpath("/html/body/div[2]/div/div[10]/button[1]")).click();
		    		System.out.println("cliked the ok button ");
		    	}else
		    	{
		    		System.out.println("failed");
		    	}
		    	
		    	//modify master stock page is 404 error
		    	//delete single duplicate
		    	Thread.sleep(1500);
		    	driver.findElement(By.xpath("/html/body/div/div[1]/div/section[2]/div/div/div[2]/div[4]/button")).click();
		    	Thread.sleep(1500);
		    	
		    	WebElement itemdrp = driver.findElement(By.xpath("//*[@id=\"selectItem_1\"]"));
		    	Select drpitem  = new Select(itemdrp);
		    	drpitem.selectByVisibleText("CUSTOMER VERIFICATION FORM");
		    	Thread.sleep(1500);
		    	WebElement branchdrp = driver.findElement(By.xpath("//*[@id=\"selectBranch_1\"]"));
		    	Select bdrp = new Select(branchdrp);
		    	bdrp.selectByVisibleText("Ernakulam");
		    	Thread.sleep(1500);
		    	
		    	driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[1]/div[3]/button[1]")).click(); 		    	
		    	
		    	driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"admin_log_table_wrapper\"]/div[2]/a[1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"admin_log_table_wrapper\"]/div[2]/a[2]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"admin_log_table_wrapper\"]/div[2]/a[3]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"admin_log_table_wrapper\"]/div[2]/a[5]")).click();
		Thread.sleep(1500);
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"admin_log_table_wrapper\"]/div[2]/a[4]")).click();
		Set<String> child = driver.getWindowHandles();
		
		for (String newwindow :child)
		{
			if(!newwindow.contentEquals(parent))
			{
				driver.switchTo().window(newwindow);
				System.out.println("succces");
			driver.close();
				
			}
			
				driver.switchTo().window(parent);
			
		}
		
		
		WebElement slno= driver.findElement(By.xpath("//*[@id=\"admin_log_table_wrapper\"]/div[5]/div[1]/div/table/thead/tr/th[1]"));
		act.click(slno).perform();
		Thread.sleep(1500);
		WebElement branchh = driver.findElement(By.xpath("//*[@id=\"admin_log_table_wrapper\"]/div[5]/div[1]/div/table/thead/tr/th[2]"));
		act.doubleClick(branchh).perform();
		Thread.sleep(1500);
		WebElement items = driver.findElement(By.xpath("//*[@id=\"admin_log_table_wrapper\"]/div[5]/div[1]/div/table/thead/tr/th[3]"));
		act.doubleClick(items).perform();
		Thread.sleep(1500);
		WebElement remarks = driver.findElement(By.xpath("//*[@id=\"admin_log_table_wrapper\"]/div[5]/div[1]/div/table/thead/tr/th[4]"));
		act.doubleClick(remarks).perform();
		Thread.sleep(1500);
		WebElement lastupdated = driver.findElement(By.xpath("//*[@id=\"admin_log_table_wrapper\"]/div[5]/div[1]/div/table/thead/tr/th[5]"));
		act.doubleClick(lastupdated).perform();
	
	 
		driver.findElement(By.xpath("/html/body/div/div[1]/div/section[2]/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(1500);
		WebElement itemdropp = driver.findElement(By.xpath("//*[@id=\"selectItem\"]"));
		Select dropitemss = new Select(itemdropp);
		dropitemss.selectByVisibleText("10 DAILY PASSBOOK");
		Thread.sleep(1500);
		
		driver.findElement(By.id("master_os")).sendKeys("29");
		Thread.sleep(1500);
		driver.findElement(By.id("master_avl_stock")).sendKeys("3");
		Thread.sleep(1500);
		driver.findElement(By.id("masterSubmitBtn")).click();
		Thread.sleep(1500);
		
		driver.navigate().back();
		
		Thread.sleep(1500);
		WebElement search = driver.findElement(By.xpath("//*[@id=\"admin_log_table_filter\"]/label/input"));
		act.moveToElement(search).click().sendKeys("ALAPPUZHA").perform();
		
		
		
	}
		
	}
	@AfterMethod
	public void aftadm()
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after the test of admin reports");
		 }else
		 {
			 System.out.println("not retured");
		 }	
	}
}
