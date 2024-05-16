package gentleman;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class gentlemanreports {

	ChromeDriver driver;
	public gentlemanreports (ChromeDriver maindriver)
	{
		this.driver=maindriver;
		
	}
	@Test
	public void tstrep() throws InterruptedException, IOException
	{
		driver.manage().window().maximize();
		FileInputStream purrep = new FileInputStream("D:\\selenium 2\\Purchase report.xlsx");
		XSSFWorkbook purwb = new XSSFWorkbook(purrep);
		XSSFSheet purshh = purwb.getSheet("Sheet1");
		for (int i=1 ;i<=purshh.getLastRowNum();i++)
		{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[23]/a")).click();	
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[23]/ul/li[1]/a/span")).click();
		Actions act = new Actions(driver);
		Thread.sleep(1500);		

		//fromdate
	driver.findElement(By.xpath("//input[@id='pmsDateStart']")).sendKeys("11022022");
		Thread.sleep(1500);
		//todate
		driver.findElement(By.xpath("//input[@id='pmsDateEnd']")).sendKeys("02022023");
		Thread.sleep(1500);
		driver.findElement(By.id("search")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//span[contains(text(),'Copy')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[contains(text(),'Excel')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[contains(text(),'PDF')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[contains(text(),'CSV')]")).click();
		Thread.sleep(1500);
		
		//print
		String pwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[contains(text(),'Print')]")).click();
		Set<String>swindow = driver.getWindowHandles();
		for(String newwindow : swindow)
		{
			if(!pwindow.contentEquals(newwindow))
			{
				System.out.println("new window");
				driver.switchTo().window(newwindow);
				driver.close();
				}
			}
		driver.switchTo().window(pwindow);
		
		
		
		
	}
	
	}
	@AfterMethod
	public void aftrep()
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after the test in purchase report in reports ");
		 }else
		 {
			 System.out.println("not retured");
		 }	
	}
}
