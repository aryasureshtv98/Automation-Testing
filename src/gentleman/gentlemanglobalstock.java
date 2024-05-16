package gentleman;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class gentlemanglobalstock {

	ChromeDriver driver;
	public gentlemanglobalstock (ChromeDriver maindriver)
	{
		this.driver=maindriver;
		
	}
	@Test
	public void tstgs() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[18]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"json\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"csv\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"pdf\"]")).click();
		
		Thread.sleep(2000);
		JavascriptExecutor scrolld = (JavascriptExecutor) driver;
		scrolld.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		scrolld.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
	}
	@AfterMethod
	public void aftgs()
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after the test of globel stock");
		 }else
		 {
			 System.out.println("not retured");
		 }	
	}
}
