package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Toolpractise_form {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
		driver.get("http://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//Thread.sleep(3000);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Partial Link Test")));
		//driver.findElement(By.partialLinkText("Partial Link Test")).click();
		wait2.until(ExpectedConditions.elementToBeClickable(By.linkText("Link Test")));
		
		//driver.findElement(By.linkText("Link Test")).click();
		driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("XYZ");
		driver.findElement(By.id("sex-1")).click();
		//WebElement element = driver.findElement(By.xpath("//input[@id='exp-0']/ancestor::div[@class='control-group']"));
		//actions.moveToElement(element).click().build().perform();
		//WebDriverWait wait3 = new WebDriverWait(driver, 10);
		//wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='exp-0']/ancestor::div[@class='control-group']")));//not working
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("01-08-2019");
		Thread.sleep(2000);
		driver.findElement(By.id("profession-0")).click();
		driver.findElement(By.id("profession-1")).click();
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		wait4.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Test File")));//not working
		Thread.sleep(3000);
		//wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='tool-1']")));
		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='tool-1']")));//not working
		
		Select continets  = new Select (driver.findElement(By.id("continents")));
		continets.selectByVisibleText("Australia");
		Thread.sleep(3000);
		Select command = new Select (driver.findElement(By.id("selenium_commands")));
		command.selectByVisibleText("WebElement Commands");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).submit();
		
		
		
		
	

	}

}
