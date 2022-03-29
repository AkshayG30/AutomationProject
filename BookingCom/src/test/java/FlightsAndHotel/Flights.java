package FlightsAndHotel; 

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Flights
{
	WebDriver wd;
	@Test
	public void f() throws InterruptedException 
	{
		WebElement fltbtn=wd.findElement(By.className("Flights"));
		fltbtn.click();
		WebElement onwy=wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/div[1]/div[1]/div[1]"));
		onwy.click();	
		
		wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/span[1]/div[1]/div[1]/div[1]")).click();
		wd.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/svg[1]")).click();
	
//london
		wd.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("LON");
		Thread.sleep(3000);

//delhi
		wd.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[2]/div[1]/label[1]/input[1]")).click();
		wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/span[1]/div[1]/div[1]/input[1]")).sendKeys("DEL");
		wd.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[2]/div[1]/label[1]/input[1]")).click();

//calender
		wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		wd.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]")).click();

		wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/span[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).click();
		wd.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/span[1]")).click();
	
//class
		Select trvlcls  =new Select(wd.findElement(By.tagName("select")));  //DragAndDrop 
		trvlcls.selectByVisibleText("Business");
	
//adult
		wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span[1]/div[1]")).click();
		Thread.sleep(3000);
		wd.findElement(By.tagName("button")).click();

//search
		wd.findElement(By.linkText("Search")).click(); //Button

//choose ticket
		wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/button[1]/span[1]/span[1]")).click();
		WebDriverWait wait= new WebDriverWait(wd,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/button[1]/span[1]/span[1]"))).click();

		JavascriptExecutor js = (JavascriptExecutor) wd;  //Scrolling Down
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(6000);

//flightbook
		wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]")).click();
		wd.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]/span[1]")).click();

		WebElement vlu=	wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]"));
		String s=vlu.getText();

		System.out.println("Total Prize :" + s);  //Fetching Prize
		Thread.sleep(3000);
		
		wd.navigate().back();  //back to main page
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

