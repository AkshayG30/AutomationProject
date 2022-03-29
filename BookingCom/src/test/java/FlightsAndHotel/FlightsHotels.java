package FlightsAndHotel;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FlightsHotels
 {
	WebDriver wd;

	@Test
	public void f() throws InterruptedException
	{
		wd.findElement(By.xpath("//body[1]/header[1]/nav[1]/div[2]/div[6]/a[1]/span[1]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        
		wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]")).click();             
		Thread.sleep(2000);

		wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		
		
		
		
		
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

