package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// System.setProperty("webdriver.gecko.driver", "E:\\Testing Material\\webdriver for chrom\\geckodriver.exe");
		 //WebDriver driver = new FirefoxDriver();
		 driver.get("http://www.gmail.com");
		 String S1 = driver.getTitle();
		 String S2 = "Gmail";
		 if(S1.contentEquals(S2))
		 {
			 System.out.println("Title is correct");
			 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/span/span")).click();
			 driver.findElement(By.xpath("//*[@id='initialView']/div[2]/div[3]/div/div/span[1]/div[2]/div")).click();
			 //driver.findElement(By.className("jO7h3c")).click();
				
			
				
		 }
		 else 
		 {
			 System.out.println("Title is Incorrect");

		 }
		 
		
		//driver.close();   
	}

}
