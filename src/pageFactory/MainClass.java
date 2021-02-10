package pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.googleSearch;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		GoogleSearch s1 = new GoogleSearch(driver);
		s1.sendinput("facebook");
		s1.Keypressmethod();
		s1.clicktoLink();
		
		FacebookLogin f1 = new FacebookLogin(driver);
		f1.clickonlink();
		f1.setuname("ashvinijangam04@gmail.com");
		f1.setpassword("Ashwini@123");
		f1.clicktoLogin();
		

	}

}
