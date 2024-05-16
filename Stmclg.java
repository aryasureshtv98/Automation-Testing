package stmc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Stmclg {
	WebDriver driver;
  @Test
  public void STC () throws Exception {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    driver.get("https://stthomas.ac.in/");
		driver.manage().window().maximize();
	  
		//Navigation 'JOURNALS'
	    driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/section[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[1]/a[1]/span[1]")).click();
	    Thread.sleep(3000);
	    
	    //Navigation 'About Research Advisory Council'
	    driver.findElement(By.xpath("//span[contains(text(),'About Research Advisory Council')]")).click();
	    //Click button'Doctor of Philosophy (PhD) Awardees of St.Thomas College(Aotonomous), Thrissur'
	    Actions hover1=new Actions(driver);
	    WebElement button1=driver.findElement(By.xpath("//span[contains(text(),'Doctor of Philosophy (PhD) Awardees of St.Thomas C')]"));
	    hover1.moveToElement(button1).click().perform();
	    js.executeScript("argument[0].scrollIntoView();", button1);
	    Thread.sleep(6000);
	    //driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/h4[1]/a[1]")).click(); 
	    //Click link 'Directorate of Research, University of Calicut'
	    Actions hover2=new Actions(driver);
	    WebElement link1=driver.findElement(By.xpath("//a[contains(text(),'Directorate of Research, University of Calicut')]"));
	    hover2.moveToElement(link1).click().perform();
	    Set<String>totalwindow1=driver.getWindowHandles();
    	Iterator<String>window1=totalwindow1.iterator();
    	while(window1.hasNext())
    	{
    		String firstwindow1=window1.next();
    		String secondwindow1=window1.next();
    		driver.switchTo().window(firstwindow1);
    		driver.switchTo().window(secondwindow1);
    		Thread.sleep(10000);
    		driver.switchTo().window(firstwindow1);
    		Thread.sleep(1000);
    	}
    	Thread.sleep(4000);
    	//Navigation 'Research Advisory Council Members' 
	    driver.findElement(By.xpath("//span[contains(text(),'Research Advisory Council Members')]")).click();
	    Thread.sleep(2000);
	    //Navigation 'Research Centres'
	    driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")).click();
	    Thread.sleep(2000);
	    //Click on all the toggle buttons under 'RESEARCH GUIDES'
	    Actions hover3=new Actions(driver);
	    WebElement eng=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement chem=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement zoo=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement comm=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement stat=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement eco=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement math=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement bot=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement phy=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement com=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
        hover3.moveToElement(eng).click().perform();
        js.executeScript("argument[0].scrollIntoView();", eng);
        Thread.sleep(2000);
        hover3.moveToElement(chem).click().perform(); 
        js.executeScript("argument[0].scrollIntoView();", chem);
        Thread.sleep(2000);
        hover3.moveToElement(zoo).click().perform(); 
        js.executeScript("argument[0].scrollIntoView();", zoo);
        Thread.sleep(2000);
        hover3.moveToElement(comm).click().perform(); 
        js.executeScript("argument[0].scrollIntoView();", comm);
        Thread.sleep(2000);
        hover3.moveToElement(stat).click().perform();
        js.executeScript("argument[0].scrollIntoView();", stat);
        Thread.sleep(2000);
        hover3.moveToElement(eco).click().perform();
        js.executeScript("argument[0].scrollIntoView();", eco);
        Thread.sleep(2000);
        hover3.moveToElement(math).click().perform();
        js.executeScript("argument[0].scrollIntoView();", math);
        Thread.sleep(2000);
        hover3.moveToElement(bot).click().perform();
        js.executeScript("argument[0].scrollIntoView();", bot);
        Thread.sleep(2000);
        hover3.moveToElement(phy).click().perform(); 
        js.executeScript("argument[0].scrollIntoView();", phy);
        Thread.sleep(2000);
        hover3.moveToElement(com).click().perform(); 
        js.executeScript("argument[0].scrollIntoView();", com);
        Thread.sleep(2000);
        //Click on all the toggle buttons under 'RESEARCH SCHOLARS'     
        Actions hover4=new Actions(driver);
	    WebElement eng1=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement chem1=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement zoo1=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement comm1=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement stat1=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement eco1=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement math1=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement bot1=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement phy1=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
	    WebElement com1=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
        hover4.moveToElement(eng1).click().perform();
        js.executeScript("argument[0].scrollIntoView();", eng1);
        Thread.sleep(2000);
        hover4.moveToElement(chem1).click().perform();
        js.executeScript("argument[0].scrollIntoView();", chem1);
        Thread.sleep(2000);
        hover4.moveToElement(zoo1).click().perform();
        js.executeScript("argument[0].scrollIntoView();", zoo1);
        Thread.sleep(2000);
        hover4.moveToElement(comm1).click().perform();
        js.executeScript("argument[0].scrollIntoView();", comm1);
        Thread.sleep(2000);
        hover4.moveToElement(stat1).click().perform();
        js.executeScript("argument[0].scrollIntoView();", stat1);
        Thread.sleep(2000);
        hover4.moveToElement(eco1).click().perform(); 
        js.executeScript("argument[0].scrollIntoView();", eco1);
        Thread.sleep(2000);
        hover4.moveToElement(math1).click().perform(); 
        js.executeScript("argument[0].scrollIntoView();", math1);
        Thread.sleep(2000);
        hover4.moveToElement(bot1).click().perform(); 
        js.executeScript("argument[0].scrollIntoView();", bot1);
        Thread.sleep(2000);
        hover4.moveToElement(phy1).click().perform(); 
        js.executeScript("argument[0].scrollIntoView();", phy1);
        Thread.sleep(2000);
        hover4.moveToElement(com1).click().perform(); 
        js.executeScript("argument[0].scrollIntoView();", com1);
        Thread.sleep(2000);
        //Click on toggle button 'TITLE OF THESIS'
        Actions hover5=new Actions(driver);
	    WebElement tit=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
        hover5.moveToElement(tit).click().perform();
        Thread.sleep(2000);
        //Click on button 'DATA CAPTURING LINK FOR RESEARCH SCHOLARS'
        Actions hover6=new Actions(driver);
	    WebElement button2=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h4[1]/a[1]"));
        hover6.moveToElement(button2).click().perform();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);                   
        //Navigation 'PhD Orders & Circulars'
       driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/nav[1]/ul[1]/li[4]/a[1]/span[1]")).click();
        Thread.sleep(3000);
        //Click on link 'Directorate of Admission, University of Calicut'
        Actions hover7=new Actions(driver);
        WebElement link2=driver.findElement(By.xpath("//a[contains(text(),'Directorate of Admission, University of Calicut')]"));
        hover7.moveToElement(link2).click().perform();
        Set<String>totalwindow2=driver.getWindowHandles();
    	Iterator<String>window2=totalwindow2.iterator();
    	while(window2.hasNext())
    	{
    		String firstwindow2=window2.next();
    		String secondwindow2=window2.next();
    		driver.switchTo().window(firstwindow2);
    		driver.switchTo().window(secondwindow2);
    		Thread.sleep(10000);
    		driver.close();
    		driver.switchTo().window(firstwindow2);
    		Thread.sleep(1000);
    	}
    	Thread.sleep(4000);
    	//Click button 'Click Here to download all applications & Forms from DoR, University of Calicut'
        Actions hover8=new Actions(driver);
        WebElement button3=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[11]/a[1]"));
        hover8.moveToElement(button3).click().perform();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(2000);
        //Click button 'Plagiarism Check Policy 2019'
        Actions hover9=new Actions(driver);
        WebElement button4=driver.findElement(By.xpath("//span[contains(text(),'Plagiarism Check Policy 2019')]"));
        hover9.moveToElement(button4).click().perform();
        Thread.sleep(2000);
        //Click button 'Research Regulations 2019'
        Actions hover10=new Actions(driver);
        WebElement button5=driver.findElement(By.xpath("//span[contains(text(),'Research Regulations 2019')]"));
        hover10.moveToElement(button5).click().perform();
        Thread.sleep(2000);
        //Click on link 'Directorate of Research, University of Calicut'
        Actions hover11=new Actions(driver);
        WebElement link3=driver.findElement(By.xpath("//a[contains(text(),'Directorate of Research, University of Calicut')]"));
        hover11.moveToElement(link3).click().perform();
    	Set<String>totalwindow3=driver.getWindowHandles();
    	Iterator<String>window3=totalwindow3.iterator();
    	while(window3.hasNext())
    	{
    		String firstwindow3=window3.next();
    		String secondwindow3=window3.next();
    		Thread.sleep(4000);
    		driver.switchTo().window(secondwindow3);
    		Thread.sleep(4000);
    		driver.switchTo().window(firstwindow3);
    		Thread.sleep(1000);
    	}
    	Thread.sleep(2000);         
    	//Navigation 'Research Regulations'
  	driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/nav[1]/ul[1]/li[5]/a[1]/span[1]")).click();
    	Thread.sleep(2000);
    	//Click link 'Directorate of Research, University of Calicut'
    	Actions hover12=new Actions(driver);
        WebElement link4=driver.findElement(By.xpath("//a[contains(text(),'Directorate of Research, University of Calicut')]"));
        hover12.moveToElement(link4).click().perform();
        Thread.sleep(2000);
        Set<String>totalwindow4=driver.getWindowHandles();
    	Iterator<String>window4=totalwindow4.iterator();
    	while(window4.hasNext())
    	{
    		String firstwindow4=window4.next();
    		String secondwindow4=window4.next();
    		driver.switchTo().window(firstwindow4);
    		driver.switchTo().window(secondwindow4);
    		driver.close();
    		driver.switchTo().window(firstwindow4);
    		Thread.sleep(1000);
    	}
    	Thread.sleep(3000);
    	//Click button 'Plagiarism Check Policy 2019'
    	Actions hover13=new Actions(driver);
 	    WebElement button6=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/a[1]"));
        hover13.moveToElement(button6).click().perform();
        Thread.sleep(3000);
        //Click button 'Research Regulations'
        Actions hover14=new Actions(driver);
 	    WebElement button7=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/a[1]"));
        hover14.moveToElement(button7).click().perform();
        Thread.sleep(3000);
	    //Click on link 'Click here'
        Actions hover15=new Actions(driver);
 	    WebElement link5=driver.findElement(By.xpath("//a[contains(text(),'click here')]"));
        hover15.moveToElement(link5).click().perform(); 
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);         
        
        //Navigation 'Research Policies'
        driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/nav[1]/ul[1]/li[6]/a[1]/span[1]")).click();
        Thread.sleep(2000);
        //Click on all the toggle buttons under research policies'
        Actions hover16=new Actions(driver);
	    WebElement rpp=driver.findElement(By.xpath("//span[contains(text(),'RESEARCH PROMOTION POLICY')]"));
	    hover16.moveToElement(rpp).click().perform();
        Thread.sleep(1000);
        hover16.moveToElement(rpp).click().perform();
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(1000);
	    WebElement pcp=driver.findElement(By.xpath("//span[contains(text(),'PLAGIARISM CHECK POLICY')]"));
	    hover16.moveToElement(pcp).click().perform(); 
        Thread.sleep(1000);
        hover16.moveToElement(pcp).click().perform();
        js.executeScript("window.scrollBy(0,250)", "");        
        Thread.sleep(1000);
	    WebElement srgp=driver.findElement(By.xpath("//span[contains(text(),'SANTHOME RESEARCH (SEED MONEY) GRANT POLICY')]"));
	    hover16.moveToElement(srgp).click().perform(); 
        Thread.sleep(1000);
        hover16.moveToElement(srgp).click().perform();
        js.executeScript("window.scrollBy(0,250)", "");        
        Thread.sleep(1000);
	    WebElement rep=driver.findElement(By.xpath("//span[contains(text(),'RESEARCH ETHICS POLICY')]"));
	    hover16.moveToElement(rep).click().perform(); 
        Thread.sleep(1000);
        hover16.moveToElement(rep).click().perform();
        js.executeScript("window.scrollBy(0,250)", "");        
        Thread.sleep(1000);
	    WebElement cp=driver.findElement(By.xpath("//span[contains(text(),'CONSULTANCY POLICY')]"));     
	    hover16.moveToElement(cp).click().perform(); 
        Thread.sleep(1000);
        hover16.moveToElement(cp).click().perform();
        js.executeScript("window.scrollBy(0,250)", "");        
        Thread.sleep(2000);
	  
        //Navigation 'Research Advisory Committee'
        js.executeScript("window.scrollBy(0,-500)");
	    Actions hover17=new Actions(driver);
	    WebElement nav1=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/nav[1]/ul[1]/li[7]/a[1]/span[1]"));
	    //nav1.click();
	    hover17.moveToElement(nav1).click().perform();
	    Thread.sleep(2000);    
	    
	    //Navigation 'Research Programmes'
        js.executeScript("window.scrollBy(0,-500)");
	    Actions hover18=new Actions(driver);
	    WebElement nav2=driver.findElement(By.xpath("//span[contains(text(),'Research Programmes')]"));
	    //nav2.click();
	    hover18.moveToElement(nav2).click().perform();
	    Thread.sleep(2000);
	    //Click on the link icon 1
	    Actions hover19=new Actions(driver);
	    WebElement icon1=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/article[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]"));
	    hover19.moveToElement(icon1).click().perform();
	    Thread.sleep(2000);
	    //Click on 'Deep – Morpho Algorithm (DMA) for medicinal leaves features extraction'
	    Actions hover20=new Actions(driver);
	    WebElement link6=driver.findElement(By.xpath("//a[contains(text(),'Deep – Morpho Algorithm (DMA) for medicinal leaves')]"));
	    hover20.moveToElement(link6).click().perform();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    //Click on link 'Research-seminar'
	   Actions hover21=new Actions(driver);
	    WebElement link7=driver.findElement(By.xpath("//a[contains(text(),'Research-seminar')]"));
	    hover21.moveToElement(link7).click().perform();
	    Thread.sleep(2000);
	    //Click on 'Deep – Morpho Algorithm (DMA) for medicinal leaves features extraction'
	    driver.findElement(By.linkText("Deep – Morpho Algorithm (DMA) for medicinal leaves features extraction")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    //Click on 'National Seminar on Intersections: Advances in Interdisciplinary Research & Research Scholars’ Meet: 24-25 Feb 2023'
	    driver.findElement(By.linkText("National Seminar on Intersections: Advances in Interdisciplinary Research & Research Scholars’ Meet: 24-25 Feb 2023")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    //Click on 'A Seminar on ‘Getting Your Manuscript Published’, 06.12.2022'
	    js.executeScript("window.scrollBy(0,500)");
	    driver.findElement(By.linkText("A Seminar on ‘Getting Your Manuscript Published’, 06.12.2022")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    //Click on 'RESEARCH AND PUBLICATION ETHICS COURSE 2022'
	    driver.findElement(By.linkText("RESEARCH AND PUBLICATION ETHICS COURSE 2022")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    //Click on 'Research Scholars & Guides Meeting, 24.08.2022, Menachery Hall'
	    js.executeScript("window.scrollBy(0,800)");
	    driver.findElement(By.linkText("Research Scholars & Guides Meeting, 24.08.2022, Menachery Hall")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    //Click on 'Workshop on Research Reference for Faculty & Research Scholars'
	    driver.findElement(By.linkText("Workshop on Research Reference for Faculty & Research Scholars")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    //Click on 'National Seminar on Interdisciplinary Research Approaches & Research Scholars Meet – 2022'
	    driver.findElement(By.linkText("National Seminar on Interdisciplinary Research Approaches & Research Scholars Meet – 2022")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    //Click on 'Webinar on “Seeding an innovation culture in the college”, IEDC, STC'
	    driver.findElement(By.linkText("Webinar on “Seeding an innovation culture in the college”, IEDC, STC")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    //Click on 'Workshop & Trainig on TURNITIN-iThenticate User Workflow on Thursday, December 16, 2021 at 2 pm.- 3 pm, Online Platform: Zoom, Offline Training at Menachery Hall'
	    js.executeScript("window.scrollBy(0,500)");
	    driver.findElement(By.linkText("Workshop & Trainig on TURNITIN-iThenticate User Workflow on Thursday, December 16, 2021 at 2 pm.- 3 pm, Online Platform: Zoom, Offline Training at Menachery HallC")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    //Click on 'Inauguration of online course on Research and Publication Ethics Course 2021'
	    driver.findElement(By.linkText("Inauguration of online course on Research and Publication Ethics Course 2021")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();    
	    
	    //Navigation 'JOURNALS'
	  //  driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/section[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[1]/a[1]/span[1]")).click();
	   // Thread.sleep(3000);
	    //Navigation 'Research Programmes'
        js.executeScript("window.scrollBy(0,-500)");
	    Actions hover22=new Actions(driver);
	    WebElement nav3=driver.findElement(By.xpath("//span[contains(text(),'Research Programmes')]"));
	    hover22.moveToElement(nav3).click().perform();
	    Thread.sleep(2000);
	    //Click on the link icon 1
	    Actions hover23=new Actions(driver);
	    WebElement icon2=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/article[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[2]"));
	    hover23.moveToElement(icon2).click().perform();
	    Thread.sleep(2000);
	    Actions hover24=new Actions(driver);
	         //Click on right arrow
	         /* WebElement icon3=driver.findElement(By.xpath("//body/div[20]/div[1]/div[1]/div[2]/img[1]"));
	         hover24.moveToElement(icon3).click().perform();
	         Thread.sleep(2000);
	         hover24.moveToElement(icon3).click().perform();
	         Thread.sleep(2000);
	         WebElement icon4=driver.findElement(By.xpath("//body[1]/a[4]/span[1]"));
	         hover24.moveToElement(icon4).click().perform();
	         Thread.sleep(2000);
	         hover24.moveToElement(icon4).click().perform();
	         Thread.sleep(2000);    */
	   WebElement icon5=driver.findElement(By.className("ilightbox-play"));
	    hover24.moveToElement(icon5).click().perform();
	    Thread.sleep(8000);
	    hover24.moveToElement(icon5).click().perform();
	    Thread.sleep(2000);
	    WebElement icon6=driver.findElement(By.className("ilightbox-fullscreen"));
	    hover24.moveToElement(icon6).click().perform();
	    Thread.sleep(2000);
	    hover24.moveToElement(icon6).click().perform();
	    Thread.sleep(2000);
	    WebElement icon7=driver.findElement(By.className("ilightbox-close"));
	    hover24.moveToElement(icon7).click().perform();
	    Thread.sleep(2000);      
	    //Click on 'Deep – Morpho Algorithm (DMA) for medicinal leaves features extraction'
	    driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/article[1]/div[3]/h2[1]/a[1]")).click();
	    Thread.sleep(2000);    
	    //link1
    WebElement link8=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]"));
	    Actions hover25=new Actions(driver);
	    hover25.moveToElement(link8).click().perform();
	    Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    //link2
	    WebElement link9=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/ul[1]/li[2]/a[1]"));
	    Actions hover26=new Actions(driver);
	    hover26.moveToElement(link9).click().perform();
	    Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    //link3
	    WebElement link10=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/ul[1]/li[3]/a[1]"));
	    Actions hover27=new Actions(driver);
	    hover27.moveToElement(link10).click().perform();
	    Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    //link4
	    WebElement link11=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/ul[1]/li[4]/a[1]"));
	    Actions hover28=new Actions(driver);
	    hover28.moveToElement(link11).click().perform();
	    Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(2000);            
	    //link5
	    WebElement link12=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/ul[1]/li[5]/a[1]"));
	    Actions hover29=new Actions(driver);
	    hover29.moveToElement(link12).click().perform();
	    Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);           
	    
	    //Navigation 'Research Ethics'
	    js.executeScript("window.scrollBy(0,500)");
	    driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/nav[1]/ul[1]/li[9]/a[1]/span[1]")).click();
	    Thread.sleep(2000);
	    WebElement link13=driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/a[1]"));
	    Actions hover30=new Actions(driver);
	    hover30.moveToElement(link13).click().perform();
	    Thread.sleep(3000);
	    Set<String>totalwindow5=driver.getWindowHandles();
    	Iterator<String>window5=totalwindow5.iterator();
    	while(window5.hasNext())
    	{
    		String firstwindow5=window5.next();
    		String secondwindow5=window5.next();
    		driver.switchTo().window(firstwindow5);
    		driver.switchTo().window(secondwindow5);
    		driver.close();
    		driver.switchTo().window(firstwindow5);
    		Thread.sleep(1000);
    	}
    	Thread.sleep(2000);
    	//Navigation ' Research and Publication Ethics 2021"
    	js.executeScript("window.scrollBy(0,-800)");
    	driver.findElement(By.xpath("//span[contains(text(),'Research and Publication Ethics 2021')]")).click();
    	//Click on 'Click here'
    	Thread.sleep(3000);
    	js.executeScript("window.scrollBy(0,5000)");
    	driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[2]/b[1]/a[1]")).click();
    	Thread.sleep(2000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	//NAvigation ' Research and Publication Ethics 2020'
    	js.executeScript("window.scrollBy(0,-4500)");
    	driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/nav[1]/ul[1]/li[11]/a[1]/span[1]")).click();
    	//Click on 'Click here'
    	Thread.sleep(3000);
    	js.executeScript("window.scrollBy(0,5250)");
    	driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[8]/div[2]/b[1]/a[1]")).click();
    	Thread.sleep(2000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	//Navigation 'Consultancy'
    	js.executeScript("window.scrollBy(0,-4500)");
    	driver.findElement(By.xpath("//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/nav[1]/ul[1]/li[12]/a[1]/span[1]")).click();
    	Thread.sleep(2000);
    	Actions hover31=new Actions(driver);
    	WebElement link14=driver.findElement(By.xpath("//span[contains(text(),'Consultancy Application Form')]"));
    	hover31.moveToElement(link14).click().perform();
    	Set<String>totalwindow6=driver.getWindowHandles();
    	Iterator<String>window6=totalwindow6.iterator();
    	while(window6.hasNext())
    	{
    		String firstwindow6=window6.next();
    		String secondwindow6=window6.next();
    		driver.switchTo().window(firstwindow6);
    		Thread.sleep(2000);
    		driver.switchTo().window(secondwindow6);
    		driver.close();
    		Thread.sleep(2000);
    		driver.switchTo().window(firstwindow6);
    		Thread.sleep(1000);
    	}
  }
  @BeforeTest
  public void beforeTest() {
	   ChromeDriver driver=new ChromeDriver(); 
		
  }

  @AfterTest
  public void afterTest() {
  }

}

