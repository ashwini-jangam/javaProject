package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class different_xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\Chrome\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/interview.php");
		//driver.findElement(By.xpath("//*[@class='responsive-tabs__list']//li[2]")).click();//Relative Xpath
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']//following-sibling::li[3]")).click();//find xpath by using sibling element(search uniquic id element find there sibling element)
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='tablist1-tab3']/parent::ul/li[2]")).click();//find parent node using xpath
		
	}
}
