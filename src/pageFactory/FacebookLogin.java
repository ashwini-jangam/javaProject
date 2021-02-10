package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLogin {
public WebDriver driver;
@FindBy(css="input[value='Log In to Existing Account']")
WebElement btnexistinglogin; 
@FindBy(id="email")
WebElement uname ;
@FindBy(id="pass")
WebElement pass; 
@FindBy(css="input[value='Log In']")
WebElement btnlogin;

public FacebookLogin( WebDriver driver)
{
	this.driver =driver;
	PageFactory.initElements(driver, this);
}
public void clickonlink() {
	btnexistinglogin.click();
}
public void setuname(String struname) {

	uname.sendKeys(struname);
	uname.sendKeys(Keys.TAB);
	
}
public void setpassword(String strpassword) {
	pass.sendKeys(strpassword);
}

public void clicktoLogin() {
	btnlogin.click();
}

}
