package CityTrasnport;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Attractions
{
	WebDriver wd;
	@Test
	public void f() throws InterruptedException 
	 {
//Search	
		wd.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("las vegas");
		wd.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();

//Location
		wd.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]/div[1]/h4[1]")).click();
		
		wd.findElement(By.cssSelector("body._f938d2630.b4b756386c:nth-child(2) div.css-1lx5ca5 div.css-0 div.css-nu0w0l div.css-hv9uv2 div.css-1lbleqy div.css-uwwqev div.react-swipeable-view-container > div:nth-child(1)")).click();
		
//Calander		
		wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[5]")).click();
		wd.findElement(By.className("css-1s8stxl")); //select button
//Adult		
		wd.findElement(By.className("_082e45fe75")).click();
		wd.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[3]/form[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[2]/button[1]/span[1]")).click();
		
//navigating to home Page
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

