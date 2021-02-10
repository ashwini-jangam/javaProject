package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/Resonancia NOtes/Webdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Ashwini");
		driver.findElement(By.name("lastname")).sendKeys("Jangam");
		driver.findElement(By.name("reg_email")).sendKeys("9254613541");
		Select s = new Select(driver.findElement(By.id("day")));
		String day = driver.findElement(By.xpath("//option[text()='20']")).getText();
		s.selectByValue(day);
	//	s.selectByIndex();
		//s.selectByVisibleText();
		
	}
}
