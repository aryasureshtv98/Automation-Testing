package gentleman;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class gentlemanitemcategory {

	ChromeDriver driver;
	public gentlemanitemcategory (ChromeDriver maindriver)
	{
		this.driver=maindriver;
	}
	@Test
	public void tstic() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[7]/a")).click();
		//add category
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div[1]/div[2]/a/button")).click();
		driver.findElement(By.name("cate_name")).sendKeys("football");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/div[2]/div/input")).click();
		Thread.sleep(2000);
		//edit
		
		driver.findElement(By.xpath("//*[@id=\"designation_table\"]/tbody/tr[1]/td[3]/center/a[1]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cate_name\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"cate_name\"]")).sendKeys("mouse");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/div[2]/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"designation_table\"]/tbody/tr[1]/td[3]/center/a[2]/i")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
		@AfterMethod
		public void aftic()
		{
			driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
			 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
			 {
				 System.out.println("retured to dash board after the test of item category");
			 }else
			 {
				 System.out.println("not retured");
			 }	
		}

		
	}

