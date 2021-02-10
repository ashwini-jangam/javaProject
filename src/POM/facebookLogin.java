package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class facebookLogin {
	public WebDriver driver;
	By loginlink = By.cssSelector("input[value='Log In to Existing Account']");
	By uname_locator = By.id("email");
	By password_locator = By.id("pass");
	By btnlogin = By.cssSelector("input[value='Log In']");

	public facebookLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public void login(String uname, String password)
	{
		driver.findElement(loginlink).click();
		driver.findElement(uname_locator).sendKeys(uname);
		driver.findElement(uname_locator).sendKeys(Keys.TAB);
		driver.findElement(password_locator).sendKeys(password);
		driver.findElement(btnlogin).click();
		
	}

}
