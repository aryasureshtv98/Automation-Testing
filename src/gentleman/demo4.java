package gentleman;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.wahylab.com/gendemo/");
		driver.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("admin@gentleman");
		driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 WebElement dash = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
		 String str =dash.getText();
			driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a")).click();//designation
			 WebElement dg = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
			 
			if (dg.isDisplayed())
			{
				System.out.println("designation details is displayed ");
			}else
					
			{
				System.out.println("designation details is not displayed ");
			}
			 driver.navigate().back();
			if(str.equals("Dashboard"))
			{
				System.out.println("navigate back succes");
				}else {
				System.out.println("navigate back fail");
			}
			Thread.sleep(1500);
			 //items
			 
			 driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/a")).click();//items
			 WebElement itemss = driver.findElement(By.xpath("/html/body/div[1]/div/section[1]"));
			 
			if (itemss.isDisplayed())
			{
				System.out.println("Master Opening Stock Details is displayed ");
			}else
					
			{
				System.out.println("Master Opening Stock Details not displayed ");
			}
			 driver.navigate().back();
			if(str.equals("Dashboard"))
			{
				System.out.println("navigate back succes");
				}else {
				System.out.println("navigate back fail");
			}
			
			Thread.sleep(3000);
			//mutul branch transfer request
			
			 
			 driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/a")).click();//mutual branch
			 WebElement mbr = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
			 
			if (mbr.isDisplayed())
			{
				System.out.println("Branch To Branch Requests is displayed ");
			}else
					
			{
				System.out.println("Branch To Branch Requests not displayed ");
			}
			 driver.navigate().back();
			if(str.equals("Dashboard"))
			{
				System.out.println("navigate back succes");
				}else {
				System.out.println("navigate back fail");
			}
		 
		 System.out.println("succes");
		 Thread.sleep(3000);
		 //branchstock
		 driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[5]/div/a")).click();//branch stock request
		 WebElement stockreq = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
		 
		if (stockreq.isDisplayed())
		{
			System.out.println("Stock Request Details is displayed ");
		}else
				
		{
			System.out.println("Stock Request Details not displayed ");
		}
		 driver.navigate().back();
		if(str.equals("Dashboard"))
		{
			System.out.println("navigate back succes");
			}else {
			System.out.println("navigate back fail");
		}
	 
	 System.out.println("succes");
	 Thread.sleep(3000);
	 //branches
	 driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[6]/div/a")).click();//branches
	 WebElement branchdetails = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
	 
	if (branchdetails.isDisplayed())
	{
		System.out.println(" Branch Details is displayed ");
	}else
			
	{
		System.out.println("Stock Request Details not displayed ");
	}
	 driver.navigate().back();
	if(str.equals("Dashboard"))
	{
		System.out.println("navigate back succes");
		}else {
		System.out.println("navigate back fail");
	}
 
 System.out.println("succes");
 Thread.sleep(3000);
	 
 //categories
 
 driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[8]/div/a")).click();
 WebElement cat = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
 
	if (cat.isDisplayed())
	{
		System.out.println(" category Details is displayed ");
	}else
			
	{
		System.out.println("category details Details not displayed ");
	}
	 driver.navigate().back();
	if(str.equals("Dashboard"))
	{
		System.out.println("navigate back succes");
		}else {
		System.out.println("navigate back fail");
	}
 
 System.out.println("succes");
 Thread.sleep(3000);
 
 //total employees
 
 driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[9]/div/a")).click();
 WebElement EmployeeDetailss = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
 
	if (EmployeeDetailss.isDisplayed())
	{
		System.out.println(" Employee Details is displayed ");
	}else
			
	{
		System.out.println(" Employee Details not displayed ");
	}
	 driver.navigate().back();
	if(str.equals("Dashboard"))
	{
		System.out.println("navigate back succes");
		}else {
		System.out.println("navigate back fail");
	}
 
 System.out.println("succes");
	
 Thread.sleep(3000);
 //brnchreturns
 
 driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[10]/div/a")).click();
 WebElement branchret = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
 
	if (branchret.isDisplayed())
	{
		System.out.println(" Stock Return Details is displayed ");
	}else
			
	{
		System.out.println(" Stock Return Details not displayed ");
	}
	 driver.navigate().back();
	if(str.equals("Dashboard"))
	{
		System.out.println("navigate back succes");
		}else {
		System.out.println("navigate back fail");
	}
 
 System.out.println("succes");
	
 Thread.sleep(3000);
//vendors		
 
 driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[11]/div/a")).click();
 WebElement vendors = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
 
	if (vendors.isDisplayed())
	{
		System.out.println(" Vendor Details is displayed ");
	}else
			
	{
		System.out.println("  Vendor Details not displayed ");
	}
	 driver.navigate().back();
	if(str.equals("Dashboard"))
	{
		System.out.println("navigate back succes");
		}else {
		System.out.println("navigate back fail");
	}
 
 System.out.println("succes");
	
 Thread.sleep(3000);
 
 
 driver.findElement(By.xpath(" /html/body/div/div[1]/section[2]/div/div[12]/div/a")).click();
 WebElement rop = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
 
	if (rop.isDisplayed())
	{
		System.out.println(" rop Details is displayed ");
	}else
			
	{
		System.out.println("  rop Details not displayed ");
	}
	 driver.navigate().back();
	if(str.equals("Dashboard"))
	{
		System.out.println("navigate back succes");
		}else {
		System.out.println("navigate back fail");
	}
 
 System.out.println("succes");
	
 Thread.sleep(3000);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
