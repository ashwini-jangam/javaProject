package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.*;

public class Checkboxassingment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\Chrome\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
	
		driver.get("http://qaclickacademy.com/practice.php");
		//driver.findElement(By.id("checkBoxOption1"))args;
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
	//	System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());//assertion is used to run our code smoothly 
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();//to uncheck the checkbox
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	

	}

}
