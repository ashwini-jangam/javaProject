package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainClassForPOM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		googleSearch s1 = new googleSearch(driver);
		s1.searchmethod("facebook");
		s1.clickOnLink();
		facebookLogin f1 = new facebookLogin(driver);
		f1.login("ashvinijangam04@gmail.com", "Ashwini@123");
		

	}

}
