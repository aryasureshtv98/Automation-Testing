package gentleman;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class gentlemanlogin {
ChromeDriver driver ;
	
	public gentlemanlogin (ChromeDriver maindriver) {
		this.driver =maindriver;
		
	}
	
	
	public void log() throws IOException, InterruptedException  
	{
		driver.manage().window().maximize();
		
		 
		FileInputStream excell = new FileInputStream("D:\\selenium 2\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(excell);
		XSSFSheet st = wb.getSheet("sheet1");
		Actions act = new Actions(driver);
		for(int i=0;i<=st.getLastRowNum();i++)
		{
			
			driver.findElement(By.name("username")).sendKeys(st.getRow(i).getCell(0).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys(st.getRow(i).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
			Thread.sleep(2000);	
			if (driver.getTitle().equalsIgnoreCase("GENTLEMAN"))
				
			{			
				WebElement box = driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li[1]/a"));
				act.moveToElement(box).click().perform();
				driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li[1]/ul/li[2]/div[2]/a")).click();
				System.out.println("login succcesfull");
			}else
			{
				System.out.println("login failed");
			}
			
		}
		
		
		
	}
	
}
