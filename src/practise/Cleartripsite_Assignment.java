package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cleartripsite_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\Chrome\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
	
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("*[class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		Select S1 = new Select(driver.findElement(By.cssSelector("*[id='Adults']")));
		S1.selectByValue("4");
		Select S2 = new Select(driver.findElement(By.id("Childrens")));
		S2.selectByValue("3");
		Select S3 = new Select(driver.findElement(By.id("Infants")));
		S3.selectByValue("1");
		Thread.sleep(2000);
		driver.findElement(By.id("MoreOptionsDiv")).click();
		Select S4 = new Select(driver.findElement(By.id("Class")));
		S4.selectByIndex(3);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Air india");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		

	}

}
