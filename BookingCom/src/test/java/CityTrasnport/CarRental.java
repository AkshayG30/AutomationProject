package CityTrasnport;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class CarRental
{
	WebDriver wd;
	@Test
	public void f() throws InterruptedException 
	{
		wd.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[2]/ul[1]/li[4]/a[1]")).click();
		WebElement no1=wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/label[1]"));
		no1.click();
		no1.sendKeys("pune");
		
		wd.findElement(By.className("c-autocomplete__item sb-autocomplete__item sb-autocomplete__item-with_photo sb-autocomplete__item__item--elipsis sb-autocomplete__item--icon_revamp sb-autocomplete__item--district ")).click();
		Thread.sleep(3000);
		
//Calender
		wd.findElement(By.className("30")).click();
		wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/span[1]")).click();
		wd.findElement(By.className("sb-searchbox__button ")).click(); //searchbutton
		
//Availability of cars
		WebElement result=	wd.findElement(By.className("bui-f-font-display_two bgui-u-mb-medium"));
		String s=result.getText();
		System.out.println("Car Available ?:" + s);  //Fetching text
		Thread.sleep(3000);
		
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