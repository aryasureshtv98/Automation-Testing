package gentleman;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class excellwork {
public static void main(String[] args) throws IOException, InterruptedException {
	

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.wahylab.com/gendemo/");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin@gentleman");
	 Actions act = new Actions(driver);
	  driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
	  
	  
	  WebElement usrlist = driver.findElement(By.xpath("//body/div[1]/aside[1]/section[1]/ul[1]/li[2]/a[1]"));
	  act.moveToElement(usrlist).click().perform();
	  
	  
	  WebElement userbox = driver.findElement(By.xpath("//button[contains(text(),'Add user')]"));
	  act.moveToElement(userbox).click().perform();
	  
	  

	  FileInputStream usr = new FileInputStream("D:\\selenium 2\\userlist.xlsx");
		XSSFWorkbook usrwb = new XSSFWorkbook(usr);
		XSSFSheet  usrsh =  usrwb.getSheet("Sheet1");
		for(int i = 1 ;i<=usrsh.getLastRowNum();i++)
		{
			driver.findElement(By.xpath("//input[@id='username1']")).sendKeys(usrsh.getRow(1).getCell(0).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(usrsh.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys(usrsh.getRow(1).getCell(2).getStringCellValue());
			Thread.sleep(2000);
			
			
			
		}
		
		
		WebElement branch = driver.findElement(By.xpath("//select[@id='branchSelect']"));
		Select branchdetails = new Select(branch);
		branchdetails.selectByVisibleText("Ernakulam");
		
		
		WebElement type =  driver.findElement(By.xpath("//select[@id='user_type']"));
		Select typedetials = new Select(type) ;
		typedetials.selectByVisibleText("USER");
		
		driver.findElement(By.xpath("//button[contains(text(),'ADD USER')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		
		driver.findElement(By.xpath("//body/div[1]/aside[1]/section[1]/ul[1]/li[3]/a[1]")).click();
		  
	  

	 
}

}
	
	
	

