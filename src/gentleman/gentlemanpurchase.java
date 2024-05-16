package gentleman;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gentlemanpurchase {

	
	ChromeDriver driver;
	
	public gentlemanpurchase(ChromeDriver maindriver)
	{
		this.driver=maindriver;
	}
	
	@BeforeMethod
	public void purcbfm()
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[5]")).click();//click of purchase
		//displaying purchase details
		if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		{
			System.out.println("succusfully enterd into the purchase page");
		}else 
		{
			System.out.println("fail to enter ");
			
		}
		
	}
	
	@Test
	public void purctst() throws InterruptedException
	{
	driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[2]/a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[2]/a[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[2]/a[3]")).click();//pdf
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[2]/a[5]")).click();//csv
	Thread.sleep(2000);
	
	//print
	String parentwindow = driver.getWindowHandle();
	driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[2]/a[4]")).click();
	Set<String>seconddetails=driver.getWindowHandles();
	for (String second : seconddetails)
	{
		if (! second .equalsIgnoreCase(parentwindow))
		{
			driver.switchTo().window(second);
			driver.close();
		}
	}
	driver.switchTo().window(parentwindow);
	Thread.sleep(2000);
	
	}
	@AfterMethod
	public void aftpur()
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after the test of purchase");
		 }else
		 {
			 System.out.println("not retured");
		 }	
	}
	
}
