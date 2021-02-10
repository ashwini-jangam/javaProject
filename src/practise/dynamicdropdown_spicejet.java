package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dynamicdropdown_spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\Chrome\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
	
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();// css selector with regular expression
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());//assert to check boolean conditions
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		// css selector contain tagname ,attributr and thire value . we can use css selector without using tag name.
		

		/*  Dyanamic Dropdown code */
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click();// using index in xpath  is not accepted by some client 
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']")).click();
		// above is Parent child relationship xpath it is another way to find xpath in dynaamic dropdown.
	
		/*  **********     */ 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("*[class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();// select current date from calendar
		Thread.sleep(3000);
		driver.findElement(By.id("divpaxinfo")).click();//click on  Passengers
		Thread.sleep(2000);
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
			i++;
		}
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");// assert to check value 
		
		for (int j = 1; j < 3; j++) {
			driver.findElement(By.id("hrefIncChd")).click();
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(2000);
		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s1.selectByValue("USD");
	
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		
		
	}

}
