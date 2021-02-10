package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch {
	public WebDriver driver ;
	@FindBy(name ="q")
	WebElement txtsearch ;
	
	@FindBy(css="[class='ad_cclk']")
	WebElement searchlink ; 
	
	public GoogleSearch(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void sendinput(String input) {
		txtsearch.sendKeys("facebook");
		
	}
	public void Keypressmethod() {
		txtsearch.sendKeys(Keys.ENTER);
		
	}
	public void clicktoLink() {
		searchlink.click();
	}
}
