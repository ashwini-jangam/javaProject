package TestNG;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG.ListnerTest.class)
public class FlipkartTestNG {
	public String baseurl = "https://www.flipkart.com/";
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
	
  @Test (priority = 0)
  public void Login() throws InterruptedException 
  {
	  WebElement txtuname, txtpassword,btnlogin; 
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Login & Signup']")).click();
		//Thread.sleep(8000);
		 txtuname = driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']/ancestor::div[1]//input"));
		 txtuname.sendKeys("9156004431");
		
		 txtpassword= driver.findElement(By.xpath("//input[@type='password']"));
		 txtpassword.sendKeys("rama30467");
		 btnlogin= driver.findElement(By.xpath("//span[text()='Login']/ancestor::button[@type='submit']"));
		 btnlogin.click();
		  Thread.sleep(3000);
		  System.out.println("Flipkart Login method"+Thread.currentThread().getId());
			
		
  }
  
  @Test (priority = 1)
  public void SearchItem() throws InterruptedException
  {
	   
	  WebElement txtsearch = driver.findElement(By.xpath("//input[@name='q']"));
		 txtsearch.sendKeys("bags");
		 Thread.sleep(5000);
		WebElement btnsearch = driver.findElement(By.xpath("//button[@type='submit']"));
		 btnsearch.click();
		 Thread.sleep(3000);
		 System.out.println("Flipkart Search "+Thread.currentThread().getId());
			
		
  }
  @Test (priority = 2)
  public void addToCartItem() throws InterruptedException
  {
	  driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/image/495/594/jkcwakw0/backpack/c/j/f/15-6-inch-hp-bag-laptop-backpack-hp-original-imaf7qchgabbdn93.jpeg?q=50']")).click();
		 String Mainwindow = driver.getWindowHandle();
		 Set<String> S1 = driver.getWindowHandles();
		 Iterator<String> i1 = S1.iterator();
		 while(i1.hasNext())
		 {
			 String childWindow = i1.next();
			 if(!Mainwindow.equalsIgnoreCase(childWindow))
			 {
				 driver.switchTo().window(childWindow);
				// driver.findElement(By.xpath("//a[text()='10']")).click();
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//div[text()='Remove']")).click();
				 driver.findElement(By.xpath("//div[@class='gdUKd9 _3Z4XMp _2nQDKB']")).click(); //remove popup click
				 
				 Thread.sleep(3000);
				 driver.close();// closing child window
			
			 }
			 driver.switchTo().window(Mainwindow);
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//div[text()='My Account']//ancestor::div[@class='_1jcwFN _3dmQRh']")).click();
			 System.out.println("Flipkart Add to cart "+Thread.currentThread().getId());
				
				
		 }
}
		 @Test (priority = 3)
		 public void Logout() throws InterruptedException
		 {
			 Thread.sleep(3000);
			 driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			 System.out.println("Flipkart Logout"+Thread.currentThread().getId());
				
		 }
		 
  
  @AfterTest
  public void CloseBrowser()
  {
	 
	  driver.close();
  }
  
}
