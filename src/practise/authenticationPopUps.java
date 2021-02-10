package practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationPopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\Chrome\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
			
		//driver.get("https://www.flipkart.com/");
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String Text = driver.findElement(By.cssSelector("p")).getText();
		System.out.println(Text);
		
	}

}
