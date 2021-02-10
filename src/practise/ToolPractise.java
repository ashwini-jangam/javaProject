package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolPractise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Testing Material\\webdriver for chrom\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
			driver.get("http://www.toolsqa.com/automation-practice-form/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.findElement(By.partialLinkText("Partial Link Test")).click();
			//driver.findElement(By.linkText("Link Test")).click();
			driver.findElement(By.name("firstname")).sendKeys("abc");
			driver.findElement(By.name("lastname")).sendKeys("xyz");
		
		

	}

}
