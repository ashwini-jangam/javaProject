package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio_Checkboxbutton {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Ashwini");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Bhagat");
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("jangam.ashwini12@gmail.com");
		Thread.sleep(3000);
		WebElement confirmEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		confirmEmail.sendKeys("jangam.ashwini12@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("Ashwini1234");
		Select day =new Select( driver.findElement(By.xpath("//select[@name='birthday_day']")));
		day.selectByValue("12");
		Thread.sleep(2000);
		Select month =new Select( driver.findElement(By.xpath("//select[@name='birthday_month']")));
		month.selectByIndex(4);
		Thread.sleep(2000);
		Select Year =new Select( driver.findElement(By.xpath("//select[@name='birthday_year']")));
		Year.selectByVisibleText("1992");
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}

}
