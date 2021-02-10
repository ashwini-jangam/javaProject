package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.*;
public class GmailWindowHandler {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "E:\\Testing Material\\webdriver for chrom\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement Linkgmail = driver.findElement(By.className("gb_e"));
		Linkgmail.click();
		 WebElement signupLink = driver.findElement(By.xpath("//a[@href='https://accounts.google.com/AccountChooser?service=mail&continue=https://mail.google.com/mail/']/ancestor::div[@class='h-c-header__cta']"));
		 signupLink.click();
		 
		 String MainWindow = driver.getWindowHandle();
		 
		 Set<String> s1 = driver.getWindowHandles();
		 Iterator<String> itr = s1.iterator();
		 while(itr.hasNext())
		 {
			 String childwindow = itr.next();
			 if(!MainWindow.equalsIgnoreCase(childwindow))
			 {
				 driver.switchTo().window(childwindow);
				 Thread.sleep(3000);
					
				 driver.findElement(By.xpath("//div[text()='Sign in instead']/ancestor::div[1]")).click();
				 driver.findElement(By.name("identifier")).sendKeys("jangam.ashwini12@gmail.com");
				 driver.findElement(By.xpath("//span[@class='RveJvd snByac']/ancestor::div[@id='identifierNext']")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.name("password")).sendKeys("rama30467");
				 driver.findElement(By.xpath("//span[@class='RveJvd snByac']//ancestor::div[@id='passwordNext']")).click();
				 driver.close();
				 
			 }
			 driver.switchTo().window(MainWindow);
		 }
		 
		 
		

	}

}
