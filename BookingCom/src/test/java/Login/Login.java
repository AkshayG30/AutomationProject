package Login;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Login
{
	WebDriver wd;
	@Test
	public void f() throws InterruptedException, IOException
	{
		//for referring the file we want to open
		File f=new File("InputData\\BookingCom.xlsx");

		//for opening the file in read mode
		FileInputStream fis=new FileInputStream(f);

		XSSFWorkbook wk=new XSSFWorkbook(fis);

		//for referring the sheet we want to read
		XSSFSheet sh= wk.getSheet("Sheet1");

		int size1= sh.getLastRowNum(); // last index of sheet 1
		wd.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[2]/div[6]/a[1]/span[1]")).click(); //signin click

		Thread.sleep(2000);
		System.out.println("No. of records are"+size1);


		for (int i=1;i<=size1;i++)
		{
			String u=sh.getRow(i).getCell(0).toString();
			String p=sh.getRow(i).getCell(1).toString();
			System.out.println(u+"     |     "+p);
			//
			wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]")).click();

			WebElement un=wd.findElement(By.name("username"));
			un.sendKeys(u);

			WebElement pw=wd.findElement(By.name("password"));
			pw.sendKeys(p);

			wd.findElement(By.className("Sign in")).click(); //use xpath if not work.


			try
			{
				wd.findElement(By.cssSelector("body.bookings2.b2.index.en.lang_is_ltr.header_reshuffle.no_bg_img.nobg.user_center.app_user_center.landing.lp_flexible_layout.sb_gradient_border.b-sprite-3.ds-traveller-header.lx_cwv_font_swap.bigblue_std_sm.bigblue_std_lg.genius-freebies-ticks.new_genius_branding.lp_body_constraint_static.sb_can_have_advanced_search.system-font.iq-x-bar.iq-x-bar-new.iq-xp-sb._f938d2630:nth-child(2) header.bui-header.bui-header--logo-large.bui-u-hidden-print.bui-header--rounded-tabs:nth-child(5) nav.bui-header__bar div.bui-group.bui-button-group.bui-group--inline.bui-group--align-end.bui-group--vertical-align-middle div.bui-group__item:nth-child(6) div.bui-dropdown.bui-dropdown--end.bui-dropdown--active a.bui-button.bui-button--light.bui-button--active span.bui-button__text div.bui-avatar-block div.bui-avatar.bui-avatar--accent.bui-avatar--outline-accent > img.bui-avatar__image")).click();
				wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				wd.findElement(By.linkText("Sign out")).click();
			}

			catch (Exception e)
			{
				System.out.println("Unknown email address. Check again or try your username");
			}
		}
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
