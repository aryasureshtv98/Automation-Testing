package gentleman;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class gentlemanbranchtobranch {

	
	ChromeDriver driver;
	public gentlemanbranchtobranch(ChromeDriver maindriver)
	{
		this.driver=maindriver;
	}
	
	@Test
	public void tstbb() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[21]/a/span")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[2]/a[1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[2]/a[2]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[2]/a[3]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[2]/a[5]")).click();
		Thread.sleep(1500);
		
		String pwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[2]/a[4]")).click();
		Set<String>secondw= driver.getWindowHandles();
		for (String mainw:secondw)
		{
			if (!mainw.equalsIgnoreCase(pwindow))
			{
				System.out.println("second window");
				driver.switchTo().window(mainw);
				driver.close();
			}
		}
		driver.switchTo().window(pwindow);
		Thread.sleep(1500);
		
		//slno
		WebElement slno= driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[5]/div[1]/div/table/thead/tr/th[1]"));
		slno.click();
		Thread.sleep(1500);
		slno.click();
		
		//approval
		
		WebElement approval = driver.findElement(By.xpath("//*[@id=\"designation_table_wrapper\"]/div[5]/div[1]/div/table/thead/tr/th[7]"));
		approval.click();
		Thread.sleep(1500);
		approval.click();
		
		Actions act = new  Actions(driver);
		
		WebElement search  = driver.findElement(By.xpath("//*[@id=\"designation_table_filter\"]/label/input"));
		search.sendKeys("PAPER ROLL DC MACHINE");
		search.clear();
		search.sendKeys("VOUCHER-CRD-COMPANY");
		search.clear();
		
		
		
	}
	@AfterMethod
	public void afbb()
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after the test of branch to branch");
		 }else
		 {
			 System.out.println("not retured");
		 }
	}
}
