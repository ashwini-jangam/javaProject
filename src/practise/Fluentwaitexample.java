package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwaitexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\Chrome\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
	
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement login,txtuname, txtpassword,btnlogin , txtsearch,btnsearch ,imgproduct, btnaddcart; 
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Login & Signup']")).click();
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(3, TimeUnit.SECONDS);
		wait.withTimeout(30,  TimeUnit.SECONDS);
		WebElement S =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Enter Email/Mobile number']/ancestor::div[1]//input")));
		S.sendKeys("9156004431");

	}

}
