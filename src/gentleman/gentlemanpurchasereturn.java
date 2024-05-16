package gentleman;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class gentlemanpurchasereturn {

	ChromeDriver driver;
	public gentlemanpurchasereturn  (ChromeDriver maindriver)
	{
		this.driver = maindriver;
	}
	@Test
	public void tstpr () throws InterruptedException
	{
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[13]/a/span")).click();
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
				System.out.println("succces ");
			driver.close();
				
			}
			
				driver.switchTo().window(parent);
	}
		WebElement search = driver.findElement(By.xpath("//*[@id=\"designation_table_filter\"]/label/input"));
		act.moveToElement(search).click().sendKeys("100");
		Thread.sleep(1500);
		
	WebElement dropdown = driver.findElement(By.xpath("//body/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/select[1]"));
	Select drpvalue = new Select(dropdown);
	drpvalue.selectByVisibleText("100");
	}
	@AfterMethod
	public void aftpr()
	{
		Actions act1 = new Actions(driver);
		
		 driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after the test of purchase return");
		 }else
		 {
			 System.out.println("not retured");
		 }
		WebElement log = driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li[1]/a"));
		act1.moveToElement(log).click().perform();
		driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li[1]/ul/li[2]/div[2]/a")).click();
		 
		System.out.println("test completed and log out from the application");
	}
	}

