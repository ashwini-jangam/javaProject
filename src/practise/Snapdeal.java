package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdeal {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "E:\\Testing Material\\webdriver for chrom\\geckodriver.exe");
	//	WebDriver driver =  new FirefoxDriver();
				
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement linksignin , btnlogin_withoutpassword,linklogin,txtuname,btncontinue, txtmobile ,txtname,txtdob,txtpassword ,btnsingin,btnregister;
		linksignin= driver.findElement(By.xpath("//span[text()='Sign In']"));
		linksignin.click();
	    WebDriverWait wait = new WebDriverWait(driver, 50);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='login']"))).click();		
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		txtuname = driver.findElement(By.xpath("//input[@name='username']"));
		txtuname.sendKeys("jangam.ashwini12@gmail.com");
		btncontinue = driver.findElement(By.xpath("//button[@id='checkUser']"));
		btncontinue.click();
		Thread.sleep(5000);
		
		//txtpassword=driver.findElement(By.xpath("//input[@id='j_password_login_uc']"));
		//txtpassword.sendKeys("Ashwini@1");
		//btnsingin = driver.findElement(By.xpath("//button[@id='submitLoginUC']"));
		//btnsingin.click();

		btnlogin_withoutpassword = driver.findElement(By.xpath("//button[text() ='Login Without Password']"));
		btnlogin_withoutpassword.click();
		Thread.sleep(25000);
		driver.findElement(By.id("loginUsingOtp")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@class='hidden imgUser']/ancestor::div[@class='accountInner']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		/* **** Resgister Test Code *** */
		
		/*
		 linkregister = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		 linkregister.click();
		 txtuname = driver.findElement(By.xpath("//input[@name='username']"));
		txtuname.sendKeys("jangam.ashwini12@gmail.com");
		btncontinue = driver.findElement(By.xpath("//button[@id='checkUser']"));
		btncontinue.click();
		
		txtmobile= driver.findElement(By.xpath("//input[@id='j_number']"));
		txtmobile.sendKeys("9156004431");
		txtname= driver.findElement(By.xpath("//input[@id='j_name']"));
		txtname.sendKeys("Ashwini ");
		//Thread.sleep(8000);
		txtdob= driver.findElement(By.xpath("//input[@id='j_dob']"));
		txtdob.sendKeys("12/04/1992 ");	
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("//th[text()='«']/ancestor::div[@class='datepicker-days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//th[@class='prev']/ancestor::div[@class='datepicker-days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Apr']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='12']")).click();*/
		
		/*txtpassword= driver.findElement(By.xpath("//input[@id='j_password']"));
		txtpassword.sendKeys("Ashwini@1 ");
		//Thread.sleep(8000);
		btnsingin =driver.findElement(By.xpath("//button[@id='userSignup']"));
		btnsingin.click();
		Thread.sleep(15000);
		btnregister = driver.findElement(By.xpath("//button[@id='registerUser']"));
		btnregister.click();*/
		
		
		


	}

}
