package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertSample {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		 
		WebElement custId , btnsubmit;
		//Explicit wait can be apply to multiple element 
		/* WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cusid"))).sendKeys("cusid");//xpath("//img[@src='https://rukminim1.flixcart.com/image/495/594/jvy4vbk0/sari/s/x/b/free-surbhi-navy-blue-red-indian-beautiful-original-imafgqenayuzsngt.jpeg?q=50']"))).click();
		*/
		custId = driver.findElement(By.name("cusid"));
		custId.sendKeys("12345");
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Submit']"))).click();//xpath("//img[@src='https://rukminim1.flixcart.com/image/495/594/jvy4vbk0/sari/s/x/b/free-surbhi-navy-blue-red-indian-beautiful-original-imafgqenayuzsngt.jpeg?q=50']"))).click();
			
		btnsubmit = driver.findElement(By.xpath("//input[@value='Submit']"));
		btnsubmit.click();
		Thread.sleep(3000);
		String confirmationmessage = driver.switchTo().alert().getText();
		System.out.println(confirmationmessage);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		
		String deletmessage = driver.switchTo().alert().getText();
		System.out.println(deletmessage);
		
		driver.switchTo().alert().accept();
		
		driver.close();
		
		

	}

}
