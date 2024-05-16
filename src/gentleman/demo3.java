package gentleman;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demo3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.wahylab.com/gendemo/");
		driver.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("admin@gentleman");
		driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
		
		FileInputStream emp1 = new FileInputStream("D:\\selenium 2\\employee.xlsx");
		XSSFWorkbook empwb = new XSSFWorkbook(emp1);
		XSSFSheet empsh = empwb.getSheet("Sheet1");
		for(int i = 1 ;i<=empsh.getLastRowNum();i++)
		{
			driver.findElement(By.xpath("//*[@id=\"navi\"]/li[10]/a")).click();
			driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div[1]/div[2]/a/button")).click();
			
			//dropdown of branch name 
			WebElement branchname = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/div[1]/div/select"));
			Select drp1 = new Select(branchname);
			drp1.selectByVisibleText(empsh.getRow(i).getCell(0).getStringCellValue());
			
			//designation drop
			
			WebElement designationname=  driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/div[2]/div/select"));
			Select drp2 = new Select(designationname);
			drp2.selectByVisibleText(empsh.getRow(i).getCell(1).getStringCellValue());
			
			driver.findElement(By.name("emp_name")).sendKeys(empsh.getRow(i).getCell(2).getStringCellValue());
			driver.findElement(By.name("emp_address")).sendKeys(empsh.getRow(i).getCell(3).getStringCellValue());
			Actions act = new Actions(driver);
			
			//phone no
			/*Row numrow= empsh.getRow(i);
			Cell numcell = numrow.getCell(4);
			int numfield = (int) numcell.getNumericCellValue();
			WebElement numf = driver.findElement(By.name("emp_phone"));
			numf.sendKeys(Long.toString(numfield));*/
			
			Row numrow= empsh.getRow(i);
			Cell numcell = numrow.getCell(4);
			String numdata = NumberToTextConverter.toText(numcell.getNumericCellValue());
			WebElement numf = driver.findElement(By.name("emp_phone"));
			act.moveToElement(numf).click().sendKeys(numdata).perform();
			Thread.sleep(1500);
			
					/*XSSFRow row = sheet.getRow(i);
        XSSFCell cell = row.getCell(1);
        String numericData = NumberToTextConverter.toText(cell.getNumericCellValue());
        WebElement p = driver.findElement(By.id("ctl00_CPHContainer_txtPassword"));
        a.moveToElement(p).click().sendKeys(numericData).perform();
        Thread.sleep(1000);*/
			
			driver.findElement(By.name("emp_mail")).sendKeys(empsh.getRow(i).getCell(5).getStringCellValue());
			//save
			driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/div[7]/div/input")).click();
			
		}
		Thread.sleep(2000);
		
		WebElement show = driver.findElement(By.xpath("//*[@id=\"designation_table_length\"]/label/select"));
		Select drp3 = new Select(show);
		drp3.selectByVisibleText("400");
		
		Thread.sleep(2000);
		
		JavascriptExecutor scrolld = (JavascriptExecutor) driver;
		scrolld.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		scrolld.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
}
