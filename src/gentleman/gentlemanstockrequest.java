package gentleman;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class gentlemanstockrequest {

	ChromeDriver driver;
	public gentlemanstockrequest (ChromeDriver maindriver)
	{
		this.driver=maindriver;
		
	}
	@Test
	public void tstsr() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[20]/a/i")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"requestTable_wrapper\"]/div[2]/a[1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"requestTable_wrapper\"]/div[2]/a[2]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"requestTable_wrapper\"]/div[2]/a[3]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"requestTable_wrapper\"]/div[2]/a[3]")).click();
		
		
		JavascriptExecutor scrolld = (JavascriptExecutor) driver;
		scrolld.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//*[@id=\"requestTable_next\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"requestTable_paginate\"]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"requestTable_paginate\"]/ul/li[2]/a")).click();
		Thread.sleep(1500);
		scrolld.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	@AfterMethod
	public void aftsr()
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after the test in the page of stockrequest ");
		 }else
		 {
			 System.out.println("not retured");
		 }
	}
	
}
