package practise;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		WebElement txtsearch = driver.findElement(By.name("q"));
		Actions action = new Actions(driver);
		action.keyDown(txtsearch,Keys.SHIFT).sendKeys("Java Code").build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
	//	action.keyDown(Keys.CONTROL,"a").build().perform();
		Thread.sleep(5000);
		//action.sendKeys(Keys.CONTROL,"a");
	
		//	txtsearch.sendKeys(Keys.CONTROL,"a");
		//txtsearch.sendKeys(Keys.CONTROL,"c");
		//txtsearch.sendKeys(Keys.CONTROL,"v");
		//txtsearch.sendKeys(Keys.CONTROL,"v");
		
		
		//action.sendKeys(Keys.ARROW_DOWN).build().perform();
		//action.sendKeys(keys)
		//action.sendKeys(Keys.ARROW_DOWN).perform();
		
		//action.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		//action.keyUp(txtsearch,Keys.CONTROL).sendKeys("a").build().perform();
		//action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		//action.keyUp(Keys.CONTROL).sendKeys("a").build().perform();
		//action.sendKeys(Keys.chord(Keys.CONTROL,"a")).perform();
	
		//action.keyDown(Keys.ARROW_DOWN).build().perform();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		
	}

}
