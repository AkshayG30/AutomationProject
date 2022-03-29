package StaysOption;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Stays
{
	WebDriver wd;
	@Test
	public void f() throws InterruptedException, IOException
	{
		wd.findElement(By.linkText("Stays")) .click();
		Thread.sleep(1000);

		WebElement no1=wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]"));
		no1.click();
		no1.sendKeys("Goa");
		Thread.sleep(4000);
		
//Calender
		wd.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[7]/span[1]")).click();
		wd.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/span[1]")).click();
		wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/label[1]/span[1]")).click();
		
//Adults Or Child
		wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/label[1]/span[2]/span[1]")).click();
		Thread.sleep(2000);
		wd.findElement(By.className("bui-button__text")).click();
		
//Rooms		
		wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/button[2]/span[1]")).click();

//Search		
		wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
		
//Map
		wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]")).click();
		Thread.sleep(4000);
		
		TakesScreenshot tkscrnsh = (TakesScreenshot) wd;
	    WebElement map=wd.findElement(By.xpath("//*[@id='page']/div[1]/div[2]/div/div/picture/img"));
	    File Map= tkscrnsh.getScreenshotAs(OutputType.FILE); //screenshot method.
	    
        TakesScreenshot tc= (TakesScreenshot)wd;
    	File src= tc.getScreenshotAs(OutputType.FILE); //for taking screenshot
		FileUtils.copyFile(src, new File(".\\newphoto.png"));   //importfileutils
		
		wd.findElement(By.className("map_full_overlay__close")).click();
		
//BookVilla
		wd.findElement(By.className("Presidential villa")).click();
		wd.findElement(By.className("bh-photo-grid-thumb-more-inner")).click();
		
		wd.findElement(By.className("bh-photo-modal-grid-image")).click(); ///photo of room
		
		JavascriptExecutor js= (JavascriptExecutor) wd;    
	      js.executeScript("document.body.styles.zoom = '225%';"); //zoomIn
		    Thread.sleep(3000);
		    js.executeScript("document.body.styles.zoom = '50%';"); //zoomOut
		    Thread.sleep(3000);
		    js.executeScript("document.body.styles.zoom = '100%';"); //normal
		    Thread.sleep(3000);
		    
//Printing all Categories
		    WebElement vlu=	wd.findElement(By.xpath("bui-spacer--large"));
			String s=vlu.getText();
			System.out.println("All Catogaries :" + s);  //Fetching text
			Thread.sleep(3000);
			
//Close		    
			wd.findElement(By.id("\n" + "Close")).click();
			
//Refresh Page
			wd.navigate().refresh();
		    wd.navigate().to("https://www.booking.com/searchresults.en-gb.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaGyIAQGYAQm4ARfIAQzYAQHoAQH4AQuIAgGoAgO4Aqvq9JEGwAIB0gIkMzVmMTMzOWEtOTI1Mi00ZTQzLWI3ZTEtYTBjMjdlNjU1ZTli2AIG4AIB&sid=fe9da5d414e0a1541b90462e39a5966e&checkin=2022-03-26&checkout=2022-04-10&dest_id=-2114221&dest_type=city&srpvid=efa41c6b5ebd0040&track_hp_back_button=1#hotel_6815749-back");
	
	}
	
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();

		wd.get("https://www.booking.com/");
		Thread.sleep(4000);
	}


	@AfterTest
	public void afterTest()
	{
		wd.close();
	}
}

