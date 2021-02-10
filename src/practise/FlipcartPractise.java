package practise;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

@Listeners(TestNG.ListnerTest.class)

public class FlipcartPractise {

	
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver", "E:\\Testing Material\\webdriver for chrom\\geckodriver.exe");
		//WebDriver driver =  new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "E://Resonancia NOtes//Webdriver//chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
	
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement login,txtuname, txtpassword,btnlogin , txtsearch,btnsearch ,imgproduct, btnaddcart; 
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
		//Implicit Wait 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[text()='Login & Signup']")).click();
		//Thread.sleep(8000);
		 txtuname = driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']/ancestor::div[1]//input"));
		 txtuname.sendKeys("9156004431");
		
		 txtpassword= driver.findElement(By.xpath("//input[@type='password']"));
		 txtpassword.sendKeys("rama30467");
		 btnlogin= driver.findElement(By.xpath("//span[text()='Login']/ancestor::button[@type='submit']"));
		 btnlogin.click();
		 Thread.sleep(10000);
		 txtsearch = driver.findElement(By.xpath("//input[@name='q']"));
		 txtsearch.sendKeys("bags");
		 Thread.sleep(2000);
		 btnsearch = driver.findElement(By.xpath("//button[@type='submit']"));
		 btnsearch.click();
		 Thread.sleep(2000);
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
				
		 }
	//	 WebDriverWait wait = new WebDriverWait(driver, 30) ;
		 Thread.sleep(5000);
		 driver.findElement(By.linkText("Logout")).click();
		

	}

}
