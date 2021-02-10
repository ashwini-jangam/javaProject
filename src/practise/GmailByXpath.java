package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailByXpath {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebElement txtpassword,txtuname;
		//System.setProperty("webdriver.gecko.driver", "E:\\Testing Material\\webdriver for chrom\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ashwini.midbraintech@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(8000);
		//driver.findElement(By.name("password")).sendKeys("Ashwini@123");
		//driver.findElement(By.xpath("//input[@name='password']/ancestor::div[@class='Xb9hP']")).sendKeys("Ashwini@123");
		txtpassword=driver.findElement(By.xpath("//input[@name='password']"));
		txtpassword.sendKeys("Ashwini@123");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//span[@class='RveJvd snByac']/ancestor::div[@id='idvanyphonecollectNext']")).click();
		
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("jangam.ashwini04@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("testing");
		driver.findElement(By.xpath("//div[@id=':ay']")).sendKeys("hiiii");
		driver.findElement(By.xpath("//div[@role='button']/ancestor::div[@class='dC']")).click();
		
		

	}

}
