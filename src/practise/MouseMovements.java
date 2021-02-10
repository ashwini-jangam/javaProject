package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovements {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Material\\webdriver for chrom\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement source_element  = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement destination_element = driver.findElement(By.xpath("//li[@class='placeholder']//ancestor::div[@class='shoppingCart']//ol[@id='amt7']"));
		Actions action = new Actions(driver);
		//action.dragAndDrop(source_element, destination_element).build().perform();//Drag and drop elements
		/*action.clickAndHold(source_element).build().perform();
		Thread.sleep(2000);
		action.moveToElement(destination_element).build().perform();
		Thread.sleep(1000);
		action.release(destination_element).build().perform();
		Thread.sleep(3000);
		action.contextClick(driver.findElement(By.xpath("//a[@class='button button-orange']//ancestor::li[@id='credit3']"))).build().perform();
		action.doubleClick(driver.findElement(By.xpath("//a[@class='button button-orange']//ancestor::li[@id='credit1']"))).build().perform();
		*/
		/* Point pt = destination_element.getLocation() ; 
		 int x = pt.getX();
		 int y =pt.getY();
		 System.out.println(x +" " + y);*/
		// action.moveByOffset(530, 382).contextClick().perform();
		// action.moveToElement( source_element, 530, 382).perform();//Not working
		 action.clickAndHold(source_element).moveByOffset(-50, 260).release().build().perform();
		
	
	}

}
