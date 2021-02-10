package TestNG;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_Googleseach {
	public String baseurl = "http://www.google.com";
	String drivepath = "E:\\\\Testing Material\\\\webdriver for chrom\\\\Chrome\\\\chromedriver.exe";
	public WebDriver driver;
	
	@BeforeTest
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", drivepath);
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		
	}
	@Test
	public void searchdata() throws InterruptedException 
	{
		WebElement txtsearch = driver.findElement(By.xpath("//input[@title='Search']"));
		txtsearch.sendKeys("Java Code");
		WebElement googlesearch = driver.findElement(By.xpath("//div[@class='UUbT9']"));// take Xpath of Table 
		Thread.sleep(2000);
		List<WebElement> SearchResultList = googlesearch.findElements(By.tagName("span"));// Find xpath of span Tag
		Iterator<WebElement> itr = SearchResultList.iterator();
		while(itr.hasNext())
		{
			WebElement SearchList = itr.next();
			System.out.println(  SearchList.getText());
		}
		
	}
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}

	

}
