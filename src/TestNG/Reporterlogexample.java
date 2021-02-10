package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporterlogexample {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\Chrome\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Broweser getting open");
	  driver.manage().window().maximize();
	  Reporter.log("Browser windoe miximized");
	  driver.get("http://www.google.com");
	  Reporter.log("google is open");
	  driver.findElement(By.name("q")).sendKeys("Java");
	  Reporter.log("Input  \"Java\"sent");
  }
}
