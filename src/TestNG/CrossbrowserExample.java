package TestNG;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossbrowserExample {
	 public WebDriver driver;
	 @Parameters("browser")
	@BeforeClass
	public void browserlaunch( String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Testing Material\\webdriver for chrom\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get("http://www.google.com");
	}
	
  @Test
  public void Testone() {
	  
	  driver.findElement(By.name("q")).sendKeys("Selenium webdriver");
  }
}
