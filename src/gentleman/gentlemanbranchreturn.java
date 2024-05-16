package gentleman;

import java.util.Set;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class gentlemanbranchreturn {

	ChromeDriver driver;
	public gentlemanbranchreturn (ChromeDriver maindriver)
	{
		this.driver=maindriver;
		
	}
	@Test
	public void tstbranchreturn() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[22]/a")).click();//b r
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"requestTable_wrapper\"]/div[2]/a[1]")).click();//copy
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"requestTable_wrapper\"]/div[2]/a[2]")).click();//excell
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"requestTable_wrapper\"]/div[2]/a[3]")).click();//pdf
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"requestTable_wrapper\"]/div[2]/a[5]")).click();//csv
		Thread.sleep(1500);
		
		String fwindow = driver.getWindowHandle();
		driver .findElement(By.xpath("//*[@id=\"requestTable_wrapper\"]/div[2]/a[4]")).click();
		Set<String> swindow=driver.getWindowHandles();
		for (String allwindow : swindow)
		{
			if (!allwindow.equalsIgnoreCase(fwindow))
			{
			   System.out.println("secondwindow");
				driver.switchTo().window(allwindow);
				driver.close();
			}
		}
		
		driver.switchTo().window(fwindow);
		Thread.sleep(1500);
		//seaarch 
		Actions act = new Actions(driver);
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"requestTable_filter\"]/label/input"));
		act.moveToElement(search).click().sendKeys("Cherthala").perform();
		search.clear();
	}
	@AfterMethod
	public void aftbr()
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after the test of branch returns ");
		 }else
		 {
			 System.out.println("not retured");
		 }
	}

}
