package practise;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sanpdealAddtoCart {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "E:\\Testing Material\\webdriver for chrom\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\Chrome\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
	
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement btnlogin =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='login']")));
		btnlogin.click();//click on login button
	    
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("loginIframe"));// switch on frame
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("jangam.ashwini12@gmail.com");// add user id
		driver.findElement(By.xpath("//button[@id='checkUser']")).click();//clickon countinue button
		driver.findElement(By.id("sendOtpUC")).click();// signup without login button
		Thread.sleep(25000);
		driver.findElement(By.id("loginUsingOtp")).click();// signup without login button
		
		driver.switchTo().defaultContent();
		//WebElement txtsearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputValEnter")));
		//txtsearch.sendKeys("Sarees");//find item
		Thread.sleep(3000);
		driver.findElement(By.id("inputValEnter")).sendKeys("Sarees");
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();// click on search
		Thread.sleep(5000);
		//driver.findElement(By.className("sd-input")).sendKeys("440027");
	//	driver.findElement(By.className("pincode-check")).click();
		driver.findElement(By.xpath("//img[@title='Kalpana Creation Red Art Silk Saree']//ancestor::div[@class='product-tuple-image ']")).click();
		String Mainwindow = driver.getWindowHandle();
	    Set<String> s1 = driver.getWindowHandles();
	    Iterator<String> i1 =s1.iterator();
	    while(i1.hasNext())
	    {
	    	String  Childwindow = i1.next();
	    	  if(!Mainwindow.equalsIgnoreCase(Childwindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(Childwindow);	                                                                                                           
	                    driver.findElement(By.id("add-cart-button-id")).click();
	                    driver.findElement(By.className("cartTextSpan")).click();
	            		Thread.sleep(5000);
	            		driver.findElement(By.className("remove-item-shortlist")).click();
	            		Thread.sleep(2000);
	            		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign']//ancestor::div[@class='cart-heading clearfix']")).click();
	            		Thread.sleep(3000);
	            		driver.close();// closing child window
	         	    	
	            } 
	    	 
	    }
	    driver.switchTo().window(Mainwindow);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@class='hidden imgUser']/ancestor::div[@class='accountInner']")).click();
	   Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    Thread.sleep(5000);
	    driver.close();
  		

	}

}
