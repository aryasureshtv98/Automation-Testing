package gentleman;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class gentlemanopeningstock {

	ChromeDriver driver;
	public gentlemanopeningstock (ChromeDriver maindriver)
	{
		this.driver = maindriver;
		
	}
	@Test
	public void tstos() throws InterruptedException
	{
		//driver.findElement(By.xpath("")).click();
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[11]/a")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[2]/a[1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[2]/a[2]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[2]/a[3]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[2]/a[5]")).click();
		

		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[2]/a[4]")).click();
		Set<String> child = driver.getWindowHandles();
		
		for (String newwindow :child)
		{
			if(!newwindow.contentEquals(parent))
			{
				driver.switchTo().window(newwindow);
				System.out.println("succces");
			driver.close();
				
			}
			
				driver.switchTo().window(parent);
	}
		WebElement search = driver.findElement(By.xpath("//*[@id=\"designation_table_filter\"]/label/input"));
		act.moveToElement(search).click().sendKeys("65");
		Thread.sleep(1500);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(text(),'Previous')]")).click();
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	@AfterMethod
	public void aftos()
	{
		 driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after the test of opening stock");
		 }else
		 {
			 System.out.println("not retured");
		 }
	}
}
