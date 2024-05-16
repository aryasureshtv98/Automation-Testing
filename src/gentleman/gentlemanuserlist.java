package gentleman;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gentlemanuserlist {

	ChromeDriver driver;
	public gentlemanuserlist (ChromeDriver maindriver) {
		this.driver=maindriver;
		
	}
	
	@BeforeMethod
	public void bfrusr()
	{
		driver.get("https://www.wahylab.com/gendemo/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@gentleman");
		driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"navi\"]/li[2]")).click();*/
		
		
		
		  }
	@Test
	public void usrlist() throws IOException, InterruptedException 
	{
	
	
	  FileInputStream usr = new FileInputStream("D:\\selenium 2\\userlist.xlsx");
		XSSFWorkbook usrwb = new XSSFWorkbook(usr);
		XSSFSheet  usrsh =  usrwb.getSheet("Sheet1");
		for(int i = 1 ;i<=usrsh.getLastRowNum();i++)
			

		{
			driver.findElement(By.xpath("//*[@id=\"navi\"]/li[2]")).click();
			
			
			 driver.findElement(By.xpath("//button[contains(text(),'Add user')]")).click();
			//act.moveToElement(button).click().perform();
			
			
			Thread.sleep(2000);
			if(usrsh.getRow(i).getCell(0) != null)
			
			 driver.findElement(By.name("username")).sendKeys(usrsh.getRow(i).getCell(0).getStringCellValue());
			 Thread.sleep(2000);
			
			
			if(usrsh.getRow(i).getCell(1) != null)
			driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(usrsh.getRow(i).getCell(1).getStringCellValue());
			Thread.sleep(2000);
			
			if(usrsh.getRow(i).getCell(2) != null)
			driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys(usrsh.getRow(i).getCell(2).getStringCellValue());
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//*[@id=\"branchSelect\"]")).sendKeys(usrsh.getRow(1).getCell(3).getStringCellValue());
			//Thread.sleep(2000);
			
			
		
		
		WebElement branch = driver.findElement(By.name("branch_id"));
		Select branchdetails = new Select(branch);
		branchdetails.selectByVisibleText(usrsh.getRow(i).getCell(3).getStringCellValue());
		
		WebElement type =  driver.findElement(By.xpath("//select[@id='user_type']"));
		Select typedetials = new Select(type) ;
		typedetials.selectByVisibleText(usrsh.getRow(i).getCell(4).getStringCellValue());
		
		driver.findElement(By.xpath("//button[contains(text(),'ADD USER')]")).click();
		Thread.sleep(2000);
		WebElement txt = driver.findElement(By.id("swal2-title"));	
	     txt.getText();
		
	     String exp = "Successfully added new user " +  usrsh.getRow(i).getCell(0).getStringCellValue();
	     
		   if(driver.findElement(By.id("swal2-title")).getText().equals(exp))
		   {
			   driver.findElement(By.xpath("/html/body/div[2]/div/div[10]/button[1]")).click();
				 System.out.println("New user added Sucessfully");
		   }else{
			   System.out.println("add user functionality failed");
		//driver.findElement(By.xpath("//button[contains(text(),'ADD USER')]")).click();
		
		///driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		}
		  }
		
		}
	@AfterMethod
	public void usrafm()
	{
		  driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		  if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
			 {
				 System.out.println("retured to dash board after the test of userlist");
			 }else
			 {
				 System.out.println("not retured");
			 }	
	}
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

