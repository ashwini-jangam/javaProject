package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPractiseByxpath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashvinijangam04@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc@1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@id='not_me_link']")).click();
		//driver.findElement(By.xpath("//a[@role='button']/ancestor::div[@class='signup_box clearfix']")).click();
		//driver.findElement(By.xpath("//a[@role='button'/ancestor::div[@class='_xkt']")).click();
		//driver.findElement(By.xpath("//a[@href='/r.php?locale=en_GB']")).click();
		driver.findElement(By.xpath("//a[@id='reg-link']/ancestor::div[@class='_xkv fsm fwn fcg']")).click();    //Worked
		driver.findElement(By.xpath("//input [@name='firstname']")).sendKeys("Ashwini");
		driver.findElement(By.xpath("//input [@name='lastname']")).sendKeys("Jangam");
		driver.findElement(By.xpath("//input [@name='reg_email__']")).sendKeys("ashvinijangam04@gmail.com");
	}

}
