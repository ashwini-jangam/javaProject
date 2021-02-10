package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class googleSearch {
	public WebDriver driver;
	By txtsearch = By.name("q");
	//By searchlinkresult = By.xpath("//div[@class='ellip']//ancestor::*[@id='rso']/div[1]/div/div/div[1]/div[1]/a");
	By searchlinkresult = By.cssSelector("[class='ad_cclk']");
	
	
	public googleSearch(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void searchmethod( String keywords) {
		driver.findElement(txtsearch).sendKeys(keywords);
		driver.findElement(txtsearch).sendKeys(Keys.ENTER);
		
	}
	public void clickOnLink() throws InterruptedException {
		
		driver.findElement(searchlinkresult).click();
		
	}
	
}
