package gentleman;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gentlemanvendorpayment {

	
	ChromeDriver driver;
	public gentlemanvendorpayment (ChromeDriver mainDriver)
	{
		this.driver = mainDriver;
		
	}
	
	
	@BeforeMethod
	public void vendpaybfm()
	
	{
		driver.findElement(By.xpath("//*[@id=\"navi\"]/li[4]/a")).click();
		
		WebElement head= driver.findElement(By.xpath("/html/body/div/div[1]/section[1]"));
		if (head.isDisplayed())
		{
			System.out.println("head text is" + head.getText());
		}else {
			System.out.println("fail to enter the page ");
		};
	}
	
	@Test
	public void testvendpay() throws InterruptedException
	{
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vendor_pay_wrapper\"]/div[2]/a[1]")).click();//copy
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vendor_pay_wrapper\"]/div[2]/a[2]")).click();//excell
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vendor_pay_wrapper\"]/div[2]/a[3]")).click();//pdf
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vendor_pay_wrapper\"]/div[2]/a[5]")).click();
	Thread.sleep(3000);
	
	//print
	String parentwindow = driver.getWindowHandle();// stored the details of parent window
	 driver.findElement(By.xpath("//*[@id=\"vendor_pay_wrapper\"]/div[2]/a[4]")).click();

		Set<String> secondwindowhandles =driver.getWindowHandles();
	 for(String handle : secondwindowhandles)
	 {
		 if(!handle.equalsIgnoreCase(parentwindow)) {
				driver.switchTo().window(handle);
				driver.close();
				 }
}
	 driver.switchTo().window(parentwindow);
	 
	 Thread.sleep(3000);
	 //search
	
	
		
		WebElement search= driver.findElement(By.xpath("//*[@id=\"vendor_pay_filter\"]/label/input"));
		act.moveToElement(search).click().perform();
		search.sendKeys("AS PAPER MART");
		driver.findElement(By.xpath("//*[@id=\"vendor_pay_filter\"]/label/input")).clear();
		 
		Thread.sleep(3000);
		
		
	}
	@AfterMethod
	public void aftvenpay()
	{
		 driver.findElement(By.xpath("//*[@id=\"navi\"]/li[1]/a")).click();
		 if (driver.findElement(By.xpath("/html/body/div/div[1]/section[1]")).isDisplayed())
		 {
			 System.out.println("retured to dash board after the test of vendorpayment");
		 }else
		 {
			 System.out.println("not retured");
		 }
	}

	}

	 
	 
	 
	 
	 
	 
	 

