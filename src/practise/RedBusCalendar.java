package practise;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.sql.Date;
import java.text.DateFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBusCalendar {

	
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\chromedriver.exe");
		String selectdate = "21/Aug 2020";

		String date,monthYear;
		String Caldate,calyear;
	
		String dateArray[] = selectdate.split("/");
		date = dateArray[0];
		monthYear= dateArray[1];
		 		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(8000);
		WebElement Selectdate = driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']"));
		Selectdate.click();//Calendar Click
		
		// to move next in calendar
		/* Select Month and Year*/
	   calyear = driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]//tr[1]//td[2]")).getText();
	   if(!monthYear.contentEquals(calyear))//check condition for same month Date
	   {
		   
		while(!calyear.contentEquals(monthYear))
		{
		
			driver.findElement(By.xpath("//button[text()='>']/ancestor::div[@class='rb-calendar']//td[@class='next']")).click();//next Button click
			calyear = driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]//tr[1]//td[2]")).getText();//get text of month&year
				
		}
	   }
	   
		/*  Select date  */ 
		WebElement cal = driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/ancestor::div[@id='rb-calendar_onward_cal']"));//Calendar Table 
		List<WebElement> rows,cols;
		rows = cal.findElements(By.tagName("tr"));//tr Tag of table
		//System.out.println(rows);
		 for(int i=1; i < rows.size(); i++)
		 {
			 cols = rows.get(i).findElements(By.tagName("td"));//td tag of table
			 for( int j= 0 ; j < cols.size() ; j++)
			 {
				 Caldate = cols.get(j).getText();
				 if(Caldate.equals(date))
				 {
					 cols.get(j).click();
					 break;
				 }
			 }
		 }
		/* String selectprevdate = "07/Aug 2019";
		 String prevdate,prevmonthYear;
		 String prevCaldate,prevcalyear;
		 String prevdateArray[] = selectprevdate.split("/");
		 prevCaldate =prevdateArray[0];
		 prevmonthYear = prevdateArray[1];
		//Thread.sleep(2000);
		  //driver.findElement(By.xpath("//button[text()='>']/ancestor::div[@class='rb-calendar']//td[@class='next']")).click();
		  Thread.sleep(3000);
			
		  WebElement prevbtn = driver.findElement(By.xpath("//button[text()='<']//ancestor::div[@id='rb-calendar_onward_cal']//td[@class='prev']"));
		  if(prevbtn.isDisplayed())
		  {
			  String calpreyear =  driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]//tr[1]//td[1]")).getText();
			//System.out.println(calpreyear);
			   while (!calpreyear.equals(prevmonthYear))
			 {
				 driver.findElement(By.xpath("//button[text()='>']/ancestor::div[@class='rb-calendar']//td[@class='prev']")).click();//next Button click
				 calpreyear = driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]//tr[1]//td[1]")).getText();//get text of month&year
				System.out.println(calpreyear);	
			 }
			   WebElement cal = driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/ancestor::div[@id='rb-calendar_onward_cal']"));//Calendar Table 
				List<WebElement> rows,cols;
				rows = cal.findElements(By.tagName("tr"));//tr Tag of table
				//System.out.println(rows);
				 for(int i=1; i < rows.size(); i++)
				 {
					 cols = rows.get(i).findElements(By.tagName("td"));//td tag of table
					 for( int j= 0 ; j < cols.size() ; j++)
					 {
						 prevdate = cols.get(j).getText();
						 if(prevdate.equals(prevCaldate))
						 {
							 cols.get(j).click();
							 break;
						 }
					 }
				 }
		  }*/
		  
	
	}

}
