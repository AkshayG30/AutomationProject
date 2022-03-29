package CityTrasnport;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class AirportTaxis
{
	WebDriver wd;
	@Test
	public void f() throws InterruptedException 
	{		
//Source	
		wd.findElement(By.xpath("//body[1]/header[1]/nav[2]/ul[1]/li[6]/a[1]/span[2]")).click();

		wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/input[1]")).click();
		Thread.sleep(3000);
		
//Destination
		wd.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/input[1]")); 
		Thread.sleep(2000);
		
//Calender
		wd.findElement(By.xpath("://body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
		wd.findElement(By.linkText("30")).click();  
		Thread.sleep(3000);

		wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		wd.findElement(By.tagName("select")).click();
		
		Select sel= new Select(wd.findElement(By.tagName("select")));
		sel.selectByIndex(3);
		wd.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]")).click();
		
		WebElement no5=wd.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]"));
		no5.click();
		no5.sendKeys("10");
		Thread.sleep(3000);
        
		wd.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]/span[1]")).click();
		Thread.sleep(4000);
		
//Choosing Taxi
		wd.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/form[1]/div[1]/div[1]/button[2]/svg[1]/path[1]"));
		Actions act=new Actions(wd);
		act.doubleClick().perform();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]")).click();

//Add My Turn
		wd.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/form[1]/div[2]/div[2]/button[1]/span[1]")).click();

//Search My Turn
		wd.findElement(By.xpath("//body[1]/div[2]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		
//Fetching the Prize
	    WebElement prz =wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/p[1]"));
     	String s=prz.getText();
		System.out.println("All Catogaries :" + s);  //Fetching text
		Thread.sleep(3000);
		
//Navigating to Home Page
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

