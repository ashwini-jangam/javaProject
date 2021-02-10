package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnabledorDisable_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\Chrome\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
	
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//driver.findElement(By.id("Div1")).isEnabled();
		
		// we can check element is enable or disable by using isEnabled() but some application not support that function, 
		//beacuse of that element can be enable on click on it so selenium get confuse and doesn't respond on it thats why we use another code.
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Its Enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

	}

}
